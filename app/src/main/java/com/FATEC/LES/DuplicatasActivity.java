package com.FATEC.LES;

import android.app.DatePickerDialog;
import android.content.Context;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DuplicatasActivity extends AppCompatActivity implements DatePickerDialog.OnDateSetListener{
    private DBHelper dbHelper = new DBHelper(this);
    TextView etxtData;
    Date dataPesq;
    Calendar data = Calendar.getInstance();
    QueriesHelper qh = new QueriesHelper();

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

        EditText etxtId, etxtIdCli;
        etxtId = findViewById(R.id.etxtDuplicata);
        etxtIdCli = findViewById(R.id.etxtCLiente);

        final Spinner spiStatus, spiParcela, spiEmitente, spiMoeda;


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
        btnPesq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataPesq = data.getTime();
                Toast.makeText(DuplicatasActivity.this, "escolhido: " + spiEmitente.getSelectedItemId(), Toast.LENGTH_SHORT).show();

                //action
            }
        });
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
