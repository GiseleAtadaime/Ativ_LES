package com.FATEC.LES;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.SearchView;
import android.widget.TextView;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.Helper.QueriesHelper;
import com.FATEC.LES.Model.Cliente;

public class ClienteActivity extends AppCompatActivity {

    private DBHelper dbHelper = new DBHelper(this);
    Cliente cli;
    
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

        SearchView cliPesq = findViewById(R.id.srcPesquisa);
        cliPesq.setQueryHint("Código ou CNPJ (apenas números)");

        cliPesq.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                QueriesHelper qh = new QueriesHelper();
                if (query.length() >= 14){
                    cli = qh.selectCliente(Integer.parseInt(query),1,dbHelper);
                }
                else{
                    cli = qh.selectCliente(Integer.parseInt(query),2,dbHelper);
                }

                if (cli != null){
                    fillFields(cli);
                }
                else{

                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
    }


    public void fillFields(Cliente cli){

        TextView txtCodigo, txtRZ, txtCNPJ, txtEmail, txtLogr, txtNum, txtBair, txtCidade, txtUF, txtCEP, txtBanco, txtAg, txtConta, txtComplemento;


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
        txtComplemento = findViewById(R.id.txtComplemento);

        txtCodigo.setText(cli.getCli_ID().toString());
        txtRZ.setText(cli.getRazao_Social());
        txtCNPJ.setText(cli.formatCNPJ(cli.getCNPJ()));
        txtEmail.setText(cli.getEmail());
        txtLogr.setText(cli.getCli_Complemento());
        txtNum.setText(cli.getNum().toString());
        txtBair.setText(cli.getBairro());
        txtCidade.setText(cli.getCidade());
        txtUF.setText(cli.getUF());
        txtCEP.setText(cli.formatCEP(cli.getCep().toString()));
        txtBanco.setText(cli.getBanco().toString());
        txtAg.setText(cli.getAg().toString());
        txtConta.setText(cli.getConta().toString());
        txtComplemento.setText(cli.getCli_Complemento());
    }
}
