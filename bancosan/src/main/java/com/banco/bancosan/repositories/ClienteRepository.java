package com.banco.bancosan.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banco.bancosan.models.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long>{
    
}
