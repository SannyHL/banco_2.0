package com.banco.bancosan.services;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.bancosan.dtos.ContasSaldosDto;
import com.banco.bancosan.enums.TipoTransacao;
import com.banco.bancosan.models.TransacoesContasModel;
import com.banco.bancosan.repositories.TransacoesContasRepository;

@Service
public class TransacoesContasService {
    
    @Autowired
    private TransacoesContasRepository transacoesContasRepository;

    @Transactional
    public TransacoesContasModel createDeposito(TransacoesContasModel transacoesContasModel) {
        transacoesContasModel.setTipo(TipoTransacao.DEPOSITO);
        transacoesContasModel.setHorarioTransacao(LocalDateTime.now(ZoneId.of("UTC-3")));
        transacoesContasModel.setSaldo(transacoesContasModel.getSaldo() + transacoesContasModel.getValor());
        return transacoesContasRepository.save(transacoesContasModel);
    }
    @Transactional
    public TransacoesContasModel createReceberTransferencia(TransacoesContasModel transacoesContasModel) {
        transacoesContasModel.setTipo(TipoTransacao.RECEBER_TRANSFERENCIA);
        transacoesContasModel.setHorarioTransacao(LocalDateTime.now(ZoneId.of("UTC-3")));
        transacoesContasModel.setSaldo(transacoesContasModel.getSaldo() + transacoesContasModel.getValor());
        return transacoesContasRepository.save(transacoesContasModel);
    }
    @Transactional
    public TransacoesContasModel createReceberPix(TransacoesContasModel transacoesContasModel) {
        transacoesContasModel.setTipo(TipoTransacao.RECEBER_PIX);
        transacoesContasModel.setHorarioTransacao(LocalDateTime.now(ZoneId.of("UTC-3")));
        transacoesContasModel.setSaldo(transacoesContasModel.getSaldo() + transacoesContasModel.getValor());
        return transacoesContasRepository.save(transacoesContasModel);
    }
    @Transactional
    public TransacoesContasModel createSaque(TransacoesContasModel transacoesContasModel) {
        transacoesContasModel.setTipo(TipoTransacao.SAQUE);
        transacoesContasModel.setHorarioTransacao(LocalDateTime.now(ZoneId.of("UTC-3")));
        transacoesContasModel.setSaldo(transacoesContasModel.getSaldo() -
         transacoesContasModel.getValor());
        return transacoesContasRepository.save(transacoesContasModel);
    }
    @Transactional
    public TransacoesContasModel createTransferencia(TransacoesContasModel transacoesContasModel) {
        transacoesContasModel.setTipo(TipoTransacao.TRANSFERIR);
        transacoesContasModel.setHorarioTransacao(LocalDateTime.now(ZoneId.of("UTC-3")));
        transacoesContasModel.setSaldo(transacoesContasModel.getSaldo() -
         transacoesContasModel.getValor());
        return transacoesContasRepository.save(transacoesContasModel);
    }
    @Transactional
    public TransacoesContasModel createEnviarPix(TransacoesContasModel transacoesContasModel) {
        transacoesContasModel.setTipo(TipoTransacao.ENVIAR_PIX);
        transacoesContasModel.setHorarioTransacao(LocalDateTime.now(ZoneId.of("UTC-3")));
        transacoesContasModel.setSaldo(transacoesContasModel.getSaldo() -
         transacoesContasModel.getValor());
        return transacoesContasRepository.save(transacoesContasModel);
    }
    @Transactional
    public TransacoesContasModel createPagamento(TransacoesContasModel transacoesContasModel) {
        transacoesContasModel.setTipo(TipoTransacao.FAZER_PAGAMENTO);
        transacoesContasModel.setHorarioTransacao(LocalDateTime.now(ZoneId.of("UTC-3")));
        transacoesContasModel.setSaldo(transacoesContasModel.getSaldo() -
         transacoesContasModel.getValor());
        return transacoesContasRepository.save(transacoesContasModel);
    }
    public List<TransacoesContasModel> findAll() {
        return transacoesContasRepository.findAll();
    }

    public Optional<TransacoesContasModel> findId(Integer id) {
        return transacoesContasRepository.findById(id);
    }



    public ContasSaldosDto buscaSaldos(){
        return transacoesContasRepository.getSaldos();
    }
}
