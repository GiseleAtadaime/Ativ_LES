package com.FATEC.LES.Helper;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.ContextThemeWrapper;

import com.FATEC.LES.DAO.Contrato;
import com.FATEC.LES.Model.Emitente;

public class QueriesHelper {

    public Emitente selectEmitente(Integer chave, Integer tipo, DBHelper dbHelper){

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM " + Contrato.Emitente_TB.TABLENAME +
                "WHERE ";

        if (tipo == 1) {
            query.concat(Contrato.Emitente_TB.COLUMN_ID + " = " + chave);
        }
        else{
            query.concat(Contrato.Emitente_TB.COLUMN_CNPJ + " = " + chave);
        }

        Cursor c = db.rawQuery(query,null);

        try{
            if (c != null){
                c.moveToFirst();
            }
            Emitente emi = new Emitente(c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_CNPJ)),
                                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_RZSOCIAL)),
                                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_BANCO)),
                                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_AG)),
                                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_CONTA)),
                                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_CIDADE)),
                                        c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_UF)),
                                        c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_ID)));

            return emi;
        }
        finally {
            c.close();
        }
    }

}
