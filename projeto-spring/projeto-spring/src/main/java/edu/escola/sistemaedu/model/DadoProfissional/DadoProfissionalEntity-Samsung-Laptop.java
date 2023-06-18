package edu.escola.sistemaedu.model.DadoProfissional;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_dadoProfissional")
public class DadoProfissionalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "col_dadoProfissionalID_tb_dadoProfissional")
    private Long dadoProfissionalID;

    @Column(name = "col_profissaoFuncaoCargo_tb_dadoProfissional")
    private String profissaoFuncaoCargo;

    @Column(name = "col_orgaoInstituicaoEmpresa_tb_dadoProfissional")
    private String orgaoInstituicaoEmpresa;

    @Column(name = "col_outros_tb_dadoProfissional")
    private String outros;


    public Long getDadoProfissionalID() {
        return dadoProfissionalID;
    }

    public void setDadoProfissionalID(Long dadoProfissionalID) {
        this.dadoProfissionalID = dadoProfissionalID;
    }

    public String getProfissaoFuncaoCargo() {
        return profissaoFuncaoCargo;
    }

    public void setProfissaoFuncaoCargo(String profissaoFuncaoCargo) {
        this.profissaoFuncaoCargo = profissaoFuncaoCargo;
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
