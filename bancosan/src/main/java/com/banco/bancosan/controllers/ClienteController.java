package com.banco.bancosan.controllers;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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

    @GetMapping("/cadastro/")
    public String getCadastro(){
        return "cadastro";
    }

    @PostMapping("/cadastro/")
    public ResponseEntity<ClienteModel> cadastrarClienteNavegador(ClienteDto clienteDto){
        try {
            var clienteModel = new ClienteModel();
            BeanUtils.copyProperties(clienteDto, clienteModel);
            clienteModel.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC-3")));
            clienteModel.setDataAtualização(LocalDateTime.now(ZoneId.of("UTC-3")));
            clienteService.create(clienteModel);
            return new ResponseEntity<>(HttpStatus.CREATED);
            
            
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<ClienteModel>> getAll(){
        clienteService.findAll();
        return new ResponseEntity<List<ClienteModel>>(HttpStatus.OK);
    }

    @GetMapping("/{cpf}")
    public ResponseEntity<ClienteModel> getCpf(@PathVariable(value = "cpf") Integer cpf){
        Optional<ClienteModel> clienteOptional = clienteService.findId(cpf);
        if(clienteOptional.isPresent()){
            clienteOptional.get();
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/") 
    public ResponseEntity<ClienteModel> cadastrarCliente(@RequestBody @Valid ClienteDto clienteDto){
        try {
            var clienteModel = new ClienteModel();
            BeanUtils.copyProperties(clienteDto, clienteModel);
            clienteModel.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC-3")));
            clienteService.create(clienteModel);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
    
    @PutMapping("/{cpf}")
    public ResponseEntity<ClienteModel> atualizaCadastro(@PathVariable(value = "cpf") Integer cpf, @RequestBody @Valid ClienteDto clienteDto){
        Optional<ClienteModel> clienteOptional = clienteService.findId(cpf);
        if(clienteOptional.isPresent()){
            try {
                var clienteModel = new ClienteModel();
                BeanUtils.copyProperties(clienteDto, clienteModel);
                clienteModel.setDataCadastro(clienteOptional.get().getDataCadastro());
                clienteModel.setDataAtualização(LocalDateTime.now(ZoneId.of("UTC-3")));
                return new ResponseEntity<ClienteModel>(clienteService.create(clienteModel), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<ClienteModel>(HttpStatus.BAD_REQUEST);
            }
        } else {
            return new ResponseEntity<ClienteModel>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{cpf}")
    public ResponseEntity<ClienteModel> excluiCadastro(@PathVariable(value = "cpf") Integer cpf){
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
