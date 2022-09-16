package com.banco.bancosan.models;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.Email;



@Entity
@Table(name = "clientes")
public class ClienteModel {
    
    @Id
    @Column
    private Integer cpf;

    @Column
    public String nome;
    @Column
    public String dataNascimento;
    @Column
    public String telefone;
    @Column
    public String telefone_2;
    @Email
    public String email;
    @Column
    public LocalDateTime dataCadastro;
    @Column
    public LocalDateTime dataAtualização;

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
    
    public LocalDateTime getDataAtualização() {
        return dataAtualização;
    }

    public void setDataAtualização(LocalDateTime dataAtualização) {
        this.dataAtualização = dataAtualização;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    

}
