package com.FATEC.LES.Model;

public class Cliente extends Empresa{

    private Integer cli_ID;
    private Double cli_LimCred;
    private String cli_Complemento;

    public Cliente(Integer id, String rz){
        super(rz);
        this.cli_ID = id;
    }

    public Cliente(String CNPJ, String razao_Social, Integer banco, Integer ag, Integer conta, String cidade, String UF, String email, String Bairro, Integer Cep, Integer Num, String endereco, Integer cli_ID, Double cli_LimCred, String cli_Complemento) {
        super(CNPJ, razao_Social, banco, ag, conta, cidade, UF, email, Bairro, Cep, Num, endereco);
        this.cli_ID = cli_ID;
        this.cli_LimCred = cli_LimCred;
        this.cli_Complemento = cli_Complemento;
    }

    public Integer getCli_ID() {
        return cli_ID;
    }

    public Double getCli_LimCred() {
        return cli_LimCred;
    }

    public void setCli_LimCred(Double cli_LimCred) {
        this.cli_LimCred = cli_LimCred;
    }

    public String getCli_Complemento() {
        return cli_Complemento;
    }

    public void setCli_Complemento(String cli_Complemento) {
        this.cli_Complemento = cli_Complemento;
    }

}
