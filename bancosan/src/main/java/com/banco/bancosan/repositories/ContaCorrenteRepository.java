package com.banco.bancosan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancosan.models.ContaCorrenteModel;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrenteModel, Integer>{
    
}
