package com.banco.bancosan.dtos;

import javax.validation.constraints.NotBlank;

import com.banco.bancosan.models.ClienteModel;

public class ContaCorrenteDto {
    
    @NotBlank
    private ClienteModel cpf;

    public ContaCorrenteDto(){
        
    }

    public ClienteModel getCpf() {
        return cpf;
    }

    public void setCpf(ClienteModel cpf) {
        this.cpf = cpf;
    }

    
}
