package com.FATEC.LES;

import android.app.DatePickerDialog;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.SimpleCursorAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.FATEC.LES.DAO.Contrato;
import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;
import com.FATEC.LES.Helper.SpinnerDataContainer;
import com.FATEC.LES.Helper.TableViewAdapter;
import com.FATEC.LES.Model.Duplicata;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class DuplicatasActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{

    private DBHelper dbHelper = new DBHelper(this);
    TextView etxtData;
    Date dataPesq;
    Calendar data = Calendar.getInstance();
    QueriesHelper qh = new QueriesHelper();
    ArrayList<Duplicata> dups = null;
    RecyclerView recyclerView;
    TableViewAdapter tableAdapter = null;

    Integer id, id_emi, id_cli, status, fpag;
    String dtemi;
    Double valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duplicatas);
        etxtData = findViewById(R.id.txtDatePicker);

        etxtData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDatePickerDialog();
            }
        });

        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());

        final EditText etxtId, etxtIdCli;
        etxtId = findViewById(R.id.etxtDuplicata);
        etxtIdCli = findViewById(R.id.etxtCLiente);

        final Spinner spiStatus, spiParcela, spiEmitente;


        spiStatus = (Spinner) findViewById(R.id.spiStatus);
        spiParcela = (Spinner) findViewById(R.id.spiTipo);
        spiEmitente = (Spinner) findViewById(R.id.spi_Emissor);

// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter;
        adapter = ArrayAdapter.createFromResource(this,
                R.array.status_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spiStatus.setAdapter(adapter);

        adapter = ArrayAdapter.createFromResource(this,
                R.array.parcela_array, android.R.layout.simple_spinner_item);
        spiParcela.setAdapter(adapter);

        ArrayList<String> emiSpi = qh.spinnerEmitente(dbHelper);
        adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, emiSpi);
        spiEmitente.setAdapter(adapter);

        ImageButton btnPesq = findViewById(R.id.btnPesq);

        recyclerView = findViewById(R.id.recyclerViewList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        btnPesq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if( !etxtId.getText().toString().isEmpty()){
                    id = Integer.parseInt(etxtId.getText().toString());
                }
                else{
                    id = null;
                }

                if(!etxtIdCli.getText().toString().isEmpty()){
                    id_cli = Integer.parseInt(etxtIdCli.getText().toString());
                }
                else{
                    id_cli = null;
                }

                if(spiEmitente.getSelectedItemPosition() != 0){
                    id_emi = spiEmitente.getSelectedItemPosition();
                }
                else{
                    id_emi = null;
                }

                if(spiStatus.getSelectedItemPosition() != 0){
                    status = spiStatus.getSelectedItemPosition();
                }
                else{
                    status = null;
                }

                if(spiParcela.getSelectedItemPosition() != 0){
                    fpag = spiParcela.getSelectedItemPosition();
                }
                else{
                    fpag = null;
                }
                if(etxtData.getText().toString().compareTo("00/00/0000") != 0){
                    dataPesq = data.getTime();
                }
                else{
                    dataPesq = null;
                }
                getDuplicatas();
                //action
                if(dups.size() > 0){
                    Toast.makeText(DuplicatasActivity.this, "Encontrados: " + dups.size(), Toast.LENGTH_SHORT).show();
                    tableAdapter = new TableViewAdapter(getDuplicatas(), DuplicatasActivity.this);
                    recyclerView.setAdapter(tableAdapter);
                }
                else{
                    Toast.makeText(DuplicatasActivity.this, "nada encontrado", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }

    private List<Duplicata> getDuplicatas() {
        List<Duplicata> duplicatas = new ArrayList<>();
        Integer i = 1;
        dups = qh.selectDuplicata(dbHelper, id, id_emi, id_cli, status, dataPesq, fpag);
        System.out.println("Tamanho: " + dups.size());
        while(i <= dups.size()){
            System.out.println("ID dup: " + dups.get(i-1).getDup_Id_Duplicata());
            duplicatas.add(new Duplicata(dups.get(i-1).getDup_Id_Duplicata(), dups.get(i-1).getDup_Emitente(), dups.get(i-1).getDup_Cliente()));
            duplicatas.get(i-1).setDup_Status(dups.get(i-1).getDup_Status());
            duplicatas.get(i-1).setDup_Data_Emissao(dups.get(i-1).getDup_Data_Emissao());
            duplicatas.get(i-1).setDup_Forma_Pag(dups.get(i-1).getDup_Forma_Pag());
            duplicatas.get(i-1).setDup_Valor(dups.get(i-1).getDup_Valor());
            i++;
        }
        return duplicatas;
    }

    private void showDatePickerDialog(){
        DatePickerDialog datePickerDialog = new DatePickerDialog(
                this,
                this,
                Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH)
        );
        datePickerDialog.show();
    }

    @Override
    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
        etxtData.setText(dayOfMonth + "/" + month + "/"+ year);
        data.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        data.set(Calendar.MONTH,month);
        data.set(Calendar.YEAR,year);
        data.set(Calendar.HOUR_OF_DAY, 0);
        data.set(Calendar.MINUTE, 0);
        data.set(Calendar.SECOND, 0);
        data.set(Calendar.MILLISECOND,0);
    }
}
