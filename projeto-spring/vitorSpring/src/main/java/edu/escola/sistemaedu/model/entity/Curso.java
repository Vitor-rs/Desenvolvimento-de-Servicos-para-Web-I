package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cursoID;

    private String metodologia;

    private int numHorasAulaCurso;

    private int duracaoCurso;

    private String descricao;
}
