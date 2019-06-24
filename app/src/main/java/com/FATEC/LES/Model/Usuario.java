package com.FATEC.LES.Model;

import java.util.Objects;

public class Usuario {

    private Integer usr_Codigo;
    private String usr_Apelido;
    private String usr_Status;
    private String usr_Nome;
    private String usr_Email;
    private Integer usr_Senha;

    public Usuario(Integer usr_Codigo) {
        this.usr_Codigo = usr_Codigo;
    }
    public Usuario(String usr_Apelido, Integer usr_Senha){
        this.usr_Apelido = usr_Apelido;
        this.usr_Senha = usr_Senha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(getUsr_Codigo(), usuario.getUsr_Codigo()) &&
                Objects.equals(getUsr_Apelido(), usuario.getUsr_Apelido()) &&
                getUsr_Status().equals(usuario.getUsr_Status()) &&
                Objects.equals(getUsr_Nome(), usuario.getUsr_Nome()) &&
                getUsr_Email().equals(usuario.getUsr_Email()) &&
                getUsr_Senha().equals(usuario.getUsr_Senha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsr_Senha());
    }

    public Integer getUsr_Codigo() {
        return usr_Codigo;
    }

    public String getUsr_Apelido() {
        return usr_Apelido;
    }

    public void setUsr_Apelido(String usr_Apelido) {
        this.usr_Apelido = usr_Apelido;
    }

    public String getUsr_Status() {
        return usr_Status;
    }

    public void setUsr_Status(String usr_Status) {
        this.usr_Status = usr_Status;
    }

    public String getUsr_Nome() {
        return usr_Nome;
    }

    public void setUsr_Nome(String usr_Nome) {
        this.usr_Nome = usr_Nome;
    }

    public String getUsr_Email() {
        return usr_Email;
    }

    public void setUsr_Email(String usr_Email) {
        this.usr_Email = usr_Email;
    }

    public Integer getUsr_Senha() {
        return usr_Senha;
    }

    public void setUsr_Senha(Integer usr_Senha) {
        this.usr_Senha = usr_Senha;
    }
}
