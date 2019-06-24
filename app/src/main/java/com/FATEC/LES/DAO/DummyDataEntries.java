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
        dummyUsuario.setUsr_Apelido("admin");
        dummyUsuario.setUsr_Status(Contrato.UsuarioTB.STATUS_ACTIVE);
        dummyUsuario.setUsr_Nome("Administrador");
        dummyUsuario.setUsr_Email("admin@gmail.com");
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


        Usuario dummyUsuario2 = new Usuario(2);
        dummyUsuario2.setUsr_Apelido("Gisele");
        dummyUsuario2.setUsr_Status(Contrato.UsuarioTB.STATUS_ACTIVE);
        dummyUsuario2.setUsr_Nome("Gisele Atadaime");
        dummyUsuario2.setUsr_Email("gi_atadaime@gmail.com");
        dummyUsuario2.setUsr_Senha(54321);

        ContentValues values2 = new ContentValues();
        values2.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario2.getUsr_Codigo());
        values2.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario2.getUsr_Apelido());
        values2.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario2.getUsr_Nome());
        values2.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario2.getUsr_Status());
        values2.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario2.getUsr_Email());
        values2.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario2.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values2);



        Usuario dummyUsuario3 = new Usuario(3);
        dummyUsuario3.setUsr_Apelido("Lucas");
        dummyUsuario3.setUsr_Status(Contrato.UsuarioTB.STATUS_ACTIVE);
        dummyUsuario3.setUsr_Nome("Lucas Alexandre");
        dummyUsuario3.setUsr_Email("lucas_alexandre@gmail.com");
        dummyUsuario3.setUsr_Senha(11111);

        ContentValues values3 = new ContentValues();
        values3.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario3.getUsr_Codigo());
        values3.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario3.getUsr_Apelido());
        values3.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario3.getUsr_Nome());
        values3.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario3.getUsr_Status());
        values3.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario3.getUsr_Email());
        values3.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario3.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values3);


        Usuario dummyUsuario4 = new Usuario(4);
        dummyUsuario4.setUsr_Apelido("Matheus");
        dummyUsuario4.setUsr_Status(Contrato.UsuarioTB.STATUS_ACTIVE);
        dummyUsuario4.setUsr_Nome("Matheus Giardini");
        dummyUsuario4.setUsr_Email("matheus_giardini@gmail.com");
        dummyUsuario4.setUsr_Senha(22222);


        ContentValues values4 = new ContentValues();
        values4.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario4.getUsr_Codigo());
        values4.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario4.getUsr_Apelido());
        values4.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario4.getUsr_Nome());
        values4.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario4.getUsr_Status());
        values4.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario4.getUsr_Email());
        values4.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario4.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values4);

        Usuario dummyUsuario5 = new Usuario(5);
        dummyUsuario5.setUsr_Apelido("Raphain");
        dummyUsuario5.setUsr_Status(Contrato.UsuarioTB.STATUS_ACTIVE);
        dummyUsuario5.setUsr_Nome("Raphain Moraes");
        dummyUsuario5.setUsr_Email("raphain_moraes@gmail.com");
        dummyUsuario5.setUsr_Senha(33333);



        ContentValues values5 = new ContentValues();
        values5.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario5.getUsr_Codigo());
        values5.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario5.getUsr_Apelido());
        values5.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario5.getUsr_Nome());
        values5.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario5.getUsr_Status());
        values5.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario5.getUsr_Email());
        values5.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario5.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values5);


        Usuario dummyUsuario6 = new Usuario(6);
        dummyUsuario6.setUsr_Apelido("Tadeu");
        dummyUsuario6.setUsr_Status(Contrato.UsuarioTB.STATUS_DISABLED);
        dummyUsuario6.setUsr_Nome("Tadeu Schimit");
        dummyUsuario6.setUsr_Email("tadeu_schimit@gmail.com");
        dummyUsuario6.setUsr_Senha(44444);



        ContentValues values6 = new ContentValues();
        values6.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario6.getUsr_Codigo());
        values6.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario6.getUsr_Apelido());
        values6.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario6.getUsr_Nome());
        values6.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario6.getUsr_Status());
        values6.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario6.getUsr_Email());
        values6.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario6.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values6);

        Usuario dummyUsuario7 = new Usuario(7);
        dummyUsuario7.setUsr_Apelido("Glenda");
        dummyUsuario7.setUsr_Status(Contrato.UsuarioTB.STATUS_DISABLED);
        dummyUsuario7.setUsr_Nome("Glenda Ramos");
        dummyUsuario7.setUsr_Email("glenda_ramos@gmail.com");
        dummyUsuario7.setUsr_Senha(55555);



        ContentValues values7 = new ContentValues();
        values7.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario7.getUsr_Codigo());
        values7.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario7.getUsr_Apelido());
        values7.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario7.getUsr_Nome());
        values7.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario7.getUsr_Status());
        values7.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario7.getUsr_Email());
        values7.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario7.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values7);

        Usuario dummyUsuario8 = new Usuario(8);
        dummyUsuario8.setUsr_Apelido("Fred");
        dummyUsuario8.setUsr_Status(Contrato.UsuarioTB.STATUS_DISABLED);
        dummyUsuario8.setUsr_Nome("Fred Bueno");
        dummyUsuario8.setUsr_Email("fred_bueno@gmail.com");
        dummyUsuario8.setUsr_Senha(66666);



        ContentValues values8 = new ContentValues();
        values8.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario8.getUsr_Codigo());
        values8.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario8.getUsr_Apelido());
        values8.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario8.getUsr_Nome());
        values8.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario8.getUsr_Status());
        values8.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario8.getUsr_Email());
        values8.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario8.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values8);


        Usuario dummyUsuario9 = new Usuario(9);
        dummyUsuario9.setUsr_Apelido("Thiago");
        dummyUsuario9.setUsr_Status(Contrato.UsuarioTB.STATUS_DISABLED);
        dummyUsuario9.setUsr_Nome("Thiago Batista");
        dummyUsuario9.setUsr_Email("thiago_batista@gmail.com");
        dummyUsuario9.setUsr_Senha(77777);



        ContentValues values9 = new ContentValues();
        values9.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario9.getUsr_Codigo());
        values9.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario9.getUsr_Apelido());
        values9.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario9.getUsr_Nome());
        values9.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario9.getUsr_Status());
        values9.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario9.getUsr_Email());
        values9.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario9.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values9);


        Usuario dummyUsuario10 = new Usuario(10);
        dummyUsuario10.setUsr_Apelido("Daniela");
        dummyUsuario10.setUsr_Status(Contrato.UsuarioTB.STATUS_ACTIVE);
        dummyUsuario10.setUsr_Nome("Daniela Lima");
        dummyUsuario10.setUsr_Email("daniela_lima@gmail.com");
        dummyUsuario10.setUsr_Senha(88888);



        ContentValues values10 = new ContentValues();
        values10.put(Contrato.UsuarioTB.COLUMN_KEY,dummyUsuario10.getUsr_Codigo());
        values10.put(Contrato.UsuarioTB.COLUMN_APELIDO,dummyUsuario10.getUsr_Apelido());
        values10.put(Contrato.UsuarioTB.COLUMN_NOME,dummyUsuario10.getUsr_Nome());
        values10.put(Contrato.UsuarioTB.COLUMN_STATUS, dummyUsuario10.getUsr_Status());
        values10.put(Contrato.UsuarioTB.COLUMN_EMAIL, dummyUsuario10.getUsr_Email());
        values10.put(Contrato.UsuarioTB.COLUMN_SENHA, dummyUsuario10.getUsr_Senha());

        db.insert(Contrato.UsuarioTB.TABLENAME, null,values10);


    }

    public void insertEmitente(DBHelper dbHelper){

        Emitente dummyEmitente = new Emitente("75507251000166","Rodrigo e Analu Pizzaria ME",
                233, 938,40193,"Jacareí","SP", "contato@ropizza.com",
                "Batata",18170000,235,"Rua da Laranja",0001);

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


        Emitente dummyEmitente2 = new Emitente("97893746000103","FazTec LTDA",
                001, 453,72635,"Sorocaba","SP", "contato@faztec.com",
                "Campolim",18185020,45,"Rua Holys",0002);


        ContentValues values2 = new ContentValues();
        values2.put(Contrato.Emitente_TB.COLUMN_ID, dummyEmitente2.getEmi_ID());
        values2.put(Contrato.Emitente_TB.COLUMN_CNPJ,dummyEmitente2.getCNPJ());
        values2.put(Contrato.Emitente_TB.COLUMN_RZSOCIAL,dummyEmitente2.getRazao_Social());
        values2.put(Contrato.Emitente_TB.COLUMN_BANCO, dummyEmitente2.getBanco());
        values2.put(Contrato.Emitente_TB.COLUMN_AG, dummyEmitente2.getAg());
        values2.put(Contrato.Emitente_TB.COLUMN_CONTA, dummyEmitente2.getConta());
        values2.put(Contrato.Emitente_TB.COLUMN_CIDADE, dummyEmitente2.getCidade());
        values2.put(Contrato.Emitente_TB.COLUMN_UF, dummyEmitente2.getUF());
        values2.put(Contrato.Emitente_TB.COLUMN_EMAIL,dummyEmitente2.getEmail());
        values2.put(Contrato.Emitente_TB.COLUMN_BAIRRO,dummyEmitente2.getBairro());
        values2.put(Contrato.Emitente_TB.COLUMN_CEP,dummyEmitente2.getCep());
        values2.put(Contrato.Emitente_TB.COLUMN_NUMERO,dummyEmitente2.getNum());
        values2.put(Contrato.Emitente_TB.COLUMN_LOGRADOURO,dummyEmitente2.getEndereco());

        db.insert(Contrato.Emitente_TB.TABLENAME,null, values2);


        Emitente dummyEmitente3 = new Emitente("45878751000156","Blank LTDA",
                341, 5503,48970,"Santos","SP", "contato@blank.com",
                "Aparecida",11040290,631,"Rua Oscar Sampaio",0003);


        ContentValues values3 = new ContentValues();
        values3.put(Contrato.Emitente_TB.COLUMN_ID, dummyEmitente3.getEmi_ID());
        values3.put(Contrato.Emitente_TB.COLUMN_CNPJ,dummyEmitente3.getCNPJ());
        values3.put(Contrato.Emitente_TB.COLUMN_RZSOCIAL,dummyEmitente3.getRazao_Social());
        values3.put(Contrato.Emitente_TB.COLUMN_BANCO, dummyEmitente3.getBanco());
        values3.put(Contrato.Emitente_TB.COLUMN_AG, dummyEmitente3.getAg());
        values3.put(Contrato.Emitente_TB.COLUMN_CONTA, dummyEmitente3.getConta());
        values3.put(Contrato.Emitente_TB.COLUMN_CIDADE, dummyEmitente3.getCidade());
        values3.put(Contrato.Emitente_TB.COLUMN_UF, dummyEmitente3.getUF());
        values3.put(Contrato.Emitente_TB.COLUMN_EMAIL,dummyEmitente3.getEmail());
        values3.put(Contrato.Emitente_TB.COLUMN_BAIRRO,dummyEmitente3.getBairro());
        values3.put(Contrato.Emitente_TB.COLUMN_CEP,dummyEmitente3.getCep());
        values3.put(Contrato.Emitente_TB.COLUMN_NUMERO,dummyEmitente3.getNum());
        values3.put(Contrato.Emitente_TB.COLUMN_LOGRADOURO,dummyEmitente3.getEndereco());

        db.insert(Contrato.Emitente_TB.TABLENAME,null, values3);


        Emitente dummyEmitente4 = new Emitente("45878751000156","Blank LTDA",
                341, 5503,48970,"Santos","SP", "contato@blank.com",
                "Aparecida",11040290,631,"Rua Oscar Sampaio",0003);


        ContentValues values4 = new ContentValues();
        values4.put(Contrato.Emitente_TB.COLUMN_ID, dummyEmitente4.getEmi_ID());
        values4.put(Contrato.Emitente_TB.COLUMN_CNPJ,dummyEmitente4.getCNPJ());
        values4.put(Contrato.Emitente_TB.COLUMN_RZSOCIAL,dummyEmitente4.getRazao_Social());
        values4.put(Contrato.Emitente_TB.COLUMN_BANCO, dummyEmitente4.getBanco());
        values4.put(Contrato.Emitente_TB.COLUMN_AG, dummyEmitente4.getAg());
        values4.put(Contrato.Emitente_TB.COLUMN_CONTA, dummyEmitente4.getConta());
        values4.put(Contrato.Emitente_TB.COLUMN_CIDADE, dummyEmitente4.getCidade());
        values4.put(Contrato.Emitente_TB.COLUMN_UF, dummyEmitente4.getUF());
        values4.put(Contrato.Emitente_TB.COLUMN_EMAIL,dummyEmitente4.getEmail());
        values4.put(Contrato.Emitente_TB.COLUMN_BAIRRO,dummyEmitente4.getBairro());
        values4.put(Contrato.Emitente_TB.COLUMN_CEP,dummyEmitente4.getCep());
        values4.put(Contrato.Emitente_TB.COLUMN_NUMERO,dummyEmitente4.getNum());
        values4.put(Contrato.Emitente_TB.COLUMN_LOGRADOURO,dummyEmitente4.getEndereco());

        db.insert(Contrato.Emitente_TB.TABLENAME,null, values4);


    }







    public void insertCliente(DBHelper dbHelper){

        Cliente dummyCliente = new Cliente("44845159000182","Daniel e Josefa Doces & Salgados ME",
                237, 606,133554,"Bragança Paulista","SP", "contato@docesalgados.com",
                "Cruzeiro", 12906365,276,"Rua Doutor Moacir Rodrigues Neto",0001,25000.00," ");

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


        Cliente dummyCliente2 = new Cliente("85389782000155","Simone e Heitor Eletrônica ME",
                33, 2154,45559,"Ribeirão Preto","SP", "contato@sheletronica.com",
                "Vila Amélia", 14050320,916,"Rua Antônio Guimarães",0002,20000.00," ");


        ContentValues values2 = new ContentValues();
        values2.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente2.getCli_ID());
        values2.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente2.getCNPJ());
        values2.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente2.getRazao_Social());
        values2.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente2.getBanco());
        values2.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente2.getAg());
        values2.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente2.getEndereco());
        values2.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente2.getConta());
        values2.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente2.getCidade());
        values2.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente2.getUF());
        values2.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente2.getEmail());
        values2.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente2.getCep());
        values2.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente2.getCli_Complemento());
        values2.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente2.getCli_LimCred());
        values2.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente2.getBairro());
        values2.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente2.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values2);


        Cliente dummyCliente3 = new Cliente("13932668000119","Andrea Informática ME",
                341, 3102,10231,"Atibaia","SP", "contato@ainformatica.com",
                "Jd Camandocaia", 13905111,702,"Rua Bélgica",0003,35000.00," ");


        ContentValues values3 = new ContentValues();
        values3.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente3.getCli_ID());
        values3.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente3.getCNPJ());
        values3.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente3.getRazao_Social());
        values3.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente3.getBanco());
        values3.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente3.getAg());
        values3.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente3.getEndereco());
        values3.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente3.getConta());
        values3.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente3.getCidade());
        values3.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente3.getUF());
        values3.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente3.getEmail());
        values3.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente3.getCep());
        values3.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente3.getCli_Complemento());
        values3.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente3.getCli_LimCred());
        values3.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente3.getBairro());
        values3.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente3.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values3);

        Cliente dummyCliente4 = new Cliente("65786181000179","Clara Financeira ME",
                745, 555,24587,"Sumaré","SP", "contato@cfinanceira.com",
                "Santa Joana", 13181363,233,"Rua Oito",0004,15000.00," ");


        ContentValues values4 = new ContentValues();
        values4.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente4.getCli_ID());
        values4.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente4.getCNPJ());
        values4.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente4.getRazao_Social());
        values4.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente4.getBanco());
        values4.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente4.getAg());
        values4.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente4.getEndereco());
        values4.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente4.getConta());
        values4.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente4.getCidade());
        values4.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente4.getUF());
        values4.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente4.getEmail());
        values4.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente4.getCep());
        values4.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente4.getCli_Complemento());
        values4.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente4.getCli_LimCred());
        values4.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente4.getBairro());
        values4.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente4.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values4);

        Cliente dummyCliente5 = new Cliente("82104591000101","BIG Esportes ME",
                422, 4103,35489,"Maringá","PR", "contato@bigesportes.com",
                "Centro", 86742970,145,"Avenida João Daniel Machado Benetti",0005,10000.00,"CJ 54");


        ContentValues values5 = new ContentValues();
        values5.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente5.getCli_ID());
        values5.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente5.getCNPJ());
        values5.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente5.getRazao_Social());
        values5.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente5.getBanco());
        values5.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente5.getAg());
        values5.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente5.getEndereco());
        values5.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente5.getConta());
        values5.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente5.getCidade());
        values5.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente5.getUF());
        values5.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente5.getEmail());
        values5.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente5.getCep());
        values5.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente5.getCli_Complemento());
        values5.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente5.getCli_LimCred());
        values5.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente5.getBairro());
        values5.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente5.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values5);

        Cliente dummyCliente6 = new Cliente("95134943000113","Alexandre e Stella Vidros Ltda",
                740, 321,45688,"Juiz de Fora","MG", "contato@asvidros.com",
                "Mariano Procópio", 36080080,131,"Rua Coronel Vidal",0006,5000.00,"CJ 9");


        ContentValues values6 = new ContentValues();
        values6.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente6.getCli_ID());
        values6.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente6.getCNPJ());
        values6.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente6.getRazao_Social());
        values6.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente6.getBanco());
        values6.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente6.getAg());
        values6.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente6.getEndereco());
        values6.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente6.getConta());
        values6.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente6.getCidade());
        values6.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente6.getUF());
        values6.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente6.getEmail());
        values6.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente6.getCep());
        values6.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente6.getCli_Complemento());
        values6.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente6.getCli_LimCred());
        values6.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente6.getBairro());
        values6.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente6.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values6);


        Cliente dummyCliente7 = new Cliente("79211910000173","Pink Elephant Casa Noturna ME",
                237, 4894,12548,"Belo Horizonte","MG", "contato@peclub.com",
                "Centro", 30240098,277,"Beco da Efigênia",0007,60000.00," ");


        ContentValues values7 = new ContentValues();
        values7.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente7.getCli_ID());
        values7.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente7.getCNPJ());
        values7.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente7.getRazao_Social());
        values7.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente7.getBanco());
        values7.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente7.getAg());
        values7.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente7.getEndereco());
        values7.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente7.getConta());
        values7.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente7.getCidade());
        values7.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente7.getUF());
        values7.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente7.getEmail());
        values7.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente7.getCep());
        values7.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente7.getCli_Complemento());
        values7.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente7.getCli_LimCred());
        values7.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente7.getBairro());
        values7.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente7.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values7);

        Cliente dummyCliente8 = new Cliente("94566960000167","Milena Telecomunicações Ltda",
                341, 4712,33568,"Belo Horizonte","MG", "contato@mtele.com",
                "Ouro Preto", 31310190,186,"Rua Frei Leopoldo",8,5000.00,"CJ 12");


        ContentValues values8 = new ContentValues();
        values8.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente8.getCli_ID());
        values8.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente8.getCNPJ());
        values8.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente8.getRazao_Social());
        values8.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente8.getBanco());
        values8.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente8.getAg());
        values8.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente8.getEndereco());
        values8.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente8.getConta());
        values8.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente8.getCidade());
        values8.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente8.getUF());
        values8.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente8.getEmail());
        values8.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente8.getCep());
        values8.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente8.getCli_Complemento());
        values8.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente8.getCli_LimCred());
        values8.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente8.getBairro());
        values8.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente8.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values8);


        Cliente dummyCliente9 = new Cliente("23082064000184","Julio e Francisco Corretores Associados ME",
                745, 987,48956,"Vitória","ES", "contato@jfcorretores.com",
                "Centro", 29052045,300,"Escadaria Ademir de Alcântara Ascaciba",9,5000.00," ");


        ContentValues values9 = new ContentValues();
        values9.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente9.getCli_ID());
        values9.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente9.getCNPJ());
        values9.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente9.getRazao_Social());
        values9.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente9.getBanco());
        values9.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente9.getAg());
        values9.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente9.getEndereco());
        values9.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente9.getConta());
        values9.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente9.getCidade());
        values9.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente9.getUF());
        values9.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente9.getEmail());
        values9.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente9.getCep());
        values9.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente9.getCli_Complemento());
        values9.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente9.getCli_LimCred());
        values9.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente9.getBairro());
        values9.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente9.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values9);

        Cliente dummyCliente10 = new Cliente("75507251000166","Rodrigo e Analu Pizzaria ME",
                1, 938,40193,"Jacareí","SP", "contato@asvidros.com",
                "Veraneio Irajá", 12326300,599,"Avenida Guararema",10,30000.00," ");


        ContentValues values10 = new ContentValues();
        values10.put(Contrato.Cliente_TB.COLUMN_ID, dummyCliente10.getCli_ID());
        values10.put(Contrato.Cliente_TB.COLUMN_CNPJ,dummyCliente10.getCNPJ());
        values10.put(Contrato.Cliente_TB.COLUMN_RZSOCIAL,dummyCliente10.getRazao_Social());
        values10.put(Contrato.Cliente_TB.COLUMN_BANCO, dummyCliente10.getBanco());
        values10.put(Contrato.Cliente_TB.COLUMN_AG, dummyCliente10.getAg());
        values10.put(Contrato.Cliente_TB.COLUMN_LOGRADOURO,dummyCliente10.getEndereco());
        values10.put(Contrato.Cliente_TB.COLUMN_CONTA, dummyCliente10.getConta());
        values10.put(Contrato.Cliente_TB.COLUMN_CIDADE, dummyCliente10.getCidade());
        values10.put(Contrato.Cliente_TB.COLUMN_UF, dummyCliente10.getUF());
        values10.put(Contrato.Cliente_TB.COLUMN_EMAIL,dummyCliente10.getEmail());
        values10.put(Contrato.Cliente_TB.COLUMN_CEP,dummyCliente10.getCep());
        values10.put(Contrato.Cliente_TB.COLUMN_COMPLE,dummyCliente10.getCli_Complemento());
        values10.put(Contrato.Cliente_TB.COLUMN_LIMCRED,dummyCliente10.getCli_LimCred());
        values10.put(Contrato.Cliente_TB.COLUMN_BAIRRO,dummyCliente10.getBairro());
        values10.put(Contrato.Cliente_TB.COLUMN_NUMERO,dummyCliente10.getNum());

        db.insert(Contrato.Cliente_TB.TABLENAME,null, values10);


    }

    public void insertDuplicata(DBHelper dbHelper){

        Duplicata dummyDuplicata = new Duplicata(1,1,10);

        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();

        dummyDuplicata.setDup_Status("A");
        dummyDuplicata.setDup_Forma_Pag(2);
        dummyDuplicata.setDup_Data_Emissao(dateFormat.format(2019-05-22));
        dummyDuplicata.setDup_Valor(2401.00);

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


        Duplicata dummyDuplicata2 = new Duplicata(2,1,1);

        dummyDuplicata2.setDup_Status("V");
        dummyDuplicata2.setDup_Forma_Pag(1);
        dummyDuplicata2.setDup_Data_Emissao(dateFormat.format(2019-03-22));
        dummyDuplicata2.setDup_Valor(5000.00);


        ContentValues values2 = new ContentValues();
        values2.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata2.getDup_Id_Duplicata());
        values2.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata2.getDup_Cliente());
        values2.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata2.getDup_Emitente());
        values2.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_VENCIDO);
        values2.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata2.getDup_Data_Emissao());
        values2.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata2.getDup_Forma_Pag());
        values2.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata2.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values2);

        Duplicata dummyDuplicata3 = new Duplicata(3,1,2);

        dummyDuplicata3.setDup_Status("F");
        dummyDuplicata3.setDup_Forma_Pag(1);
        dummyDuplicata3.setDup_Data_Emissao(dateFormat.format(2019-04-15));
        dummyDuplicata3.setDup_Valor(2500.00);


        ContentValues values3 = new ContentValues();
        values3.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata3.getDup_Id_Duplicata());
        values3.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata3.getDup_Cliente());
        values3.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata3.getDup_Emitente());
        values3.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_FECHADO);
        values3.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata3.getDup_Data_Emissao());
        values3.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata3.getDup_Forma_Pag());
        values3.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata3.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values3);

        Duplicata dummyDuplicata4 = new Duplicata(4,1,3);

        dummyDuplicata4.setDup_Status("V");
        dummyDuplicata4.setDup_Forma_Pag(1);
        dummyDuplicata4.setDup_Data_Emissao(dateFormat.format(2019-02-22));
        dummyDuplicata4.setDup_Valor(3000.00);


        ContentValues values4 = new ContentValues();
        values4.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata4.getDup_Id_Duplicata());
        values4.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata4.getDup_Cliente());
        values4.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata4.getDup_Emitente());
        values4.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_VENCIDO);
        values4.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata4.getDup_Data_Emissao());
        values4.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata4.getDup_Forma_Pag());
        values4.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata4.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values4);

        Duplicata dummyDuplicata5 = new Duplicata(5,1,4);

        dummyDuplicata5.setDup_Status("V");
        dummyDuplicata5.setDup_Forma_Pag(1);
        dummyDuplicata5.setDup_Data_Emissao(dateFormat.format(2019-01-22));
        dummyDuplicata5.setDup_Valor(4000.00);


        ContentValues values5 = new ContentValues();
        values5.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata5.getDup_Id_Duplicata());
        values5.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata5.getDup_Cliente());
        values5.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata5.getDup_Emitente());
        values5.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_VENCIDO);
        values5.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata5.getDup_Data_Emissao());
        values5.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata5.getDup_Forma_Pag());
        values5.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata5.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values5);

        Duplicata dummyDuplicata6 = new Duplicata(6,1,5);

        dummyDuplicata6.setDup_Status("A");
        dummyDuplicata6.setDup_Forma_Pag(3);
        dummyDuplicata6.setDup_Data_Emissao(dateFormat.format(2019-05-20));
        dummyDuplicata6.setDup_Valor(1500.00);


        ContentValues values6 = new ContentValues();
        values6.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata6.getDup_Id_Duplicata());
        values6.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata6.getDup_Cliente());
        values6.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata6.getDup_Emitente());
        values6.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_ABERTO);
        values6.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata6.getDup_Data_Emissao());
        values6.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata6.getDup_Forma_Pag());
        values6.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata3.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values6);

        Duplicata dummyDuplicata7 = new Duplicata(7,1,6);

        dummyDuplicata7.setDup_Status("A");
        dummyDuplicata7.setDup_Forma_Pag(2);
        dummyDuplicata7.setDup_Data_Emissao(dateFormat.format(2019-04-30));
        dummyDuplicata7.setDup_Valor(2000.00);


        ContentValues values7 = new ContentValues();
        values7.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata7.getDup_Id_Duplicata());
        values7.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata7.getDup_Cliente());
        values7.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata7.getDup_Emitente());
        values7.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_ABERTO);
        values7.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata7.getDup_Data_Emissao());
        values7.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata7.getDup_Forma_Pag());
        values7.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata7.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values7);

        Duplicata dummyDuplicata8 = new Duplicata(8,1,7);

        dummyDuplicata8.setDup_Status("F");
        dummyDuplicata8.setDup_Forma_Pag(4);
        dummyDuplicata8.setDup_Data_Emissao(dateFormat.format(2019-01-01));
        dummyDuplicata8.setDup_Valor(50000.00);


        ContentValues values8 = new ContentValues();
        values8.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata8.getDup_Id_Duplicata());
        values8.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata8.getDup_Cliente());
        values8.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata8.getDup_Emitente());
        values8.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_FECHADO);
        values8.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata8.getDup_Data_Emissao());
        values8.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata8.getDup_Forma_Pag());
        values8.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata8.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values8);

        Duplicata dummyDuplicata9 = new Duplicata(9,1,8);

        dummyDuplicata9.setDup_Status("A");
        dummyDuplicata9.setDup_Forma_Pag(2);
        dummyDuplicata9.setDup_Data_Emissao(dateFormat.format(2019-04-27));
        dummyDuplicata9.setDup_Valor(3000.00);


        ContentValues values9 = new ContentValues();
        values9.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata9.getDup_Id_Duplicata());
        values9.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata9.getDup_Cliente());
        values9.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata9.getDup_Emitente());
        values9.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_ABERTO);
        values9.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata9.getDup_Data_Emissao());
        values9.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata9.getDup_Forma_Pag());
        values9.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata9.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values9);

        Duplicata dummyDuplicata10 = new Duplicata(10,1,9);

        dummyDuplicata10.setDup_Status("F");
        dummyDuplicata10.setDup_Forma_Pag(3);
        dummyDuplicata10.setDup_Data_Emissao(dateFormat.format(2019-01-02));
        dummyDuplicata10.setDup_Valor(1000.00);


        ContentValues values10 = new ContentValues();
        values10.put(Contrato.Duplicata_TB.COLUMN_ID_DUP, dummyDuplicata10.getDup_Id_Duplicata());
        values10.put(Contrato.Duplicata_TB.COLUMN_ID_CLI, dummyDuplicata10.getDup_Cliente());
        values10.put(Contrato.Duplicata_TB.COLUMN_ID_EMI, dummyDuplicata10.getDup_Emitente());
        values10.put(Contrato.Duplicata_TB.COLUMN_STATUS, Contrato.Duplicata_TB.STATUS_FECHADO);
        values10.put(Contrato.Duplicata_TB.COLUMN_DT_EMI, dummyDuplicata10.getDup_Data_Emissao());
        values10.put(Contrato.Duplicata_TB.COLUMN_FORMA_PAG, dummyDuplicata10.getDup_Forma_Pag());
        values10.put(Contrato.Duplicata_TB.COLUMN_VALOR, dummyDuplicata10.getDup_Valor());

        db.insert(Contrato.Duplicata_TB.TABLENAME,null, values10);




    }

    public void insertParcela(DBHelper dbHelper){
        Calendar c = Calendar.getInstance();
        SimpleDateFormat dateFormat = new SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();
        c.clear();
        c.set(2019,6,21);

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
        dummyParcela1.setPar_Banco(1);

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
        dummyParcela2.setPar_Banco(1);

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


        Parcela dummyParcela3 = new Parcela(3,2);

        c.set(2019,4,22);

        date = c.getTime();

        dummyParcela3.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela3.setPar_Valor(5000.00);
        dummyParcela3.setPar_Moeda("Real");
        dummyParcela3.setPar_Data_Pag(null);
        dummyParcela3.setPar_Valor_Pag(null);
        dummyParcela3.setPar_Desconto(0.0);
        dummyParcela3.setPar_Juros(2555.10);
        dummyParcela3.setPar_Status(Contrato.Parcela_TB.STATUS_VENCIDO);
        dummyParcela3.setPar_Banco(237);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela3.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela3.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela3.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela3.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela3.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela3.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela3.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela3.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela3.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela3.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela3.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        c.add(Calendar.MONTH, 1);
        date = c.getTime();

        Parcela dummyParcela4 = new Parcela(4,3);
        dummyParcela4.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela4.setPar_Valor(2500.00);
        dummyParcela4.setPar_Moeda("Real");
        dummyParcela4.setPar_Data_Pag(dateFormat.format(date));
        dummyParcela4.setPar_Valor_Pag(2000.0);
        dummyParcela4.setPar_Desconto(0.0);
        dummyParcela4.setPar_Juros(0.0);
        dummyParcela4.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela4.setPar_Banco(33);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela4.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela4.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela4.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela4.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela4.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela4.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela4.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela4.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela4.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela4.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela4.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela5 = new Parcela(5,4);

        c.set(2019,3,22);

        date = c.getTime();


        dummyParcela5.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela5.setPar_Valor(3000.00);
        dummyParcela5.setPar_Moeda("Real");
        dummyParcela5.setPar_Data_Pag(null);
        dummyParcela5.setPar_Valor_Pag(0.0);
        dummyParcela5.setPar_Desconto(0.0);
        dummyParcela5.setPar_Juros(2464.92);
        dummyParcela5.setPar_Status(Contrato.Parcela_TB.STATUS_VENCIDO);
        dummyParcela5.setPar_Banco(341);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela5.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela5.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela5.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela5.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela5.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela5.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela5.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela5.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela5.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela5.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela5.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela6 = new Parcela(6,5);

        c.set(2019,2,22);
        date = c.getTime();

        dummyParcela5.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela6.setPar_Valor(4000.00);
        dummyParcela6.setPar_Moeda("Real");
        dummyParcela6.setPar_Data_Pag(null);
        dummyParcela6.setPar_Valor_Pag(0.0);
        dummyParcela6.setPar_Desconto(0.0);
        dummyParcela6.setPar_Juros(4408.80);
        dummyParcela6.setPar_Status(Contrato.Parcela_TB.STATUS_VENCIDO);
        dummyParcela6.setPar_Banco(745);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela6.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela6.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela6.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela6.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela6.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela6.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela6.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela6.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela6.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela6.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela6.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela7 = new Parcela(7,6);

        c.set(2019,6,20);
        date = c.getTime();

        dummyParcela7.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela7.setPar_Valor(500.00);
        dummyParcela7.setPar_Moeda("Real");
        dummyParcela7.setPar_Data_Pag(null);
        dummyParcela7.setPar_Valor_Pag(null);
        dummyParcela7.setPar_Desconto(0.0);
        dummyParcela7.setPar_Juros(0.0);
        dummyParcela7.setPar_Status(Contrato.Parcela_TB.STATUS_ABERTO);
        dummyParcela7.setPar_Banco(422);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela7.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela7.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela7.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela7.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela7.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela7.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela7.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela7.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela7.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela7.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela7.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);


        c.add(Calendar.MONTH, 1);
        date = c.getTime();

        Parcela dummyParcela8 = new Parcela(8,6);
        dummyParcela8.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela8.setPar_Valor(500.00);
        dummyParcela8.setPar_Moeda("Real");
        dummyParcela8.setPar_Data_Pag(null);
        dummyParcela8.setPar_Valor_Pag(null);
        dummyParcela8.setPar_Desconto(0.0);
        dummyParcela8.setPar_Juros(0.0);
        dummyParcela8.setPar_Status(Contrato.Parcela_TB.STATUS_ABERTO);
        dummyParcela8.setPar_Banco(422);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela8.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela8.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela8.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela8.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela8.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela8.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela8.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela8.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela8.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela8.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela8.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        c.add(Calendar.MONTH, 1);
        date = c.getTime();

        Parcela dummyParcela9 = new Parcela(9,6);
        dummyParcela9.setPar_Data_Venc(dateFormat.format(date));
        dummyParcela9.setPar_Valor(500.00);
        dummyParcela9.setPar_Moeda("Real");
        dummyParcela9.setPar_Data_Pag(null);
        dummyParcela9.setPar_Valor_Pag(null);
        dummyParcela9.setPar_Desconto(0.0);
        dummyParcela9.setPar_Juros(0.0);
        dummyParcela9.setPar_Status(Contrato.Parcela_TB.STATUS_ABERTO);
        dummyParcela9.setPar_Banco(422);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela9.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela9.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela9.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela9.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela9.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela9.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela9.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela9.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela9.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela9.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela9.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        c.set(2019,4,22);

        date = c.getTime();

        Parcela dummyParcela10 = new Parcela(10,7);
        dummyParcela10.setPar_Data_Venc(dateFormat.format(2019-05-30));
        dummyParcela10.setPar_Valor(1000.00);
        dummyParcela10.setPar_Moeda("Real");
        dummyParcela10.setPar_Data_Pag(dateFormat.format(2019-05-30));
        dummyParcela10.setPar_Valor_Pag(1000.00);
        dummyParcela10.setPar_Desconto(0.0);
        dummyParcela10.setPar_Juros(0.0);
        dummyParcela10.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela10.setPar_Banco(740);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela10.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela10.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela10.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela10.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela10.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela10.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela10.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela10.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela10.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela10.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela10.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela11 = new Parcela(11,7);
        dummyParcela11.setPar_Data_Venc(dateFormat.format(2019-06-30));
        dummyParcela11.setPar_Valor(1000.00);
        dummyParcela11.setPar_Moeda("Real");
        dummyParcela11.setPar_Data_Pag(null);
        dummyParcela11.setPar_Valor_Pag(null);
        dummyParcela11.setPar_Desconto(0.0);
        dummyParcela11.setPar_Juros(0.0);
        dummyParcela11.setPar_Status(Contrato.Parcela_TB.STATUS_ABERTO);
        dummyParcela11.setPar_Banco(740);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela11.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela11.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela11.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela11.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela11.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela11.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela11.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela11.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela11.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela11.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela11.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);


        Parcela dummyParcela12 = new Parcela(12,8);
        dummyParcela12.setPar_Data_Venc(dateFormat.format(2019-02-01));
        dummyParcela12.setPar_Valor(12500.00);
        dummyParcela12.setPar_Moeda("Real");
        dummyParcela12.setPar_Data_Pag(dateFormat.format(2019-02-01));
        dummyParcela12.setPar_Valor_Pag(12500.00);
        dummyParcela12.setPar_Desconto(0.0);
        dummyParcela12.setPar_Juros(0.0);
        dummyParcela12.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela12.setPar_Banco(237);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela12.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela12.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela12.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela12.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela12.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela12.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela12.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela12.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela12.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela12.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela12.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);


        Parcela dummyParcela13 = new Parcela(13,8);
        dummyParcela13.setPar_Data_Venc(dateFormat.format(2019-03-01));
        dummyParcela13.setPar_Valor(12500.00);
        dummyParcela13.setPar_Moeda("Real");
        dummyParcela13.setPar_Data_Pag(dateFormat.format(2019-03-01));
        dummyParcela13.setPar_Valor_Pag(12500.00);
        dummyParcela13.setPar_Desconto(0.0);
        dummyParcela13.setPar_Juros(0.0);
        dummyParcela13.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela13.setPar_Banco(237);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela13.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela13.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela13.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela13.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela13.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela13.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela13.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela13.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela13.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela13.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela13.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela14 = new Parcela(14,8);
        dummyParcela14.setPar_Data_Venc(dateFormat.format(2019-04-01));
        dummyParcela14.setPar_Valor(12500.00);
        dummyParcela14.setPar_Moeda("Real");
        dummyParcela14.setPar_Data_Pag(dateFormat.format(2019-04-01));
        dummyParcela14.setPar_Valor_Pag(12500.00);
        dummyParcela14.setPar_Desconto(0.0);
        dummyParcela14.setPar_Juros(0.0);
        dummyParcela14.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela14.setPar_Banco(237);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela14.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela14.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela14.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela14.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela14.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela14.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela14.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela14.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela14.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela14.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela14.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela15 = new Parcela(15,8);
        dummyParcela15.setPar_Data_Venc(dateFormat.format(2019-05-01));
        dummyParcela15.setPar_Valor(12500.00);
        dummyParcela15.setPar_Moeda("Real");
        dummyParcela15.setPar_Data_Pag(dateFormat.format(2019-05-01));
        dummyParcela15.setPar_Valor_Pag(12500.00);
        dummyParcela15.setPar_Desconto(0.0);
        dummyParcela15.setPar_Juros(0.0);
        dummyParcela15.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela15.setPar_Banco(237);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela15.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela15.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela15.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela15.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela15.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela15.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela15.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela15.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela15.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela15.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela15.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela16 = new Parcela(16,9);
        dummyParcela16.setPar_Data_Venc(dateFormat.format(2019-05-27));
        dummyParcela16.setPar_Valor(1500.00);
        dummyParcela16.setPar_Moeda("Real");
        dummyParcela16.setPar_Data_Pag(dateFormat.format(2019-05-27));
        dummyParcela16.setPar_Valor_Pag(1500.00);
        dummyParcela16.setPar_Desconto(0.0);
        dummyParcela16.setPar_Juros(0.0);
        dummyParcela16.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela16.setPar_Banco(341);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela16.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela16.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela16.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela16.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela16.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela16.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela16.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela16.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela16.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela16.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela16.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela17 = new Parcela(17,9);
        dummyParcela17.setPar_Data_Venc(dateFormat.format(2019-06-27));
        dummyParcela17.setPar_Valor(1500.00);
        dummyParcela17.setPar_Moeda("Real");
        dummyParcela17.setPar_Data_Pag(null);
        dummyParcela17.setPar_Valor_Pag(null);
        dummyParcela17.setPar_Desconto(0.0);
        dummyParcela17.setPar_Juros(0.0);
        dummyParcela17.setPar_Status(Contrato.Parcela_TB.STATUS_ABERTO);
        dummyParcela17.setPar_Banco(341);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela17.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela17.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela17.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela17.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela17.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela17.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela17.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela17.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela17.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela17.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela17.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela18 = new Parcela(18,10);
        dummyParcela18.setPar_Data_Venc(dateFormat.format(2019-02-02));
        dummyParcela18.setPar_Valor(333.00);
        dummyParcela18.setPar_Moeda("Real");
        dummyParcela18.setPar_Data_Pag(dateFormat.format(2019-02-02));
        dummyParcela18.setPar_Valor_Pag(333.00);
        dummyParcela18.setPar_Desconto(0.0);
        dummyParcela18.setPar_Juros(0.0);
        dummyParcela18.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela18.setPar_Banco(745);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela18.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela18.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela18.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela18.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela18.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela18.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela18.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela18.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela18.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela18.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela18.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela19 = new Parcela(19,10);
        dummyParcela19.setPar_Data_Venc(dateFormat.format(2019-03-02));
        dummyParcela19.setPar_Valor(333.00);
        dummyParcela19.setPar_Moeda("Real");
        dummyParcela19.setPar_Data_Pag(dateFormat.format(2019-03-02));
        dummyParcela19.setPar_Valor_Pag(333.00);
        dummyParcela19.setPar_Desconto(0.0);
        dummyParcela19.setPar_Juros(0.0);
        dummyParcela19.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela19.setPar_Banco(745);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela19.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela19.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela19.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela19.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela19.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela19.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela19.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela19.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela19.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela19.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela19.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

        Parcela dummyParcela20 = new Parcela(20,10);
        dummyParcela20.setPar_Data_Venc(dateFormat.format(2019-04-02));
        dummyParcela20.setPar_Valor(334.00);
        dummyParcela20.setPar_Moeda("Real");
        dummyParcela20.setPar_Data_Pag(dateFormat.format(2019-04-02));
        dummyParcela20.setPar_Valor_Pag(334.00);
        dummyParcela20.setPar_Desconto(0.0);
        dummyParcela20.setPar_Juros(0.0);
        dummyParcela20.setPar_Status(Contrato.Parcela_TB.STATUS_PAGO);
        dummyParcela20.setPar_Banco(745);

        values = new ContentValues();
        values.put(Contrato.Parcela_TB.COLUMN_NUMERO,dummyParcela20.getPar_Numero());
        values.put(Contrato.Parcela_TB.COLUMN_ID_DUP,dummyParcela20.getPar_Id_Duplicata());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_VENC,dummyParcela20.getPar_Data_Venc());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR,dummyParcela20.getPar_Valor());
        values.put(Contrato.Parcela_TB.COLUMN_MOEDA,dummyParcela20.getPar_Moeda());
        values.put(Contrato.Parcela_TB.COLUMN_DATA_PAG,dummyParcela20.getPar_Data_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_VALOR_PAG,dummyParcela20.getPar_Valor_Pag());
        values.put(Contrato.Parcela_TB.COLUMN_DESCONTO,dummyParcela20.getPar_Desconto());
        values.put(Contrato.Parcela_TB.COLUMN_JUROS,dummyParcela20.getPar_Juros());
        values.put(Contrato.Parcela_TB.COLUMN_STATUS,dummyParcela20.getPar_Status());
        values.put(Contrato.Parcela_TB.COLUMN_BANCO,dummyParcela20.getPar_Banco());

        db.insert(Contrato.Parcela_TB.TABLENAME,null, values);

    }

}
