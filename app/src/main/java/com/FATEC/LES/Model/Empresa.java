package com.FATEC.LES.Model;

public class Empresa {

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
}
