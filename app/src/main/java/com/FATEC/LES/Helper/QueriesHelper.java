package com.FATEC.LES.Helper;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Toast;

import com.FATEC.LES.DAO.Contrato;
import com.FATEC.LES.DuplicatasActivity;
import com.FATEC.LES.Model.Cliente;
import com.FATEC.LES.Model.Duplicata;
import com.FATEC.LES.Model.Emitente;
import com.FATEC.LES.Model.Parcela;
import com.FATEC.LES.Model.Usuario;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

public class QueriesHelper {

    public Boolean selectUsuario(String alias, Integer senha, DBHelper dbHelper){
        Boolean ret = false;
        Cursor c = null;
        Usuario u = null;
        alias = alias.toLowerCase();
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT " + Contrato.UsuarioTB.COLUMN_APELIDO + " , " + Contrato.UsuarioTB.COLUMN_SENHA +
                " FROM " + Contrato.UsuarioTB.TABLENAME +
                " WHERE " + Contrato.UsuarioTB.COLUMN_APELIDO  + " = '" + alias + "'  and " + Contrato.UsuarioTB.COLUMN_SENHA + " = " + senha;

        try{
            c = db.rawQuery(query,null);

            if (c.moveToFirst()) {
                u = new Usuario(c.getString(c.getColumnIndex(Contrato.UsuarioTB.COLUMN_APELIDO)), c.getInt(c.getColumnIndex(Contrato.UsuarioTB.COLUMN_SENHA)));

                if (u.getUsr_Apelido().equals(alias)){
                    if( u.getUsr_Senha().equals(senha))
                        ret = true;
                }
                else{
                    ret = false;
                }
                c.close();
            }
        }
        finally {

            return ret;
        }
    }

