package com.FATEC.LES;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.FATEC.LES.DAO.Contrato;
import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;
import com.FATEC.LES.Model.Parcela;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

public class ExibirDuplicataActivity extends AppCompatActivity {

    QueriesHelper qh = new QueriesHelper();
    DBHelper db = new DBHelper(this);
    ArrayList<Parcela> parcelas = new ArrayList<>();
    ArrayList<Integer> parNum = new ArrayList<Integer>();
    ArrayAdapter<CharSequence> adapter;
    Spinner spiParcela;

    String dtemi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exibir_duplicata);

        final Integer id_dup = getIntent().getExtras().getInt("ID_DUP");
        String cliente = getIntent().getExtras().getString("CLIENTE");
        String emitente = getIntent().getExtras().getString("EMITENTE");
        dtemi = getIntent().getExtras().getString("DTEMI");

        final TextView txtIDDup, txtEmi, txtCli, txtSit, txtDtEmi, txtDtVenc, txtMoeda, txtValor, txtDtPag, txtDesc, txtJuros, txtBc, txtAg, txtConta;
        spiParcela = findViewById(R.id.spiParcela);

        loadExibirParcelas(id_dup);

        txtIDDup = findViewById(R.id.txtDupliRet);
        txtEmi = findViewById(R.id.txtEmiRet);
        txtCli = findViewById(R.id.txtCliRet);
        txtSit = findViewById(R.id.txtSitRet);
        txtDtEmi = findViewById(R.id.txtDtEmiRet);
        txtDtVenc = findViewById(R.id.txtDataVencRet);
        txtMoeda = findViewById(R.id.txtMoedaRet);
        txtValor = findViewById(R.id.txtValor);
        txtDtPag = findViewById(R.id.txtDataPagtRet);
        txtDesc = findViewById(R.id.txtDesc);
        txtJuros = findViewById(R.id.txtJuros);
        txtBc = findViewById(R.id.txtBancoRet);txtIDDup.setText(id_dup.toString());
        txtEmi.setText(emitente);
        txtCli.setText(cliente);

        final SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());

        FloatingActionButton btnAcao = (FloatingActionButton) findViewById(R.id.acbtnCanc);
        btnAcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LinearLayout linMenu = (LinearLayout) findViewById(R.id.linCancMenu);
                if (linMenu.getVisibility() == View.VISIBLE){
                    linMenu.setVisibility(View.GONE);
                }else{
                    linMenu.setVisibility(View.VISIBLE);
                }

            }
        });

        Button btnCancelaPar = (Button) findViewById(R.id.btnCancelaPar);
        btnCancelaPar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txtSit.getText().equals("CANCELADO")){
                    AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
                    builder.setTitle(R.string.app_name);
                    builder.setMessage("Deseja cancelar todas as parcelas futuras?");
                    // builder.setIcon(R.drawable.ic_launcher);
                    builder.setPositiveButton("Sim, cancelar todas", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                            if (qh.cancelarParcela(id_dup,null,db)){
                                loadExibirParcelas(id_dup);
                                Toast.makeText(getApplicationContext(),"Parcelas canceladas com sucesso!", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Erro ao cancelar as parcelas", Toast.LENGTH_SHORT).show();
                            }

                        }
                    });
                    builder.setNegativeButton("Não, apenas esta", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            dialog.dismiss();
                            if (qh.cancelarParcela(id_dup,parcelas.get(spiParcela.getSelectedItemPosition()).getPar_Numero(),db)){
                                loadExibirParcelas(id_dup);
                                Toast.makeText(getApplicationContext(),"Parcelas canceladas com sucesso!", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Erro ao cancelar as parcelas", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                    AlertDialog alert = builder.create();
                    alert.show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"As parcelas já estão canceladas!", Toast.LENGTH_SHORT).show();
                }


            }
        });

        spiParcela.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                System.out.println("Status da parcela: " + parcelas.get(position).getPar_Status());
                System.out.println("Numero da parcela: " + parcelas.get(position).getPar_Numero());
                System.out.println("Duo " + parcelas.get(position).getPar_Id_Duplicata());
                txtSit.setText(parcelas.get(position).transStatus(parcelas.get(position).getPar_Status()));
                System.out.println("Status " + parcelas.get(position).getPar_Id_Duplicata());
                txtDtEmi.setText(dtemi);
                txtMoeda.setText(parcelas.get(position).getPar_Moeda());
                txtValor.setText(parcelas.get(position).getPar_Valor().toString());
                txtDesc.setText("Descontos: " + parcelas.get(position).getPar_Desconto().toString());
                txtJuros.setText("Juros: " + parcelas.get(position).getPar_Juros().toString());


                if ( parcelas.get(position).getPar_Data_Pag() != null){
                    txtDtPag.setText((parcelas.get(position).getPar_Data_Pag()));
                }
                else{
                    txtDtPag.setText("Sem data");
                }
                if( parcelas.get(position).getPar_Data_Venc() != null){
                    txtDtVenc.setText(parcelas.get(position).getPar_Data_Venc());
                }
                else{
                    txtDtVenc.setText("Sem data");
                }

                if (parcelas.get(position).getPar_Banco() == 0){
                    txtBc.setText("Não enviado ao banco");
                }
                else{
                    txtBc.setText("Enviado ao banco");
                }
                Integer i = 0;

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void loadExibirParcelas(Integer id_dup){

        parcelas = qh.selectParcela(db,id_dup);
        parNum = new ArrayList<Integer>();;

        Integer i = 1;
        System.out.println("Qtde da parcela: " + parcelas.size());
        while( i <= parcelas.size()){
            parNum.add(parcelas.get(i-1).getPar_Numero());
            i++;
        }

        adapter = new ArrayAdapter(this,
                android.R.layout.simple_spinner_item, parNum);
        spiParcela.setAdapter(adapter);
    }
}
