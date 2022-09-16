package com.banco.bancosan.models;

import java.time.LocalDateTime;

import javax.persistence.Column;

import com.banco.bancosan.enums.StatusConta;

import javax.persistence.*;

@Entity
@Table(name = "contaCC")
public class ContaCorrenteModel{

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column
    private Integer numeroConta;

    @Column
    private String agencia;

    @Column
    private double saldo;

    @Column
    private StatusConta statusatualConta;

    @Column
    private LocalDateTime dataAberuraConta;
    
    @Column
    private LocalDateTime dataVencimento;
    
    @Column
    private LocalDateTime dataAtualizacaoConta;
    
    public LocalDateTime getDataAtualizacaoConta() {
        return dataAtualizacaoConta;
    }

    public void setDataAtualizacaoConta(LocalDateTime dataAtualizacaoConta) {
        this.dataAtualizacaoConta = dataAtualizacaoConta;
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Integer getNumeroConta() {
        return numeroConta;
    }
    
    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public LocalDateTime getDataAberuraConta() {
        return dataAberuraConta;
    }

    public void setDataAberuraConta(LocalDateTime dataAberuraConta) {
        this.dataAberuraConta = dataAberuraConta;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    
    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private ClienteModel cpf;

    public ClienteModel getCpf() {
        return cpf;
    }

    public void setCpf(ClienteModel cpf) {
        this.cpf = cpf;
    }
    public StatusConta getStatusatualConta() {
        return statusatualConta;
    }
    public void setStatusatualConta(StatusConta statusatualConta) {
        this.statusatualConta = statusatualConta;
    }

    
}
