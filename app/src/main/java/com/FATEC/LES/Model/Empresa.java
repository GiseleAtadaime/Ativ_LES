package com.FATEC.LES.Model;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint("ParcelCreator")
public class Empresa implements Parcelable {

    private String CNPJ;
    private String Razao_Social;
    private Integer Banco;
    private Integer Ag;
    private Integer Conta;
    private String Cidade;
    private String UF;
    private String Email;
    private Integer Num;
    private Integer Cep;
    private String Bairro;
    private String endereco;

    public Empresa(String rzsoc){
        this.Razao_Social = rzsoc;
    }

    public Empresa(String CNPJ, String razao_Social, java.lang.Integer banco,
                   java.lang.Integer ag, java.lang.Integer conta, String cidade,
                   String UF, String email, String Bairro, Integer Cep, Integer Num, String endereco) {
        this.CNPJ = CNPJ;
        Razao_Social = razao_Social;
        Banco = banco;
        Ag = ag;
        Conta = conta;
        Cidade = cidade;
        this.UF = UF;
        Email = email;
        this.Bairro = Bairro;
        this.endereco = endereco;
        this.Num = Num;
        this.Cep = Cep;
    }

    protected Empresa(Parcel in) {
        CNPJ = in.readString();
        Razao_Social = in.readString();
        if (in.readByte() == 0) {
            Banco = null;
        } else {
            Banco = in.readInt();
        }
        if (in.readByte() == 0) {
            Ag = null;
        } else {
            Ag = in.readInt();
        }
        if (in.readByte() == 0) {
            Conta = null;
        } else {
            Conta = in.readInt();
        }
        Cidade = in.readString();
        UF = in.readString();
        Email = in.readString();
        if (in.readByte() == 0) {
            Num = null;
        } else {
            Num = in.readInt();
        }
        if (in.readByte() == 0) {
            Cep = null;
        } else {
            Cep = in.readInt();
        }
        Bairro = in.readString();
        endereco = in.readString();
    }

    public static final Creator<Empresa> CREATOR = new Creator<Empresa>() {
        @Override
        public Empresa createFromParcel(Parcel in) {
            return new Empresa(in);
        }

        @Override
        public Empresa[] newArray(int size) {
            return new Empresa[size];
        }
    };

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getRazao_Social() {
        return Razao_Social;
    }

    public void setRazao_Social(String razao_Social) {
        Razao_Social = razao_Social;
    }

    public Integer getBanco() {
        return Banco;
    }

    public void setBanco(Integer banco) {
        Banco = banco;
    }

    public Integer getAg() {
        return Ag;
    }

    public void setAg(Integer ag) {
        Ag = ag;
    }

    public Integer getConta() {
        return Conta;
    }

    public void setConta(Integer conta) {
        Conta = conta;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String formatCNPJ(String CNPJ){
        return(CNPJ.replaceFirst("(\\d{3})(\\d{3})(\\d{3})(\\d{4})(\\d+)","$1.$2.$3/$4-$5"));
    }

    public String formatCEP(String cep){
        return(cep.replaceFirst("(\\d{5})(\\d{3})","$1-$2"));
    }

    public Integer getNum() {
        return Num;
    }

    public void setNum(Integer num) {
        Num = num;
    }

    public Integer getCep() {
        return Cep;
    }

    public void setCep(Integer cep) {
        Cep = cep;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(CNPJ);
        dest.writeString(Razao_Social);
        if (Banco == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(Banco);
        }
        if (Ag == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(Ag);
        }
        if (Conta == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(Conta);
        }
        dest.writeString(Cidade);
        dest.writeString(UF);
        dest.writeString(Email);
        if (Num == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(Num);
        }
        if (Cep == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(Cep);
        }
        dest.writeString(Bairro);
        dest.writeString(endereco);
    }
}
