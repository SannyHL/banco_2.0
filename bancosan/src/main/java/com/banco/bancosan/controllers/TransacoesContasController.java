package com.banco.bancosan.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banco.bancosan.dtos.TransacoesContasDto;
import com.banco.bancosan.models.TransacoesContasModel;
import com.banco.bancosan.services.TransacoesContasService;

@Controller
@RequestMapping("/transacoes")
public class TransacoesContasController {

    @Autowired
    private TransacoesContasService transacoesContasService;

    @GetMapping("/novatransacao")
    public String getConta(){
        return "fazertransacao";
    }

    @PostMapping("/depositar")
    public ResponseEntity<TransacoesContasModel> fazerTransacaoNavegador(TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createDeposito(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/transferencia")
    public ResponseEntity<TransacoesContasModel> fazerTransferenciaNavegador(TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createReceberTransferencia(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @PostMapping("/receberpix")
    public ResponseEntity<TransacoesContasModel> receberPixNavegador(TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createReceberPix(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/sacar")
    public ResponseEntity<TransacoesContasModel> saqueNavegador(TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createSaque(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/transferir")
    public ResponseEntity<TransacoesContasModel> transferirNavegador(TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createTransferencia(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/enviapix")
    public ResponseEntity<TransacoesContasModel> enviaPixNavegador(TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createEnviarPix(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/pagamento")
    public ResponseEntity<TransacoesContasModel> pagamentoNavegador(TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createPagamento(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    /* -----------------Envio pelo Postman:------------*/
    
    @PostMapping("/depositar/")
    public ResponseEntity<TransacoesContasModel> fazerTransacao(@RequestBody @Valid TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createDeposito(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/transferencia/")
    public ResponseEntity<TransacoesContasModel> fazerTransferencia(@RequestBody @Valid TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createReceberTransferencia(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @PostMapping("/receberpix/")
    public ResponseEntity<TransacoesContasModel> receberPix(@RequestBody @Valid TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createReceberPix(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/sacar/")
    public ResponseEntity<TransacoesContasModel> saque(@RequestBody @Valid TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createSaque(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping("/transferir/")
    public ResponseEntity<TransacoesContasModel> transferir(@RequestBody @Valid TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createTransferencia(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/enviapix/")
    public ResponseEntity<TransacoesContasModel> enviaPix(@RequestBody @Valid TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createEnviarPix(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @PostMapping("/pagamento/")
    public ResponseEntity<TransacoesContasModel> pagamento(@RequestBody @Valid TransacoesContasDto transacoesContasDto){
        try {
            var transacoesContasModel = new TransacoesContasModel();
            BeanUtils.copyProperties(transacoesContasDto, transacoesContasModel);
            return new ResponseEntity<>(transacoesContasService.createPagamento(transacoesContasModel), HttpStatus.CREATED);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<TransacoesContasModel>> buscarTodasTransacoes(){
        try {
            return new ResponseEntity<>(transacoesContasService.findAll(), HttpStatus.OK);
        } catch (Exception e) {
           return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<TransacoesContasModel> buscarTransacaoId(@PathVariable(value = "id") Integer id){
        try{
            Optional<TransacoesContasModel> transacoesOptional = transacoesContasService.findId(id);
                if(transacoesOptional.isPresent()){
                    return new ResponseEntity<>(transacoesOptional.get(), HttpStatus.OK);
                } else {
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
}
