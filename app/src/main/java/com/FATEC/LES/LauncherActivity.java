package com.FATEC.LES;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LauncherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        Intent in_login = new Intent(LauncherActivity.this, LoginActivity.class);
        startActivity(in_login);
    }
}
