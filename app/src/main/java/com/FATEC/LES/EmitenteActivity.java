package com.FATEC.LES;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;

public class EmitenteActivity extends AppCompatActivity {
    private DBHelper dbHelper = new DBHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emitente);

        SearchView emiPesq = findViewById(R.id.srcPesquisa);
        emiPesq.setQueryHint("Código ou CNPJ");

        emiPesq.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if (query.length() > 14){
                    selectEmitente(Integer.parseInt(query),1,dbHelper);
                }
                else{
                    selectEmitente(Integer.parseInt(query),2,dbHelper);
                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

}
