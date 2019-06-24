package com.FATEC.LES;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.FATEC.LES.DAO.DummyDataEntries;
import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;

public class LoginActivity extends AppCompatActivity {
    QueriesHelper qh = new QueriesHelper();
    DBHelper db = new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DummyDataEntries de = new DummyDataEntries();
        de.insertUsuario(db);

        Button btnLogin = (Button) findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        EditText etxtName, etxtSenha;
                        etxtName = findViewById(R.id.etUsuario);
                        etxtSenha = findViewById(R.id.etSenha);
                        if (etxtName.getText().toString().compareTo("") != 0){
                            if(etxtSenha.getText().toString().compareTo("") != 0){
                                if (qh.selectUsuario(etxtName.getText().toString(), Integer.parseInt(etxtSenha.getText().toString()), db)){
                                    Intent main = new Intent(LoginActivity.this, MainActivity.class);
                                    startActivity(main);
                                }
                                else{
                                    Toast.makeText(getApplicationContext(),"Usuário inválido!", Toast.LENGTH_SHORT).show();
                                }
                            }
                            else{
                                Toast.makeText(getApplicationContext(),"Insira a senha!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else{
                            Toast.makeText(getApplicationContext(),"Insira um usuário!", Toast.LENGTH_SHORT).show();
                        }

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
