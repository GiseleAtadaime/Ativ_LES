package com.FATEC.LES.Model;

public class Emitente extends Empresa {
    private Integer emi_ID;


    public Emitente(String CNPJ, String razao_Social, Integer banco, Integer ag, Integer conta, String cidade, String UF, String email, String Bairro, Integer Cep, Integer Num, String endereco, Integer emi_ID) {
        super(CNPJ, razao_Social, banco, ag, conta, cidade, UF, email, Bairro, Cep, Num, endereco);
        this.emi_ID = emi_ID;
    }

    public Integer getEmi_ID() {
        return emi_ID;
    }

}
