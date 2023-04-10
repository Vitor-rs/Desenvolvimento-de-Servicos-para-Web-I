package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Aluno extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long alunoID;

    @Column(unique = true)
    private String login;

    @Column(unique = true)
    private String senha;

    @Column
    @OneToMany(mappedBy = "aluno")
    private List<Contrato> contratos;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enderecoId")
    private Endereco endereco;


    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Matricula> matriculas;


}
