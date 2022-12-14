package com.banco.bancosan.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
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

import com.banco.bancosan.dtos.ClienteDto;
import com.banco.bancosan.models.ClienteModel;
import com.banco.bancosan.services.ClienteService;


@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;


    @GetMapping("/")
    public ResponseEntity<List<ClienteModel>> getAll(){
        return new ResponseEntity<List<ClienteModel>>(clienteService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<ClienteModel> getCpf(@PathVariable(value = "cpf") Long cpf){
        Optional<ClienteModel> clienteOptional = clienteService.findId(cpf);
        if(clienteOptional.isPresent()){
            return new ResponseEntity<>(clienteOptional.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/") 
    public ResponseEntity<ClienteModel> cadastrarCliente(@Valid @RequestBody ClienteDto clienteDto){
        try{
            var clienteModel = new ClienteModel();
            BeanUtils.copyProperties(clienteDto, clienteModel);
            clienteModel.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC-3")));
            return new ResponseEntity<>(clienteService.create(clienteModel), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @PutMapping("/{cpf}")
    public ResponseEntity<ClienteModel> atualizaCadastro(@PathVariable(value = "cpf") Long cpf, @RequestBody @Valid ClienteDto clienteDto){
        Optional<ClienteModel> clienteOptional = clienteService.findId(cpf);
        if(clienteOptional.isPresent()){
            try {
                var clienteModel = new ClienteModel();
                BeanUtils.copyProperties(clienteDto, clienteModel);
                clienteModel.setDataCadastro(clienteOptional.get().getDataCadastro());
                clienteModel.setDataAtualiza????o(LocalDateTime.now(ZoneId.of("UTC-3")));
                return new ResponseEntity<ClienteModel>(clienteService.create(clienteModel), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<ClienteModel>(HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<ClienteModel>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<ClienteModel> excluiCadastro(@PathVariable(value = "cpf") Long cpf){
        Optional<ClienteModel> clienteOptional = clienteService.findId(cpf);
        if(clienteOptional.isPresent()){
            try {
                clienteService.delete(clienteOptional.get());
                return new ResponseEntity<>(HttpStatus.OK);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    

    
}
