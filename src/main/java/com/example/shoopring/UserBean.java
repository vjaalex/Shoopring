package com.example.shoopring;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserBean {
    private String nome;
    private String cpf;
    private String end;
    private String email;
    private String tel;
    private Date dtCadastro;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", end='" + end + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", dtCadastro=" + dtCadastro +
                '}';
    }

}
