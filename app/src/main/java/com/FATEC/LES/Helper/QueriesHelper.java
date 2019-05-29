package com.FATEC.LES.Helper;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.ContextThemeWrapper;

import com.FATEC.LES.DAO.Contrato;
import com.FATEC.LES.Model.Cliente;
import com.FATEC.LES.Model.Emitente;

public class QueriesHelper {

    public Emitente selectEmitente(Integer chave, Integer tipo, DBHelper dbHelper){

        Cursor c = null;
        Emitente emi = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM " + Contrato.Emitente_TB.TABLENAME +
                " WHERE ";

        if (tipo == 1) {
            query = query.concat(Contrato.Emitente_TB.COLUMN_CNPJ + " = " + chave);
        }
        else{
            query = query.concat(Contrato.Emitente_TB.COLUMN_ID + " = " + chave);
        }

        try{
            c = db.rawQuery(query,null);

            if (c.moveToFirst()) {
                emi = new Emitente(c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_CNPJ)),
                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_RZSOCIAL)),
                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_BANCO)),
                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_AG)),
                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_CONTA)),
                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_CIDADE)),
                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_UF)),
                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_EMAIL)),
                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_BAIRRO)),
                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_CEP)),
                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_NUMERO)),
                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_LOGRADOURO)),
                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_ID)));
            }
        }
        finally {
            c.close();
            return emi;
        }
    }

    public Cliente selectCliente(Integer chave, Integer tipo, DBHelper dbHelper){
        Cursor c = null;
        Cliente cli = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM " + Contrato.Cliente_TB.TABLENAME +
                " WHERE ";

        if (tipo == 1) {
            query = query.concat(Contrato.Cliente_TB.COLUMN_CNPJ + " = " + chave);
        }
        else{
            query = query.concat(Contrato.Cliente_TB.COLUMN_ID + " = " + chave);
        }

        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                cli = new Cliente(c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_CNPJ)),
                                  c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_RZSOCIAL)),
                                  c.getInt(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_BANCO)),
                                  c.getInt(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_AG)),
                                  c.getInt(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_CONTA)),
                                  c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_CIDADE)),
                                  c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_UF)),
                                  c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_EMAIL)),
                                  c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_BAIRRO)),
                                  c.getInt(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_CEP)),
                                  c.getInt(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_NUMERO)),
                                  c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_LOGRADOURO)),
                                  c.getInt(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_ID)),
                                  c.getDouble(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_LIMCRED)),
                                  c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_COMPLE))

                            );

            }

            }
        finally {
            c.close();
            return cli;
        }

    }

}
