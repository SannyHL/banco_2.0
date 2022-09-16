package com.banco.bancosan.models;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.banco.bancosan.enums.TipoTransacao;

@Entity
@Table(name = "transacoes")
public class TransacoesContasModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private TipoTransacao tipo;
    @Column
    private double valor;
    @Column
    private double saldo;
    @Column
    private LocalDateTime horarioTransacao;

    
    @ManyToOne
    @JoinColumn(name = "contaCC_id")
    private ContaCorrenteModel numeroConta;


    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public TipoTransacao getTipo() {
        return tipo;
    }


    public void setTipo(TipoTransacao tipo) {
        this.tipo = tipo;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public LocalDateTime getHorarioTransacao() {
        return horarioTransacao;
    }


    public void setHorarioTransacao(LocalDateTime horarioTransacao) {
        this.horarioTransacao = horarioTransacao;
    }


    public ContaCorrenteModel getNumeroConta() {
        return numeroConta;
    }


    public void setNumeroConta(ContaCorrenteModel numeroConta) {
        this.numeroConta = numeroConta;
    }


    public double getValor() {
        return valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    
    
  
    
}
