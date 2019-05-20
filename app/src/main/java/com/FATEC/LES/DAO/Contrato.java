package com.FATEC.LES.DAO;

import android.database.DatabaseUtils;
import android.provider.BaseColumns;

public final class Contrato {

    //tabelas

    public static abstract class UsuarioTB implements BaseColumns {
        public static final String TABLENAME = "TB_USUARIO";
        public static final String COLUMN_KEY = "Usr_Codigo";
        public static final String COLUMN_APELIDO = "Usr_Apelido";
        public static final String COLUMN_STATUS = "Usr_Status";
        public static final String COLUMN_NOME = "Usr_Nome";
        public static final String COLUMN_EMAIL = "Usr_Email";
        public static final String COLUMN_SENHA = "Usr_Senha";

        //valores fixos para status

        public static final String STATUS_ACTIVE = "A";
        public static final String STATUS_DISABLED = "D";
    }

    public static abstract class Emitente_TB implements BaseColumns {
        public static final String TABLENAME = "TB_EMITENTE";
        public static final String COLUMN_ID = "Emi_Id";
        public static final String COLUMN_CNPJ = "Emi_CNPJ";
        public static final String COLUMN_RZSOCIAL = "Emi_Razao_Social";
        public static final String COLUMN_BANCO = "Emi_Banco";
        public static final String COLUMN_AG = "Emi_Ag";
        public static final String COLUMN_CONTA = "Emi_Conta";
        public static final String COLUMN_CIDADE = "Emi_Cidade";
        public static final String COLUMN_UF = "Emi_UF";
    }

    public static abstract class Cliente_TB implements BaseColumns {
        public static final String TABLENAME = "TB_CLIENTE";
        public static final String COLUMN_ID = "Cli_Id";
        public static final String COLUMN_CNPJ = "Cli_CNPJ";
        public static final String COLUMN_RZSOCIAL = "Cli_Razao_Social";
        public static final String COLUMN_LOGRADOURO = "Cli_Logradouro";
        public static final String COLUMN_NUMERO = "Cli_Numero";
        public static final String COLUMN_BAIRRO = "Cli_Bairro";
        public static final String COLUMN_CIDADE = "Cli_Cidade";
        public static final String COLUMN_UF = "Cli_UF";
        public static final String COLUMN_COMPLE = "Cli_Complemento";
        public static final String COLUMN_CEP = "Cli_CEP";
        public static final String COLUMN_BANCO = "Cli_Banco";
        public static final String COLUMN_AG = "Cli_Ag";
        public static final String COLUMN_CONTA = "Cli_Conta";
        public static final String COLUMN_LIMCRED = "Cli_LimCred";
    }

    public static abstract class Duplicata_TB implements BaseColumns {
        public static final String TABLENAME = "TB_DUPLICATA";
        public static final String COLUMN_ID_DUP = "Dup_Id_Duplicata";
        public static final String COLUMN_ID_EMI = "Dup_Id_Emitente";
        public static final String COLUMN_ID_CLI = "Dup_Id_Cliente";
        public static final String COLUMN_STATUS = "Dup_Status";
        public static final String COLUMN_DT_EMI = "Dup_Data_Emissao";
        public static final String COLUMN_FORMA_PAG = "Dup_FormaPag";
        public static final String COLUMN_VALOR = "Dup_Valor";

        public static final String STATUS_ABERTO = "A";
        public static final String STATUS_FECHADO = "F";
        public static final String STATUS_VENCIDO = "V";

    }

    public static abstract class Parcela_TB implements BaseColumns {
        public static final String TABLENAME = "TB_PARCELA";
        public static final String COLUMN_NUMERO = "Par_Numero";
        public static final String COLUMN_ID_DUP = "Par_Id_Duplicata";
        public static final String COLUMN_DATA_VENC = "Par_Data_Venc";
        public static final String COLUMN_VALOR = "Par_Valor";
        public static final String COLUMN_MOEDA = "Par_Moeda";
        public static final String COLUMN_DATA_PAG = "Par_Data_Pag";
        public static final String COLUMN_VALOR_PAG = "Par_Valor_Pag";
        public static final String COLUMN_DESCONTO = "Par_Desconto";
        public static final String COLUMN_JUROS = "Par_Juros";
        public static final String COLUMN_STATUS = "Par_Status";
        public static final String COLUMN_BANCO = "Par_Banco";

        public static final String STATUS_ABERTO = "A";
        public static final String STATUS_PAGO = "P";
        public static final String STATUS_VENCIDO = "V";

    }

    //table creation

    public static final String CREATE_TABLE_USUARIO = "CREATE TABLE " + UsuarioTB.TABLENAME +
            "( " + UsuarioTB.COLUMN_KEY + " INTEGER, " +
                  UsuarioTB.COLUMN_APELIDO + " VARCHAR(10), " +
                  UsuarioTB.COLUMN_STATUS + " VARCHAR(1) NOT NULL, " +
                  UsuarioTB.COLUMN_NOME + " VARCHAR(50), " +
                  UsuarioTB.COLUMN_EMAIL + " VARCHAR(100) NOT NULL, "+
                  UsuarioTB.COLUMN_SENHA + " INTEGER NOT NULL, "+
            " CONSTRAINT pk_usuario PRIMARY KEY ( " + UsuarioTB.COLUMN_KEY + " ));";

