package com.FATEC.LES;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;
import com.FATEC.LES.Model.Emitente;

public class EmitenteActivity extends AppCompatActivity {
    private DBHelper dbHelper = new DBHelper(this);
    Emitente emi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emitente);

        SearchView emiPesq = findViewById(R.id.srcPesquisa);
        emiPesq.setQueryHint("Código ou CNPJ (apenas números)");

        emiPesq.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                QueriesHelper qh = new QueriesHelper();
                if (query.length() >= 14){
                    emi = qh.selectEmitente(query,1,dbHelper, 1);
                }
                else{
                    emi = qh.selectEmitente(query,2,dbHelper, 1);
                }

                if (emi != null){
                    fillFields(emi);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Emitente não encontrado", Toast.LENGTH_SHORT).show();
                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    public void fillFields(Emitente emi){

        TextView txtCodigo, txtRZ, txtCNPJ, txtEmail, txtLogr, txtNum, txtBair, txtCidade, txtUF, txtCEP, txtBanco, txtAg, txtConta;


        txtCodigo = findViewById(R.id.txtCodigo);
        txtRZ = findViewById(R.id.txtNome);
        txtCNPJ = findViewById(R.id.txtCNPJ);
        txtEmail = findViewById(R.id.txtEmail);
        txtLogr = findViewById(R.id.txtEndereco);
        txtNum = findViewById(R.id.txtNumero);
        txtBair = findViewById(R.id.txtBairro);
        txtCidade = findViewById(R.id.txtCidade);
        txtUF = findViewById(R.id.txtUF);
        txtCEP = findViewById(R.id.txtCep);
        txtBanco = findViewById(R.id.txtBanco);
        txtAg = findViewById(R.id.txtAgencia);
        txtConta = findViewById(R.id.txtConta);

        txtCodigo.setText(emi.getEmi_ID().toString());
        txtRZ.setText(emi.getRazao_Social());
        txtCNPJ.setText(emi.formatCNPJ(emi.getCNPJ()));
        txtEmail.setText(emi.getEmail());
        txtLogr.setText(emi.getEndereco());
        txtNum.setText(emi.getNum().toString());
        txtBair.setText(emi.getBairro());
        txtCidade.setText(emi.getCidade());
        txtUF.setText(emi.getUF());
        txtCEP.setText(emi.formatCEP(emi.getCep().toString()));
        txtBanco.setText(emi.getBanco().toString());
        txtAg.setText(emi.getAg().toString());
        txtConta.setText(emi.getConta().toString());
    }

}
