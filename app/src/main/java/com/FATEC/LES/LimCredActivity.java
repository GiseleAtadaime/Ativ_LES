package com.FATEC.LES;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;

public class LimCredActivity extends AppCompatActivity {
    private DBHelper dbHelper = new DBHelper(this);
    QueriesHelper qh = new QueriesHelper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lim_cred);
        final Integer cli_id = getIntent().getExtras().getInt("ID_CLIENTE");

        final TextView txtLimOri = findViewById(R.id.txtLimOriV);
        txtLimOri.setText(qh.selectCliente(cli_id.toString(),2,dbHelper,2).getCli_LimCred().toString());
        final EditText etxtLim = findViewById(R.id.etxtLimCred);

        Button btnAlterar = (Button) findViewById(R.id.btnAlterarLimite);
        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkDouble(etxtLim.getText().toString())){
                    Double num = Double.parseDouble(etxtLim.getText().toString());

                    if (qh.alterarLimite(cli_id, num, dbHelper)){
                        txtLimOri.setText(num.toString());
                        Toast.makeText(getApplicationContext(),"Limite alterado com sucesso!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Erro ao alterar limite de crédito!", Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Insira um número válido!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        Button btnCancelar = (Button) findViewById(R.id.btnCancelar);
        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LimCredActivity.super.onBackPressed();
            }
        });


    }

    public Boolean checkDouble(String num){
        try{
            Double ret = Double.parseDouble(num);
            return true;
        }
        catch(NumberFormatException e){
            return false;
        }
    }
}
