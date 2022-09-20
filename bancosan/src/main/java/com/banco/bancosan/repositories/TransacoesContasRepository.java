package com.banco.bancosan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banco.bancosan.models.TransacoesContasModel;
import com.banco.bancosan.dtos.ContasSaldosDto;

public interface TransacoesContasRepository extends JpaRepository<TransacoesContasModel, Integer>{
   
}
