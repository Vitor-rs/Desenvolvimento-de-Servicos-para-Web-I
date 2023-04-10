package edu.escola.sistemaedu.model.dto;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_dadoAcademico")
public class DadoAcademico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int dadoAcademicoID;

    @Column
    private String serieEscolar;

    @Column
    private String escolaridadeAtual;

    @Column
    private String orgaoInstituicaoEmpresa;

    @Column
    private String outros;

    // constructors, getters and setters
}
