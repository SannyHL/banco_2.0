package com.banco.bancosan.dtos;

import com.banco.bancosan.models.ContaCorrenteModel;

public class ContasSaldosDto {

    private ContaCorrenteModel numeroConta;
    private double saldo;

    
    public ContaCorrenteModel getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(ContaCorrenteModel numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
}
