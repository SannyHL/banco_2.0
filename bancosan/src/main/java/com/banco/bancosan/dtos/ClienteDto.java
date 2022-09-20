package com.banco.bancosan.dtos;

import javax.validation.constraints.NotBlank;

public class ClienteDto {

    private Long cpf;
    @NotBlank
    public String nome;
    @NotBlank
    public String dataNascimento;
    @NotBlank
    public String telefone;
    @NotBlank
    public String telefone_2;
    @NotBlank
    public String email;


    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
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
    public String getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
