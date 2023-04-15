package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Aluno extends Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long alunoID;

    @Column(unique = true, name = "col_Login_Aluno")
    private String login;

    @Column(unique = true, name = "col_Senha_Aluno", nullable = false)
    private String senha;

    @Column(name = "col_Contratos_Aluno")
    @OneToMany(mappedBy = "aluno")
    private List<Contrato> contratos;


    @Column(name = "col_Endereco_Aluno")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enderecoId")
    private Endereco endereco;


    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<Matricula> matriculas;


}
