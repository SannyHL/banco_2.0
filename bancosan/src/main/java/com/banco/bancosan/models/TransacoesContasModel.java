package com.banco.bancosan.models;

import javax.persistence.*;

@Entity
@Table(name = "transacoes")
public abstract class TransacoesContasModel implements ITransacoesContas{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private double saque;
    @Column
    private double deposito;
    @Column
    private double transferencia;
    @Column
    private double transferir;
    @Column
    private double enviarPix;
    @Column
    private double pix;
    @Column
    private double fazerPagamento;
    @Column
    private double saldo;

    ContaCorrenteModel contaCorrente = new ContaCorrenteModel();
    @Override
    public void saque(double valor){
        saldo = saldo - valor;
    }
    @Override
    public void deposito(double valor){
        saldo = saldo + valor;
    }
    @Override
    public void receberTransferencia(double valor){
        saldo = saldo + valor;
    }
    @Override
    public void transferir(double valor){
        saldo = saldo - valor;
    }
    @Override
    public void enviarPix(double valor){
        saldo = saldo - valor;
    }
    @Override
    public void receberPix(double valor){
        saldo = saldo + valor;
    }
    @Override
    public void fazerPagamento(double valor){
        saldo = saldo - valor - 2;
    }

    public TransacoesContasModel(){

    }
  
    @ManyToOne
    @JoinColumn(name = "contaCC_id")
    private ContaCorrenteModel conta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getSaque() {
        return saque;
    }

    public void setSaque(Double saque) {
        this.saque = saque;
    }

    public Double getDeposito() {
        return deposito;
    }

    public void setDeposito(Double deposito) {
        this.deposito = deposito;
    }

    public Double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Double transferencia) {
        this.transferencia = transferencia;
    }

    public Double getTransferir() {
        return transferir;
    }

    public void setTransferir(Double transferir) {
        this.transferir = transferir;
    }

    public Double getEnviarPix() {
        return enviarPix;
    }

    public void setEnviarPix(Double enviarPix) {
        this.enviarPix = enviarPix;
    }

    public Double getPix() {
        return pix;
    }

    public void setPix(Double pix) {
        this.pix = pix;
    }

    public Double getFazerPagamento() {
        return fazerPagamento;
    }

    public void setFazerPagamento(Double fazerPagamento) {
        this.fazerPagamento = fazerPagamento;
    }

    public ContaCorrenteModel getConta() {
        return conta;
    }

    public void setConta(ContaCorrenteModel conta) {
        this.conta = conta;
    }

  
    
}
