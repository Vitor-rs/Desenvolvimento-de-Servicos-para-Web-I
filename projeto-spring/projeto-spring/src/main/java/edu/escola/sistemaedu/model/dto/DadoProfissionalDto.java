package edu.escola.sistemaedu.model.dto;

import edu.escola.sistemaedu.model.entity.DadoProfissional;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class DadoProfissionalDto implements Serializable {
    private UUID dadoProfissionalID;
    private String profissaoFuncaoCargo;
    private String orgaoInstituicaoEmpresa;
    private String outros;

    public DadoProfissionalDto(DadoProfissional dadoProfissional) {
        this.dadoProfissionalID = dadoProfissional.getDadoProfissionalID();
        this.profissaoFuncaoCargo = dadoProfissional.getProfissaoFuncaoCargo();
        this.orgaoInstituicaoEmpresa = dadoProfissional.getOrgaoInstituicaoEmpresa();
        this.outros = dadoProfissional.getOutros();
    }

}