package com.banco.bancosan.models;

import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.Email;

import org.hibernate.validator.constraints.br.CPF;

import lombok.Data;
@Data
@Entity
@Table(name = "tb_clientes")
public class Cliente {
    
    @Id
    @CPF
    private Integer cpf;

    @Column
    public String nome;
    @Column
    public String dataNascimeto;
    @Column
    public String telefone;
    @Column
    public String telefone_2;
    @Email
    public String email;
    @Column
    public LocalDateTime dataCadastro;
    @Column
    public String numeroCasa;
    @Column
    public String complementoCasa;


}
