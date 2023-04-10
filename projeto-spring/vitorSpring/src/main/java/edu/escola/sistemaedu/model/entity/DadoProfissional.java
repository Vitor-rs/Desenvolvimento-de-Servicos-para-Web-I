package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_dadoProfissional")
public class DadoProfissional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dadoProfissionalID")
    private int dadoProfissionalID;

    @Column(name = "profissaoFuncaoCargo")
    private String profissaoFuncaoCargo;

    @Column(name = "orgaoInstituicaoEmpresa")
    private String orgaoInstituicaoEmpresa;

    @Column(name = "outros")
    private String outros;

    // construtores, getters e setters omitidos

}
