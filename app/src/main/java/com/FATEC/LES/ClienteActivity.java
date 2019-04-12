package com.FATEC.LES;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class ClienteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);

        FloatingActionButton btnAcao = (FloatingActionButton) findViewById(R.id.acbtnAcao);
        btnAcao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LinearLayout linMenu = (LinearLayout) findViewById(R.id.linActionMenu);
                if (linMenu.getVisibility() == View.VISIBLE){
                    linMenu.setVisibility(View.GONE);
                }else{
                    linMenu.setVisibility(View.VISIBLE);
                }

            }
        });

        Button btnAlterarLimite = (Button) findViewById(R.id.btnLimite);
        btnAlterarLimite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inLimite = new Intent(ClienteActivity.this, LimCredActivity.class);
                startActivity(inLimite);
            }
        });
    }
}
