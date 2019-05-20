package com.FATEC.LES.Helper;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.FATEC.LES.DAO.Contrato;

public class DBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "FazTec.db";
    private static final Integer DATABASE_VERSION = 1;

    public DBHelper(Context context){
        super(context,DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(Contrato.CREATE_TABLE_USUARIO);
        db.execSQL(Contrato.CREATE_TABLE_EMITENTE);
        db.execSQL(Contrato.CREATE_TABLE_CLIENTE);
        db.execSQL(Contrato.CREATE_TABLE_DUPLICATA);
        db.execSQL(Contrato.CREATE_TABLE_PARCELA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int NewVersion){

    }

}
