package com.FATEC.LES.Model;

import java.util.Date;

public class Parcela {

    private Integer par_Numero;
    private Integer par_Id_Duplicata;
    private Date par_Data_Venc;
    private Float par_Valor;
    private String par_Moeda;
    private Date par_Data_Pag;
    private Float par_Valor_Pag;
    private Float par_Desconto;
    private Float par_Juros;
    private String par_Status;
    private Integer par_Banco;

    public Parcela(Integer par_Numero, Integer par_Id_Duplicata) {
        this.par_Numero = par_Numero;
        this.par_Id_Duplicata = par_Id_Duplicata;
    }

    public Integer getPar_Numero() {
        return par_Numero;
    }

    public Integer getPar_Id_Duplicata() {
        return par_Id_Duplicata;
    }

    public Date getPar_Data_Venc() {
        return par_Data_Venc;
    }

    public void setPar_Data_Venc(Date par_Data_Venc) {
        this.par_Data_Venc = par_Data_Venc;
    }

    public Float getPar_Valor() {
        return par_Valor;
    }

    public void setPar_Valor(Float par_Valor) {
        this.par_Valor = par_Valor;
    }

    public String getPar_Moeda() {
        return par_Moeda;
    }

    public void setPar_Moeda(String par_Moeda) {
        this.par_Moeda = par_Moeda;
    }

    public Date getPar_Data_Pag() {
        return par_Data_Pag;
    }

    public void setPar_Data_Pag(Date par_Data_Pag) {
        this.par_Data_Pag = par_Data_Pag;
    }

    public Float getPar_Valor_Pag() {
        return par_Valor_Pag;
    }

    public void setPar_Valor_Pag(Float par_Valor_Pag) {
        this.par_Valor_Pag = par_Valor_Pag;
    }

    public Float getPar_Desconto() {
        return par_Desconto;
    }

    public void setPar_Desconto(Float par_Desconto) {
        this.par_Desconto = par_Desconto;
    }

    public Float getPar_Juros() {
        return par_Juros;
    }

    public void setPar_Juros(Float par_Juros) {
        this.par_Juros = par_Juros;
    }

    public String getPar_Status() {
        return par_Status;
    }

    public void setPar_Status(String par_Status) {
        this.par_Status = par_Status;
    }

    public Integer getPar_Banco() {
        return par_Banco;
    }

    public void setPar_Banco(Integer par_Banco) {
        this.par_Banco = par_Banco;
    }
}
