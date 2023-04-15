package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_dadoAcademico")
public class DadoAcademico {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID dadoAcademicoID;

    @Column(name = "col_escolaridade_tb_dadoAcademico")
    private String serieEscolar;

    @Column(name = "col_escolaridadeAtual_tb_dadoAcademico")
    private String escolaridadeAtual;

    @Column(name = "col_anoConclusao_tb_dadoAcademico")
    private String orgaoInstituicaoEmpresa;

    @Column(name = "col_anoConclusao_tb_dadoAcademico")
    private String outros;

    public UUID getDadoAcademicoID() {
        return dadoAcademicoID;
    }

    public void setDadoAcademicoID(UUID dadoAcademicoID) {
        this.dadoAcademicoID = dadoAcademicoID;
    }

    public String getSerieEscolar() {
        return serieEscolar;
    }

    public void setSerieEscolar(String serieEscolar) {
        this.serieEscolar = serieEscolar;
    }

    public String getEscolaridadeAtual() {
        return escolaridadeAtual;
    }

    public void setEscolaridadeAtual(String escolaridadeAtual) {
        this.escolaridadeAtual = escolaridadeAtual;
    }

    public String getOrgaoInstituicaoEmpresa() {
        return orgaoInstituicaoEmpresa;
    }

    public void setOrgaoInstituicaoEmpresa(String orgaoInstituicaoEmpresa) {
        this.orgaoInstituicaoEmpresa = orgaoInstituicaoEmpresa;
    }

    public String getOutros() {
        return outros;
    }

    public void setOutros(String outros) {
        this.outros = outros;
    }
}
