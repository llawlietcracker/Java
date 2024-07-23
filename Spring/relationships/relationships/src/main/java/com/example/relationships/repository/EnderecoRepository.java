package com.example.relationships.repository;

import com.example.relationships.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    @Query("SELECT e FROM Endereco e WHERE e.aluno.codigo = :codigoAluno")
    List<Endereco> findbyCodigoAluno(Long codigoAluno);

}
