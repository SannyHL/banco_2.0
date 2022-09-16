package com.banco.bancosan.services;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancosan.enums.StatusConta;
import com.banco.bancosan.models.ContaCorrenteModel;
import com.banco.bancosan.repositories.ContaCorrenteRepository;


@Service
public class ContaCorrenteService {

    @Autowired
    private ContaCorrenteRepository contaCorrenteRepository;

    @Transactional
    public ContaCorrenteModel criarConta(ContaCorrenteModel contaCorrenteModel) {
       
        contaCorrenteModel.setAgencia("056");
        contaCorrenteModel.setSaldo(0d);
        contaCorrenteModel.setStatusatualConta(StatusConta.ABERTO);
        contaCorrenteModel.setDataAberuraConta(LocalDateTime.now(ZoneId.of("UTC-3")));
        contaCorrenteModel.setDataVencimento(LocalDateTime.now(ZoneId.of("UTC-3")));
        return contaCorrenteRepository.save(contaCorrenteModel);
        
    }

    public ContaCorrenteModel atualizarConta(ContaCorrenteModel contaCorrenteModel) {
       
        contaCorrenteModel.setAgencia("056");
        contaCorrenteModel.setSaldo(0d);
        contaCorrenteModel.setStatusatualConta(StatusConta.ABERTO);
        contaCorrenteModel.setDataAtualizacaoConta(LocalDateTime.now(ZoneId.of("UTC-3")));
        contaCorrenteModel.setDataVencimento(LocalDateTime.now(ZoneId.of("UTC-3")));
        return contaCorrenteRepository.save(contaCorrenteModel);
        
    }

	public List<ContaCorrenteModel> findAll() {
        return contaCorrenteRepository.findAll();
	}

    public Optional<ContaCorrenteModel> findId(Integer numeroConta) {
        return contaCorrenteRepository.findById(numeroConta);
    }

    public void delete(ContaCorrenteModel contaCorrenteModel) {
        contaCorrenteRepository.delete(contaCorrenteModel);
    }
    
}
