package com.FATEC.LES;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent main = new Intent(LoginActivity.this, MainActivity.class);
                        startActivity(main);
                    }
                }
        );
    }
    //sem este código, o voltar retorna à launcher activity
    @Override
    public void onBackPressed() {
            moveTaskToBack(true); //app fica em 2º plano
    }
}
