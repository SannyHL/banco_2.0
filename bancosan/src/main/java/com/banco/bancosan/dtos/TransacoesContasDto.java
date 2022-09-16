package com.banco.bancosan.dtos;

import com.banco.bancosan.models.ContaCorrenteModel;

public class TransacoesContasDto {
    
    private double valor;

    private ContaCorrenteModel numeroConta;

    

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public ContaCorrenteModel getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(ContaCorrenteModel numeroConta) {
        this.numeroConta = numeroConta;
    }
    

    

}
