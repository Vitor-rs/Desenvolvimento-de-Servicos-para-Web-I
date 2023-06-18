package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID contratoID;

    @Column(name = "situacaoContrato")
    private String situacaoContrato;

    @Column(name = "numeroContrato")
    private int numeroContrato;

    @Column(name = "tipoContrato")
    private String tipoContrato;

    @Column
    private String contratante;

    @Column
    private String modalidade;

    @Column(name = "dataInicio", columnDefinition = "DATE")
    private LocalDate dataInicio;

    @Column(name = "dataTermino", columnDefinition = "DATE")
    private LocalDate dataTermino;

    @OneToOne(mappedBy = "contrato", cascade = CascadeType.ALL)
    private Matricula matricula;

    // constructors, getters and setters omitted for brevity
}
