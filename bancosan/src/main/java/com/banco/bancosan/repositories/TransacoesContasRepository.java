package com.banco.bancosan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.banco.bancosan.models.TransacoesContasModel;

public interface TransacoesContasRepository extends JpaRepository<TransacoesContasModel, Integer>{
   
}
