package com.FATEC.LES.Model;

import java.util.Date;

public class Duplicata {

    private Integer dup_Id_Duplicata;
    private Integer dup_Emitente;
    private Integer dup_Cliente;
    private String dup_Status;
    private String dup_Data_Emissao;
    private Integer dup_Forma_Pag;
    private Double dup_Valor;

    public Duplicata(Integer dup_Id_Duplicata, Integer dup_Emitente, Integer dup_Cliente) {
        this.dup_Id_Duplicata = dup_Id_Duplicata;
        this.dup_Emitente = dup_Emitente;
        this.dup_Cliente = dup_Cliente;
    }

    public Integer getDup_Id_Duplicata() {
        return dup_Id_Duplicata;
    }

    public Integer getDup_Emitente() {
        return dup_Emitente;
    }

    public void setDup_Emitente(Integer dup_Emitente) {
        this.dup_Emitente = dup_Emitente;
    }

    public Integer getDup_Cliente() {
        return dup_Cliente;
    }

    public void setDup_Cliente(Integer dup_Cliente) {
        this.dup_Cliente = dup_Cliente;
    }

    public String getDup_Status() {
        return dup_Status;
    }

    public void setDup_Status(String dup_Status) {
        this.dup_Status = dup_Status;
    }

    public String getDup_Data_Emissao() {
        return dup_Data_Emissao;
    }

    public void setDup_Data_Emissao(String dup_Data_Emissao) {
        this.dup_Data_Emissao = dup_Data_Emissao;
    }

    public Integer getDup_Forma_Pag() {
        return dup_Forma_Pag;
    }

    public void setDup_Forma_Pag(Integer dup_Forma_Pag) {
        this.dup_Forma_Pag = dup_Forma_Pag;
    }

    public Double getDup_Valor() {
        return dup_Valor;
    }

    public void setDup_Valor(Double dup_Valor) {
        this.dup_Valor = dup_Valor;
    }
}
