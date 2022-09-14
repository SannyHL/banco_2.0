package com.banco.bancosan.models;

public interface ITransacoesContas {

    void saque(double valor);
    void deposito(double valor);
    void receberTransferencia(double valor);
    void transferir(double valor);
    void enviarPix(double valor);
    void receberPix(double valor);
    void fazerPagamento(double valor);

    
    
}
