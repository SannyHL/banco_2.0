package com.banco.bancosan.dtos;


import com.banco.bancosan.models.ClienteModel;

public class ContaCorrenteDto {
    
    
    private ClienteModel cpf;

    public ClienteModel getCpf() {
        return cpf;
    }

    public void setCpf(ClienteModel cpf) {
        this.cpf = cpf;
    }

    
}
