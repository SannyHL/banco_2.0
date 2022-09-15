package com.banco.bancosan.models;

import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "transacoes")
public abstract class TransacoesContasModel{

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
    @Column
    private LocalDateTime horarioTransacao;

    


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

  

    public LocalDateTime getHorarioTransacao() {
        return horarioTransacao;
    }
    public void setHorarioTransacao(LocalDateTime horarioTransacao) {
        this.horarioTransacao = horarioTransacao;
    }

    
    @ManyToOne
    @JoinColumn(name = "contaCC_id")
    private ContaCorrenteModel numeroConta;




    public void setSaque(double saque) {
        this.saque = saque;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }

    public void setTransferir(double transferir) {
        this.transferir = transferir;
    }

    public void setEnviarPix(double enviarPix) {
        this.enviarPix = enviarPix;
    }

    public void setPix(double pix) {
        this.pix = pix;
    }

    public void setFazerPagamento(double fazerPagamento) {
        this.fazerPagamento = fazerPagamento;
    }


    public ContaCorrenteModel getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(ContaCorrenteModel numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    
  
    
}
