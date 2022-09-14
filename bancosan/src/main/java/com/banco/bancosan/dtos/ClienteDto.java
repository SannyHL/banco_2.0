package com.banco.bancosan.dtos;

import javax.validation.constraints.NotBlank;

public class ClienteDto {

    @NotBlank
    private Integer cpf;
    @NotBlank
    public String nome;
    @NotBlank
    public String dataNascimeto;
    @NotBlank
    public String telefone;
    @NotBlank
    public String telefone_2;
    @NotBlank
    public String email;

    public ClienteDto(){

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
    
    
}
