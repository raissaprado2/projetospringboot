package com.webapp.escola_xyz_b.Model;

import java.io.Serializable;

import jakarta.persistence.Id;

public class VerificaCadastroAdm implements Serializable{
    //atributos
    @Id
    private String cpf;
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    private String nome;
    //métodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
