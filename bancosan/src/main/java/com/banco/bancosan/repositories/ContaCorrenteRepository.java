package com.banco.bancosan.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.banco.bancosan.models.ContaCorrenteModel;

public interface ContaCorrenteRepository extends JpaRepository<ContaCorrenteModel, Integer>{

    @Query(value="SELECT c FROM ContaCorrenteModel c where c.numeroConta = :numero")
    ContaCorrenteModel buscarNumeroConta(@Param("numero") Integer numero);

}
