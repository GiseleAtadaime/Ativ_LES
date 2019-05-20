package com.FATEC.LES.Model;

public class Cliente extends Empresa{

    private Integer cli_ID;
    private String cli_Complemento;
    private Integer cli_Cep;
    private Float cli_LimCred;

    public Cliente(String CNPJ, String razao_Social, Integer banco, Integer ag, Integer conta, String cidade, String UF, Integer cli_ID) {
        super(CNPJ, razao_Social, banco, ag, conta, cidade, UF);
        this.cli_ID = cli_ID;
    }

    public Integer getCli_ID() {
        return cli_ID;
    }

    public String getCli_Complemento() {
        return cli_Complemento;
    }

    public void setCli_Complemento(String cli_Complemento) {
        this.cli_Complemento = cli_Complemento;
    }

    public Integer getCli_Cep() {
        return cli_Cep;
    }

    public void setCli_Cep(Integer cli_Cep) {
        this.cli_Cep = cli_Cep;
    }

    public Float getCli_LimCred() {
        return cli_LimCred;
    }

    public void setCli_LimCred(Float cli_LimCred) {
        this.cli_LimCred = cli_LimCred;
    }
}
