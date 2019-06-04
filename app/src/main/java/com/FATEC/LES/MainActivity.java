package com.FATEC.LES;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.FATEC.LES.DAO.DummyDataEntries;
import com.FATEC.LES.Helper.DBHelper;

public class MainActivity extends AppCompatActivity {
    private DBHelper dbHelper = new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton btnResumo = (ImageButton) findViewById(R.id.btnResumo);
        ImageButton btnCliente = (ImageButton) findViewById(R.id.btnCliente);
        ImageButton btnEmitente = (ImageButton) findViewById(R.id.btnEmitente);
        ImageButton btnDuplicata = (ImageButton) findViewById(R.id.btnDuplicata);
        ImageButton btnLogOut = (ImageButton) findViewById(R.id.btnLogOut);

        btnResumo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_Resumo = new Intent(MainActivity.this, ResumoActivity.class);
                startActivity(in_Resumo);
            }
        });

        btnCliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_Cliente = new Intent(MainActivity.this, ClienteActivity.class);
                startActivity(in_Cliente);
            }
        });

        btnEmitente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_Emitente = new Intent(MainActivity.this, EmitenteActivity.class);
                startActivity(in_Emitente);
            }
        });

        btnDuplicata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_Duplicata = new Intent(MainActivity.this, DuplicatasActivity.class);
                startActivity(in_Duplicata);
            }
        });

        btnLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in_LogOut = new Intent(MainActivity.this, LauncherActivity.class);
                startActivity(in_LogOut);
            }
        });

        DummyDataEntries de = new DummyDataEntries();
        de.insertEmitente(dbHelper);
        de.insertUsuario(dbHelper);
        de.insertCliente(dbHelper);
        de.insertDuplicata(dbHelper);
        de.insertParcela(dbHelper);
    }

    @Override
    public void onBackPressed() {
        moveTaskToBack(true); //app fica em 2º plano
    }


}
