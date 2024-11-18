package com.example.shoopring;

import org.springframework.aot.generate.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
public class UserModel {
    @Id
    @GeneratedValue(Strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String cpf;
    private String end;
    private String email;
    private String tel;
    private Date dtCadastro;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
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
    public static UserModel converter(UserBean userbean){
        UserModel user = new UserModel();
        user.setNome(userbean.getNome());
        user.setEnd(userbean.getEnd());
        user.setCpf(userbean.getCpf());
        user.setEmail(userbean.getEmail());
        user.setTel(userbean.getTel());
        user.setDtCadastro(userbean.getDtCadastro());
        return user;
    }
}
