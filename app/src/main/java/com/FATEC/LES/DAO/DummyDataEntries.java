package com.FATEC.LES.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.MainActivity;
import com.FATEC.LES.Model.Emitente;
import com.FATEC.LES.Model.Usuario;

public class DummyDataEntries {

    private void insertUsuario(DBHelper dbHelper){

        Usuario dummyUsuario = new Usuario(1);
        dummyUsuario.setUsr_Apelido("Jucao");
        dummyUsuario.setUsr_Status(Contrato.UsuarioTB.STATUS_ACTIVE);
        dummyUsuario.setUsr_Nome("Juca da Rocha Pedreira");
        dummyUsuario.setUsr_Email("juca_pedreiro@gmail.com");
        dummyUsuario.setUsr_Senha(12345);

        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario.getUsr_Codigo());
        values.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario.getUsr_Apelido());
        values.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario.getUsr_Nome());
        values.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario.getUsr_Status());
        values.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario.getUsr_Email());
        values.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values);
    }

    private void insertEmitente(DBHelper dbHelper){

        Emitente dummyEmitente = new Emitente("75507251000166","Rodrigo e Analu Pizzaria ME",
                233, 938,40193,"Jacareí","SP",00001);

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Contrato.Emitente_TB.COLUMN_ID, dummyEmitente.getEmi_ID());
        values.put(Contrato.Emitente_TB.COLUMN_CNPJ,dummyEmitente.getCNPJ());
        values.put(Contrato.Emitente_TB.COLUMN_RZSOCIAL,dummyEmitente.getRazao_Social());
        values.put(Contrato.Emitente_TB.COLUMN_BANCO, dummyEmitente.getBanco());
        values.put(Contrato.Emitente_TB.COLUMN_AG, dummyEmitente.getAg());
        values.put(Contrato.Emitente_TB.COLUMN_CONTA, dummyEmitente.getConta());
        values.put(Contrato.Emitente_TB.COLUMN_CIDADE, dummyEmitente.getCidade());
        values.put(Contrato.Emitente_TB.COLUMN_UF, dummyEmitente.getUF());

        db.insert(Contrato.Emitente_TB.TABLENAME,null, values);
    }


}
