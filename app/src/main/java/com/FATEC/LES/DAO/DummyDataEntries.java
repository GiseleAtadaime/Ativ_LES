package com.FATEC.LES.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.MainActivity;
import com.FATEC.LES.Model.Cliente;
import com.FATEC.LES.Model.Emitente;
import com.FATEC.LES.Model.Usuario;

public class DummyDataEntries {

    public DummyDataEntries() {
    }

    public void insertUsuario(DBHelper dbHelper){

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

    public void insertEmitente(DBHelper dbHelper){

        Emitente dummyEmitente = new Emitente("755072510001666","Rodrigo e Analu Pizzaria ME",
                233, 938,40193,"Jacareí","SP", "teste@email.com",
                "batata",18170000,235,"Rua da laranja",0001);

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
        values.put(Contrato.Emitente_TB.COLUMN_EMAIL,dummyEmitente.getEmail());
        values.put(Contrato.Emitente_TB.COLUMN_BAIRRO,dummyEmitente.getBairro());
        values.put(Contrato.Emitente_TB.COLUMN_CEP,dummyEmitente.getCep());
        values.put(Contrato.Emitente_TB.COLUMN_NUMERO,dummyEmitente.getNum());
        values.put(Contrato.Emitente_TB.COLUMN_LOGRADOURO,dummyEmitente.getEndereco());

        db.insert(Contrato.Emitente_TB.TABLENAME,null, values);
    }

    public void insertCliente(DBHelper dbHelper){

        Cliente dummyCliente = new Cliente("202356154222288","Cliente teste blablabla LTDA",
                456, 789,12345,"Ribeirão Preto","SP", "testedo cliente@email.com",
                "Feira", 18081000,123,"Perto da praça do mamão",0001,1200.00,"Perto da praça do mamão");

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente.getCli_ID());
        values.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente.getCNPJ());
        values.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente.getRazao_Social());
        values.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente.getBanco());
        values.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente.getAg());
        values.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente.getEndereco());
        values.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente.getConta());
        values.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente.getCidade());
        values.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente.getUF());
        values.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente.getEmail());
        values.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente.getCep());
        values.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente.getCli_Complemento());
        values.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente.getCli_LimCred());
        values.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente.getBairro());
        values.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values);
    }


}
