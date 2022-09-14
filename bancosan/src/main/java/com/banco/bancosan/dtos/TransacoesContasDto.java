package com.banco.bancosan.dtos;

import com.banco.bancosan.models.ContaCorrenteModel;

public class TransacoesContasDto {
    
    private double saque;
    private double deposito;
    private double transferencia;
    private double transferir;
    private double enviarPix;
    private double pix;
    private double fazerPagamento;
    private ContaCorrenteModel conta;

    public TransacoesContasDto(){
        
    }

    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }
    public double getDeposito() {
        return deposito;
    }
    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
    public double getTransferencia() {
        return transferencia;
    }
    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }
    public double getTransferir() {
        return transferir;
    }
    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }
    public double getEnviarPix() {
        return enviarPix;
    }
    public void setEnviarPix(double enviarPix) {
        this.enviarPix = enviarPix;
    }
    public double getPix() {
        return pix;
    }
    public void setPix(double pix) {
        this.pix = pix;
    }
    public double getFazerPagamento() {
        return fazerPagamento;
    }
    public void setFazerPagamento(double fazerPagamento) {
        this.fazerPagamento = fazerPagamento;
    }
    public ContaCorrenteModel getConta() {
        return conta;
    }
    public void setConta(ContaCorrenteModel conta) {
        this.conta = conta;
    }

    

}
