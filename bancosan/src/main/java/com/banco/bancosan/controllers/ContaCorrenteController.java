package com.banco.bancosan.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.banco.bancosan.dtos.ContaCorrenteDto;
import com.banco.bancosan.models.ClienteModel;
import com.banco.bancosan.models.ContaCorrenteModel;
import com.banco.bancosan.services.ContaCorrenteService;

@Controller
@RequestMapping("/conta")
public class ContaCorrenteController {
    
    @Autowired
    private ContaCorrenteService contaCorrenteService =  new ContaCorrenteService();

    @GetMapping("/novaconta")
    public String getConta(){
        return "abrirconta";
    }

    @PostMapping("/novaconta")
    public ResponseEntity<ContaCorrenteModel> novaContaNavegador(ContaCorrenteDto contaCorrenteDto){
        try{
            var contaCorrenteModel = new ContaCorrenteModel();
            BeanUtils.copyProperties(contaCorrenteDto, contaCorrenteModel);
            
            return new ResponseEntity<>(contaCorrenteService.criarConta(contaCorrenteModel), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    @GetMapping("/")
    public ResponseEntity<List<ContaCorrenteModel>> bucarContas(){
        
        return new ResponseEntity<>(contaCorrenteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{numeroConta}")
    public ResponseEntity<ContaCorrenteModel> buscarConta(@PathVariable(value = "numeroConta") Integer numeroConta){
        Optional<ContaCorrenteModel> contaOptional = contaCorrenteService.findId(numeroConta);
        if (contaOptional.isPresent()){
            
            return new ResponseEntity<>(contaOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/")
    public ResponseEntity<ContaCorrenteModel> novaConta(@RequestBody @Valid ContaCorrenteDto contaCorrenteDto){
        try{
            var contaCorrenteModel = new ContaCorrenteModel();
            BeanUtils.copyProperties(contaCorrenteDto, contaCorrenteModel);
            return new ResponseEntity<>(contaCorrenteService.criarConta(contaCorrenteModel), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
            
        
    }

    @PutMapping("/{numeroConta}")
    public ResponseEntity<ContaCorrenteModel> atualizacaoConta(@PathVariable(value = "numeroConta") Integer numeroConta, @RequestBody @Valid ContaCorrenteDto contaCorrenteDto){
        Optional<ContaCorrenteModel> contaOptional = contaCorrenteService.findId(numeroConta);
        try{
            if(contaOptional.isPresent()){
                var contaCorrenteModel = new ContaCorrenteModel();
                BeanUtils.copyProperties(contaCorrenteDto, contaCorrenteModel);
                contaCorrenteModel.setNumeroConta(contaOptional.get().getNumeroConta());
                contaCorrenteModel.setDataAberuraConta(contaOptional.get().getDataAberuraConta());
                return new ResponseEntity<>(contaCorrenteService.atualizarConta(contaCorrenteModel), HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{numeroConta}")
    public ResponseEntity<ContaCorrenteModel> deletarConta(@PathVariable(value = "numeroConta") Integer numeroConta){
        Optional<ContaCorrenteModel> contaOptional = contaCorrenteService.findId(numeroConta);
        if (contaOptional.isPresent()){
            contaCorrenteService.delete(contaOptional.get());
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


}
