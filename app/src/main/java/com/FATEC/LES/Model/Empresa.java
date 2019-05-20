package com.FATEC.LES.Model;

public class Empresa {

    private String CNPJ;
    private String Razao_Social;
    private Integer Banco;
    private Integer Ag;
    private Integer Conta;
    private String Cidade;
    private String UF;

    public Empresa(String CNPJ, String razao_Social, java.lang.Integer banco, java.lang.Integer ag, java.lang.Integer conta, String cidade, String UF) {
        this.CNPJ = CNPJ;
        Razao_Social = razao_Social;
        Banco = banco;
        Ag = ag;
        Conta = conta;
        Cidade = cidade;
        this.UF = UF;
    }

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
}
