package com.FATEC.LES;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;

public class LimCredActivity extends AppCompatActivity {
    private DBHelper dbHelper = new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lim_cred);
        final Integer cli_id = getIntent().getExtras().getInt("ID_CLIENTE");
        Double cli_lim = getIntent().getExtras().getDouble("CLI_LIMITE");

        final TextView txtLimOri = findViewById(R.id.txtLimOriV);
        txtLimOri.setText(cli_lim.toString());
        final EditText etxtLim = findViewById(R.id.etxtLimCred);

        Button btnAlterar = (Button) findViewById(R.id.btnAlterarLimite);
        btnAlterar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QueriesHelper qh = new QueriesHelper();
                Double num = Double.parseDouble(etxtLim.getText().toString());

                if (qh.alterarLimite(cli_id, num, dbHelper)){
                    txtLimOri.setText(num.toString());
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
}
