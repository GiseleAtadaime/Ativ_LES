package com.FATEC.LES.DAO;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

import com.FATEC.LES.Helper.DBHelper;
import com.FATEC.LES.MainActivity;
import com.FATEC.LES.Model.Cliente;
import com.FATEC.LES.Model.Duplicata;
import com.FATEC.LES.Model.Emitente;
import com.FATEC.LES.Model.Parcela;
import com.FATEC.LES.Model.Usuario;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

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

    public void insertDuplicata(DBHelper dbHelper){
        Duplicata dummyDuplicata = new Duplicata(1,1,1);

        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();

        dummyDuplicata.setDup_Status("A");
        dummyDuplicata.setDup_Forma_Pag(2);
        dummyDuplicata.setDup_Data_Emissao(dateFormat.format(date));
        dummyDuplicata.setDup_Valor(1401.00);

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata.getDup_Id_Duplicata());
        values.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata.getDup_Cliente());
        values.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata.getDup_Emitente());
        values.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_ABERTO);
        values.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata.getDup_Data_Emissao());
        values.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata.getDup_Forma_Pag());
        values.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values);
    }

    public void insertParcela(DBHelper dbHelper){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        c.setTime(date);
        c.add(Calendar.MONTH,1);
        date = c.getTime();

        Parcela dummyParcela1 = new Parcela(1,1);
        dummyParcela1.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela1.setPar_Valor(1200.50);
        dummyParcela1.setPar_Moeda("Real");
        dummyParcela1.setPar_Data_Pag(null);
        dummyParcela1.setPar_Valor_Pag(null);
        dummyParcela1.setPar_Desconto(0.0);
        dummyParcela1.setPar_Juros(0.0);
        dummyParcela1.setPar_Status(Contrato.Parcela_TB.STATUS_ABERTO);
        dummyParcela1.setPar_Banco(0);

        SQLiteDatabase db = dbHelper.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela1.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela1.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela1.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela1.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela1.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela1.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela1.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela1.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela1.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela1.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela1.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        c.add(Calendar.MONTH,1);
        date = c.getTime();

        Parcela dummyParcela2 = new Parcela(2,1);
        dummyParcela2.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela2.setPar_Valor(1200.50);
        dummyParcela2.setPar_Moeda("Real");
        dummyParcela2.setPar_Data_Pag(null);
        dummyParcela2.setPar_Valor_Pag(null);
        dummyParcela2.setPar_Desconto(0.0);
        dummyParcela2.setPar_Juros(0.0);
        dummyParcela2.setPar_Status(Contrato.Parcela_TB.STATUS_ABERTO);
        dummyParcela2.setPar_Banco(0);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela2.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela2.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela2.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela2.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela2.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela2.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela2.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela2.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela2.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela2.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela2.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);
    }

}
