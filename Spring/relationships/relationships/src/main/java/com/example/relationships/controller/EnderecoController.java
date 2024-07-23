package com.example.relationships.controller;

import com.example.relationships.model.Endereco;
import com.example.relationships.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola/enderecos")
public class EnderecoController {

    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("/alunos")
    public List<Endereco> getEnderecos(){
        return enderecoRepository.findAll();
    }

    @GetMapping("/alunos/{codigo}")
    public List<Endereco> getEndereco(@PathVariable Long codigo){
        return enderecoRepository.findbyCodigoAluno(codigo);
    }

    @PostMapping("/alunos")
    @ResponseStatus(HttpStatus.CREATED)
    public Endereco save(@RequestBody Endereco endereco){
        return enderecoRepository.save(endereco);
    }

}
