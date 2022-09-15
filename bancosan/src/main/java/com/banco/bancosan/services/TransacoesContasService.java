package com.banco.bancosan.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancosan.repositories.TransacoesContasRepository;

@Service
public class TransacoesContasService {
    
    @Autowired
    private TransacoesContasRepository transacoesRepo;
}