    public Emitente selectEmitente(String chave, Integer tipo, DBHelper dbHelper, Integer opt){

        Cursor c = null;
        Emitente emi = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM " + Contrato.Emitente_TB.TABLENAME +
                " WHERE ";

        if (tipo == 1) {
            query = query.concat(Contrato.Emitente_TB.COLUMN_CNPJ + " = '" + chave + "'");
        }
        else{
            query = query.concat(Contrato.Emitente_TB.COLUMN_ID + " = " + Integer.parseInt(chave));
        }

        try{
            c = db.rawQuery(query,null);

            if (c.moveToFirst()) {

                if(opt == 1){
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
                else{
                    emi = new Emitente(c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_RZSOCIAL)),
                            c.getInt(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_ID)));
                }
                c.close();
            }
        }
        finally {

            return emi;
        }
    }

    public Cliente selectCliente(String chave, Integer tipo, DBHelper dbHelper, Integer opt){
        Cursor c = null;
        Cliente cli = null;

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM " + Contrato.Cliente_TB.TABLENAME +
                " WHERE ";

        if (tipo == 1) {
            query = query.concat(Contrato.Cliente_TB.COLUMN_CNPJ + " = '" + chave.toString() + "'");
        }
        else{
            query = query.concat(Contrato.Cliente_TB.COLUMN_ID + " = " + Integer.parseInt(chave));
        }

        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                if(opt == 1 ){
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
                else{
                    cli = new Cliente(c.getInt(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_ID)),
                            c.getString(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_RZSOCIAL)));
                    cli.setCli_LimCred(c.getDouble(c.getColumnIndex(Contrato.Cliente_TB.COLUMN_LIMCRED)));
                }
                c.close();
            }

            }
        finally {

            return cli;
        }

    }

    public Boolean alterarLimite(Integer id, Double limite, DBHelper dbHelper){
        Cursor c = null;
        Boolean ret = false;
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues lim = new ContentValues();
        lim.put(Contrato.Cliente_TB.COLUMN_ID, id);
        lim.put(Contrato.Cliente_TB.COLUMN_LIMCRED, limite);

        try{
            if(db.update(Contrato.Cliente_TB.TABLENAME,lim,Contrato.Cliente_TB.COLUMN_ID + " = ?", new String[]{id.toString()}) != 0){
                ret = true;
            }
        }
        finally {
            return ret;
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
            " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP + " and d." + Contrato.Duplicata_TB.COLUMN_ID_CLI +  " = " + id;
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
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") between datetime('now','start of day') and datetime('now','+8 day','start of day', '-1 seconds') and d."+
                    Contrato.Duplicata_TB.COLUMN_ID_CLI + " = " + id;
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
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") between datetime('now','start of day','+8 day') and datetime('now','+31 day','start of day', '-1 seconds') and d." + Contrato.Duplicata_TB.COLUMN_ID_CLI +  " = " + id;
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
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") > datetime('now','+61 day','start of day') and d." + Contrato.Duplicata_TB.COLUMN_ID_CLI +  " = " + id;
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
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") > datetime('now','-30 day','start of day') and d." + Contrato.Duplicata_TB.COLUMN_ID_CLI +  " = " + id;
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
                    " =  d." + Contrato.Duplicata_TB.COLUMN_ID_DUP  + " and datetime(p." + Contrato.Parcela_TB.COLUMN_DATA_VENC + ") < datetime('now','-30 day','start of day') and d." + Contrato.Duplicata_TB.COLUMN_ID_CLI +  " = " + id;
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

    //Duplicatas

    //--------------------------------------------------------------------------------------------

    public ArrayList<String> spinnerEmitente(DBHelper dbHelper){
        Cursor c = null;
        ArrayList<String> emi = new ArrayList<String>();
        emi.add("Selecionar");
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT " + Contrato.Emitente_TB.COLUMN_ID + " , " + Contrato.Emitente_TB.COLUMN_RZSOCIAL + " FROM " + Contrato.Emitente_TB.TABLENAME + " order by 1";

        try{
            c = db.rawQuery(query,null);

            if(c.moveToFirst()){
                do{
                    emi.add(c.getString(c.getColumnIndex(Contrato.Emitente_TB.COLUMN_RZSOCIAL)));
                }while(c.moveToNext());
            }
        }
        finally {
            c.close();
            return emi;
        }
    }


    SimpleDateFormat dateFormat = new SimpleDateFormat(
            "yyyy-MM-dd HH:mm:ss", Locale.getDefault());


    public ArrayList<Duplicata> selectDuplicata(DBHelper dbHelper, Integer id, Integer id_emi, Integer id_cli, Integer status, Date dt_emi, Integer fpagto){
        Cursor c = null;
        ArrayList<Duplicata> dup = new ArrayList<Duplicata>();

        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String query = "SELECT * FROM " + Contrato.Duplicata_TB.TABLENAME;

        if(id != null ||  id_emi != null ||  id_cli != null ||  status != null || dt_emi != null ||  fpagto != null) {

            query = query.concat(" WHERE ");

            if (id != null) {
                query = query.concat(Contrato.Duplicata_TB.COLUMN_ID_DUP + " = " + id + " and ");
            }
            if (id_emi != null) {
                query = query.concat(Contrato.Duplicata_TB.COLUMN_ID_EMI + " = " + id_emi + " and ");
            }
            if (id_cli != null) {
                query = query.concat(Contrato.Duplicata_TB.COLUMN_ID_CLI + " = " + id_cli + " and ");
            }
            if (status != null) {
                if (status == 1) {
                    query = query.concat(Contrato.Duplicata_TB.COLUMN_STATUS + " = '" + Contrato.Duplicata_TB.STATUS_ABERTO + "' and ");
                } else if (status == 2) {
                    query = query.concat(Contrato.Duplicata_TB.COLUMN_STATUS + " = '" + Contrato.Duplicata_TB.STATUS_FECHADO + "' and ");
                } else {
                    query = query.concat(Contrato.Duplicata_TB.COLUMN_STATUS + " = '" + Contrato.Duplicata_TB.STATUS_VENCIDO + "' and ");
                }
            }
            if (dt_emi != null) {
                query = query.concat("datetime(" + Contrato.Duplicata_TB.COLUMN_DT_EMI + ",'start of day') = '" + dateFormat.format(dt_emi) + "' and ");
            }
            if (fpagto != null) {
                if (fpagto == 1) {
                    query = query.concat(Contrato.Duplicata_TB.COLUMN_FORMA_PAG + " = 1 and ");
                } else {
                    query = query.concat(Contrato.Duplicata_TB.COLUMN_FORMA_PAG + " > 1 and ");
                }
            }

            query = query.substring(0, query.length() - 4);
        }
        query = query.concat(";");

        System.out.println(query);
        try{
            c = db.rawQuery(query,null);
            Integer i = 0;
            if(c.moveToFirst()){
                do{
                        dup.add(new Duplicata(c.getInt(c.getColumnIndex(Contrato.Duplicata_TB.COLUMN_ID_DUP)),
                                              c.getInt(c.getColumnIndex(Contrato.Duplicata_TB.COLUMN_ID_EMI)),
                                              c.getInt(c.getColumnIndex(Contrato.Duplicata_TB.COLUMN_ID_CLI))));
                        dup.get(i).setDup_Status(c.getString(c.getColumnIndex(Contrato.Duplicata_TB.COLUMN_STATUS)));
                        dup.get(i).setDup_Data_Emissao(c.getString(c.getColumnIndex(Contrato.Duplicata_TB.COLUMN_DT_EMI)));
                        dup.get(i).setDup_Forma_Pag(c.getInt(c.getColumnIndex(Contrato.Duplicata_TB.COLUMN_FORMA_PAG)));
                        dup.get(i).setDup_Valor(c.getDouble(c.getColumnIndex(Contrato.Duplicata_TB.COLUMN_VALOR)));
                        i++;
                }while(c.moveToNext());
            }
            c.close();
        }
        finally {
            return dup;
        }
    }

    public ArrayList<Parcela> selectParcela(DBHelper dbHelper, Integer id){
        Cursor c = null;
        ArrayList<Parcela> parcelas = new ArrayList<Parcela>();
        SQLiteDatabase db = dbHelper.getReadableDatabase();

        String query = "SELECT * FROM " + Contrato.Parcela_TB.TABLENAME + " WHERE " + Contrato.Parcela_TB.COLUMN_ID_DUP + " = " + id + " ";

        System.out.println("Query: " + query);

        try{
            c = db.rawQuery(query,null);
            Integer i = 0;
            if(c.moveToFirst()){
                do{
                    parcelas.add(new Parcela(c.getInt(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_NUMERO)),
                                             c.getInt(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_ID_DUP))));
                    parcelas.get(i).setPar_Valor(c.getDouble(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_VALOR)));
                    parcelas.get(i).setPar_Moeda(c.getString(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_MOEDA)));
                    parcelas.get(i).setPar_Valor_Pag(c.getDouble(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_VALOR_PAG)));
                    parcelas.get(i).setPar_Desconto(c.getDouble(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_DESCONTO)));
                    parcelas.get(i).setPar_Juros(c.getDouble(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_JUROS)));
                    parcelas.get(i).setPar_Status(c.getString(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_STATUS)));
                    parcelas.get(i).setPar_Banco(c.getInt(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_BANCO)));
                    if ( c.getString(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_DATA_VENC)) == null){
                        parcelas.get(i).setPar_Data_Venc(null);
                    }
                    else{
                        parcelas.get(i).setPar_Data_Venc(c.getString(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_DATA_VENC)));
                    }
                    if( c.getString(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_DATA_PAG)) == null ){
                        parcelas.get(i).setPar_Data_Pag(null);
                    }
                    else{
                        parcelas.get(i).setPar_Data_Pag(c.getString(c.getColumnIndex(Contrato.Parcela_TB.COLUMN_DATA_PAG)));
                    }
                    i++;
                }while(c.moveToNext());
            }

            c.close();
        }
        finally {
            return parcelas;
        }
    }

    public Boolean cancelarParcela(Integer id, Integer num, DBHelper dbHelper){
        Boolean ret = false;
        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues par = new ContentValues();

        par.put(Contrato.Parcela_TB.COLUMN_STATUS,Contrato.Parcela_TB.STATUS_CANCELADO);

        try{
            if (num != null) {
                db.update(Contrato.Parcela_TB.TABLENAME,par,Contrato.Parcela_TB.COLUMN_ID_DUP + " = ? and " + Contrato.Parcela_TB.COLUMN_NUMERO + " = ? ", new String[]{ id.toString(), num.toString()});
                ret = true;
            }
            else{
                db.update(Contrato.Parcela_TB.TABLENAME,par,Contrato.Parcela_TB.COLUMN_ID_DUP + " = ? ", new String[]{id.toString()});
                ret = true;
            }
        }
        finally {
            return ret;
        }
    }
}
