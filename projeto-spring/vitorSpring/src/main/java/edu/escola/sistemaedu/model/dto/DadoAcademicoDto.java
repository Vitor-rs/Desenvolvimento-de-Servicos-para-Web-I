package edu.escola.sistemaedu.model.dto;

import edu.escola.sistemaedu.model.entity.DadoAcademico;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class DadoAcademicoDto implements Serializable {
    private final UUID dadoAcademicoID;
    private final String serieEscolar;
    private final String escolaridadeAtual;
    private final String orgaoInstituicaoEmpresa;
    private final String outros;

    public DadoAcademicoDto(DadoAcademico dadoAcademico) {
        this.dadoAcademicoID = dadoAcademico.getDadoAcademicoID();
        this.serieEscolar = dadoAcademico.getSerieEscolar();
        this.escolaridadeAtual = dadoAcademico.getEscolaridadeAtual();
        this.orgaoInstituicaoEmpresa = dadoAcademico.getOrgaoInstituicaoEmpresa();
        this.outros = dadoAcademico.getOutros();
    }
}