    public static final String CREATE_TABLE_EMITENTE = "CREATE TABLE " + Emitente_TB.TABLENAME +
            "( " + Emitente_TB.COLUMN_ID + " INTEGER, " +
                  Emitente_TB.COLUMN_CNPJ + " VARCHAR(14), " +
                  Emitente_TB.COLUMN_RZSOCIAL + " VARCHAR(100), " +
                  Emitente_TB.COLUMN_BANCO + " INTEGER, " +
                  Emitente_TB.COLUMN_AG + " INTEGER, " +
                  Emitente_TB.COLUMN_CONTA + " INTEGER, " +
                  Emitente_TB.COLUMN_CIDADE + " VARCHAR(30), " +
                  Emitente_TB.COLUMN_UF + " VARCHAR(2), " +
            " CONSTRAINT pk_emitente PRIMARY KEY ( " + Emitente_TB.COLUMN_ID + " ));";

    public static final String CREATE_TABLE_CLIENTE = "CREATE TABLE " + Cliente_TB.TABLENAME +
            "( " + Cliente_TB.COLUMN_ID + " INTEGER, " +
                  Cliente_TB.COLUMN_CNPJ + " VARCHAR(14), " +
                  Cliente_TB.COLUMN_RZSOCIAL + " VARCHAR(60), " +
                  Cliente_TB.COLUMN_LOGRADOURO + " VARCHAR(60), " +
                  Cliente_TB.COLUMN_NUMERO + " INTEGER, " +
                  Cliente_TB.COLUMN_BAIRRO + " VARCHAR(30), " +
                  Cliente_TB.COLUMN_CIDADE + " VARCHAR(30), " +
                  Cliente_TB.COLUMN_UF + " VARCHAR(2), " +
                  Cliente_TB.COLUMN_COMPLE + " VARCHAR(60), " +
                  Cliente_TB.COLUMN_CEP + " INTEGER, " +
                  Cliente_TB.COLUMN_BANCO + " INTEGER, " +
                  Cliente_TB.COLUMN_AG + " INTEGER, " +
                  Cliente_TB.COLUMN_CONTA + " INTEGER, " +
                  Cliente_TB.COLUMN_LIMCRED + " NUMERIC(10,2), " +
            " CONSTRAINT pk_cliente PRIMARY KEY ( " + Cliente_TB.COLUMN_ID + " ));";

    public static final String CREATE_TABLE_DUPLICATA = "CREATE TABLE " + Duplicata_TB.TABLENAME +
            "( " + Duplicata_TB.COLUMN_ID_DUP + " INTEGER, " +
                  Duplicata_TB.COLUMN_ID_EMI + " INTEGER, " +
                  Duplicata_TB.COLUMN_ID_CLI + " INTEGER, " +
                  Duplicata_TB.COLUMN_STATUS + " VARCHAR(1), " +
                  Duplicata_TB.COLUMN_DT_EMI + " DATE, " +
                  Duplicata_TB.COLUMN_FORMA_PAG + " INTEGER, " +
                  Duplicata_TB.COLUMN_VALOR + " NUMERIC(10,2), " +
            " CONSTRAINT pk_duplicata PRIMARY KEY ( " + Duplicata_TB.COLUMN_ID_DUP + " ), " +
            " CONSTRAINT fk_emitente FOREIGN KEY ( " + Duplicata_TB.COLUMN_ID_EMI + " ) REFERENCES " + Emitente_TB.TABLENAME + "( " + Emitente_TB.COLUMN_ID + " )," +
            " CONSTRAINT fk_cliente FOREIGN KEY ( " + Duplicata_TB.COLUMN_ID_CLI + " ) REFERENCES " + Cliente_TB.TABLENAME + "( " + Cliente_TB.COLUMN_ID +" ));";

    public static final String CREATE_TABLE_PARCELA = "CREATE TABLE " + Parcela_TB.TABLENAME +
            "( " + Parcela_TB.COLUMN_NUMERO + " INTEGER, " +
                  Parcela_TB.COLUMN_ID_DUP + " INTEGER, " +
                  Parcela_TB.COLUMN_DATA_VENC + " DATE, " +
                  Parcela_TB.COLUMN_VALOR + " NUMERIC(10,2), " +
                  Parcela_TB.COLUMN_MOEDA + " VARCHAR(10), " +
                  Parcela_TB.COLUMN_DATA_PAG + " DATE, " +
                  Parcela_TB.COLUMN_VALOR_PAG + " NUMERIC(10,2), " +
                  Parcela_TB.COLUMN_DESCONTO + " NUMERIC(3,2), " +
                  Parcela_TB.COLUMN_JUROS + " NUMERIC(3,2), " +
                  Parcela_TB.COLUMN_STATUS + " VARCHAR(1), " +
                  Parcela_TB.COLUMN_BANCO + " INTEGER, " +
            " CONSTRAINT pk_parcela PRIMARY KEY ( " + Parcela_TB.COLUMN_NUMERO + ", " + Parcela_TB.COLUMN_ID_DUP + " ), " +
            " CONSTRAINT fk_duplicata FOREIGN KEY ( " + Parcela_TB.COLUMN_ID_DUP + " ) REFERENCES " + Duplicata_TB.TABLENAME +"( "+ Duplicata_TB.COLUMN_ID_DUP+" ));";
}
