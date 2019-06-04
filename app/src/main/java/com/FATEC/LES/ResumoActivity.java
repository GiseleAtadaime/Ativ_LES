package com.FATEC.LES;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SearchView;
import android.widget.TextView;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;
import com.FATEC.LES.Model.Parcela;

public class ResumoActivity extends AppCompatActivity {
    private DBHelper dbHelper = new DBHelper(this);
    QueriesHelper qh = new QueriesHelper();

    Double total, rec7, rec7a30, rec30Dias, rec30DiasVenc, rec30DiasVencMais;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

        total = qh.totalReceber(null,dbHelper);
        rec7 = qh.total7dias(null, dbHelper);
        rec7a30 = qh.total7a30(null, dbHelper);
        rec30Dias = qh.total30Dias(null, dbHelper);
        rec30DiasVenc = qh.total30DiasVenc(null, dbHelper);
        rec30DiasVencMais = qh.total30DiasVencMais(null, dbHelper);

        fillFields(total, rec7, rec7a30, rec30Dias,rec30DiasVenc,rec30DiasVencMais);

        SearchView resPesq = findViewById(R.id.srcPesquisa);
        resPesq.setQueryHint("Código do cliente");

        resPesq.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                total = qh.totalReceber(Integer.parseInt(query),dbHelper);
                rec7 = qh.total7dias(Integer.parseInt(query), dbHelper);
                rec7a30 = qh.total7a30(Integer.parseInt(query), dbHelper);
                rec30Dias = qh.total30Dias(Integer.parseInt(query), dbHelper);
                rec30DiasVenc = qh.total30DiasVenc(Integer.parseInt(query), dbHelper);
                rec30DiasVencMais = qh.total30DiasVencMais(Integer.parseInt(query), dbHelper);

                fillFields(total, rec7, rec7a30, rec30Dias, rec30DiasVenc, rec30DiasVencMais);

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }

    public void fillFields(Double total, Double rec7, Double rec7a30, Double rec30Dias, Double rec30DiasVenc, Double rec30DiasVencMais){
        TextView txtTotal, txtRec7, txtRec7a30, txtRec30Dias, txtRec30DiasVenc, txtREc30DiasVencMais;

        txtTotal = findViewById(R.id.txtTotal);
        txtRec7 = findViewById(R.id.txt7Dias);
        txtRec7a30 = findViewById(R.id.txt7a30Dias);
        txtRec30Dias = findViewById(R.id.txtProximos30);
        txtRec30DiasVenc = findViewById(R.id.txt30DiasVenc);
        txtREc30DiasVencMais = findViewById(R.id.txt30DiasMaisVenc);


        if (total == null){
            total = 0.00;
        }
        txtTotal.setText("Total a receber: " + total.toString());
        if (rec7 == null){
            rec7 = 0.00;
        }
        txtRec7.setText("Total a receber nos próximos 7 dias: " + rec7.toString());
        if (rec7a30 == null){
            rec7a30 = 0.00;
        }
        txtRec7a30.setText("Total a receber entre 7 a 30 dias: " + rec7a30.toString());
        if (rec30Dias == null){
             rec30Dias = 0.00;
        }
        txtRec30Dias.setText("Total a receber com mais de 30 dias: " + rec30Dias.toString());
        if (rec30DiasVenc == null){
            rec30DiasVenc = 0.00;
        }
        txtRec30DiasVenc.setText("Total a receber vencido até 30 dias: " + rec30DiasVenc.toString());
        if (rec30DiasVencMais == null){
            rec30DiasVencMais = 0.00;
        }
        txtREc30DiasVencMais.setText("Total a receber vencido com mais de 30 dias: " + rec30DiasVencMais.toString());
    }
}
