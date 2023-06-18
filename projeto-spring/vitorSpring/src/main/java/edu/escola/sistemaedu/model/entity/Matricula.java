package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matriculaID;

    @Column
    private boolean atual;

    @Column
    private String metodologia;

    @Column
    private LocalDate dataInicioMatricula;

    @Column
    private LocalDate dataFimMatricula;

    @Column
    private int numHorasAulaCurso;

    @Column
    private int duracaoCurso;

    @Column
    private String diasDaSemana;

    @Column
    private String horario;

    @ManyToOne
    private Curso curso;

    @ManyToMany
    private List<Professor> professores;

// constructors, getters and setters omitted for brevity

}
