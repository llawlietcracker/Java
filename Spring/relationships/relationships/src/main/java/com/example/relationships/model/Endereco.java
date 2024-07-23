package com.example.relationships.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_endereco")
    private Long codigo;

    private String logradouro;
    private String cidade;

    @ManyToOne
    @JoinColumn(name = "cod_aluno")
    private Aluno aluno;

    public Endereco(){}

    public Endereco(String logradouro, Aluno aluno, String cidade) {
        this.logradouro = logradouro;
        this.aluno = aluno;
        this.cidade = cidade;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
