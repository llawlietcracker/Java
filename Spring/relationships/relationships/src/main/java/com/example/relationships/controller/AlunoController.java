package com.example.relationships.controller;

import com.example.relationships.model.Aluno;
import com.example.relationships.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/escola")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/alunos")
    public List<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    @PostMapping("/alunos")
    @ResponseStatus(HttpStatus.CREATED)
    public Aluno save(@RequestBody Aluno aluno){
        return alunoRepository.save(aluno);
    }

    @DeleteMapping("/alunos/{codigo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long codigo){
        alunoRepository.deleteById(codigo);
    }

}
