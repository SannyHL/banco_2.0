package com.banco.bancosan.models;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;


@Entity
@Table(name = "clientes")
public class ClienteModel {
    
    @Id
    @CPF
    private Integer cpf;

    @Column
    public String nome;
    @Column
    public String dataNascimeto;
    @Column
    public String telefone;
    @Column
    public String telefone_2;
    @Email
    public String email;
    @Column
    public LocalDateTime dataCadastro;

    public ClienteModel(){

    }

    public Integer getCpf() {
        return cpf;
    }
    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDataNascimeto() {
        return dataNascimeto;
    }
    public void setDataNascimeto(String dataNascimeto) {
        this.dataNascimeto = dataNascimeto;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone_2() {
        return telefone_2;
    }
    public void setTelefone_2(String telefone_2) {
        this.telefone_2 = telefone_2;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    

}
