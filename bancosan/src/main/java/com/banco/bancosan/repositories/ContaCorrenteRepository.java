package com.banco.bancosan.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banco.bancosan.dtos.ContasSaldosDto;
import com.banco.bancosan.models.ContaCorrenteModel;
import com.banco.bancosan.models.TransacoesContasModel;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrenteModel, Integer>{

}
