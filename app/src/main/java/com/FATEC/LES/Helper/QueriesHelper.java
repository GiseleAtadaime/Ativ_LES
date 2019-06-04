package com.FATEC.LES.Helper;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

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

    public Boolean alterarLimite(Integer id, Double limite, DBHelper dbHelper){
        Cursor c = null;

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues lim = new ContentValues();
        lim.put(Contrato.Cliente_TB.COLUMN_ID, id);
        lim.put(Contrato.Cliente_TB.COLUMN_LIMCRED, limite);

        try{
            db.update(Contrato.Cliente_TB.TABLENAME,lim,Contrato.Cliente_TB.COLUMN_ID + " = ?", new String[]{id.toString()});
        }
        finally {
            return true;
        }
    }

    public Double totalReceber(Integer id, DBHelper dbHelper){
        Cursor c = null;
        Double total = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query;

        if (id != null) {
            query  = "SELECT SUM(p." + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME + " p , " + Contrato.Duplicata_TB.TABLENAME +
                    " d WHERE p." + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_ABERTO + "' and p." + Contrato.Parcela_TB.COLUMN_ID_DUP +
            " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP;
        }
        else{
            query  = "SELECT SUM(" + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME +
                    " WHERE " + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_ABERTO + "'";
        }

        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                total = c.getDouble(c.getColumnIndex("total"));
            }

        }
        finally {
            c.close();
            return total;
        }
    }

    public Double total7dias(Integer id, DBHelper dbHelper){
        Cursor c = null;
        Double total = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query;

        if (id != null) {
            query  = "SELECT SUM(p." + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME + " p , " + Contrato.Duplicata_TB.TABLENAME +
                    " d WHERE p." + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_ABERTO + "' and p." + Contrato.Parcela_TB.COLUMN_ID_DUP +
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") between datetime('now','start of day') and datetime('now','+8 day','start of day', '-1 seconds')";
        }
        else{
            query  = "SELECT SUM(" + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME +
                    " WHERE " + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_ABERTO + "' AND datetime(" + Contrato.Parcela_TB.COLUMN_DATA_VENC  + ") between datetime('now','start of day') and datetime('now','+8 day','start of day', '-1 seconds')" ;
        }

        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                total = c.getDouble(c.getColumnIndex("total"));
            }

        }
        finally {
            c.close();
            return total;
        }
    }

    public Double total7a30(Integer id, DBHelper dbHelper){
        Cursor c = null;
        Double total = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query;

        if (id != null) {
            query  = "SELECT SUM(p." + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME + " p , " + Contrato.Duplicata_TB.TABLENAME +
                    " d WHERE p." + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_ABERTO + "' and p." + Contrato.Parcela_TB.COLUMN_ID_DUP +
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") between datetime('now','start of day','+8 day') and datetime('now','+31 day','start of day', '-1 seconds')";
        }
        else{
            query  = "SELECT SUM(" + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME +
                    " WHERE " + Contrato.Parcela_TB.COLUMN_STATUS  +" = '" + Contrato.Parcela_TB.STATUS_ABERTO +  "' AND datetime(" + Contrato.Parcela_TB.COLUMN_DATA_VENC  + ") between datetime('now','start of day','+8 day') and datetime('now','+31 day','start of day', '-1 seconds')" ;
        }


        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                total = c.getDouble(c.getColumnIndex("total"));
            }

        }
        finally {
            c.close();
            return total;
        }
    }

    public Double total30Dias(Integer id, DBHelper dbHelper){
        Cursor c = null;
        Double total = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query;

        if (id != null) {
            query  = "SELECT SUM(p." + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME + " p , " + Contrato.Duplicata_TB.TABLENAME +
                    " d WHERE p." + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_ABERTO + "' and p." + Contrato.Parcela_TB.COLUMN_ID_DUP +
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") > datetime('now','+61 day','start of day')";
        }
        else{
            query  = "SELECT SUM(" + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME +
                    " WHERE " + Contrato.Parcela_TB.COLUMN_STATUS  +" = '" + Contrato.Parcela_TB.STATUS_ABERTO +  "' AND datetime(" + Contrato.Parcela_TB.COLUMN_DATA_VENC  + ") > datetime('now','+61 day','start of day')" ;
        }


        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                total = c.getDouble(c.getColumnIndex("total"));
            }

        }
        finally {
            c.close();
            return total;
        }
    }

    public Double total30DiasVenc(Integer id, DBHelper dbHelper){
        Cursor c = null;
        Double total = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query;

        if (id != null) {
            query  = "SELECT SUM(p." + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME + " p , " + Contrato.Duplicata_TB.TABLENAME +
                    " d WHERE p." + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_VENCIDO + "' and p." + Contrato.Parcela_TB.COLUMN_ID_DUP +
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") > datetime('now','-30 day','start of day')";
        }
        else{
            query  = "SELECT SUM(" + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME +
                    " WHERE " + Contrato.Parcela_TB.COLUMN_STATUS  +" = '" + Contrato.Parcela_TB.STATUS_VENCIDO +  "' AND datetime(" + Contrato.Parcela_TB.COLUMN_DATA_VENC  + ") > datetime('now','-30 day','start of day')" ;
        }


        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                total = c.getDouble(c.getColumnIndex("total"));
            }

        }
        finally {
            c.close();
            return total;
        }
    }
    public Double total30DiasVencMais(Integer id, DBHelper dbHelper){
        Cursor c = null;
        Double total = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query;

        if (id != null) {
            query  = "SELECT SUM(p." + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME + " p , " + Contrato.Duplicata_TB.TABLENAME +
                    " d WHERE p." + Contrato.Parcela_TB.COLUMN_STATUS +" = '" + Contrato.Parcela_TB.STATUS_VENCIDO + "' and p." + Contrato.Parcela_TB.COLUMN_ID_DUP +
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") < datetime('now','-30 day','start of day')";
        }
        else{
            query  = "SELECT SUM(" + Contrato.Parcela_TB.COLUMN_VALOR + ") as total FROM " + Contrato.Parcela_TB.TABLENAME +
                    " WHERE " + Contrato.Parcela_TB.COLUMN_STATUS  +" = '" + Contrato.Parcela_TB.STATUS_VENCIDO +  "' AND datetime(" + Contrato.Parcela_TB.COLUMN_DATA_VENC  + ") < datetime('now','-30 day','start of day')" ;
        }


        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                total = c.getDouble(c.getColumnIndex("total"));
            }

        }
        finally {
            c.close();
            return total;
        }
    }


}
