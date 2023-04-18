package edu.escola.sistemaedu.model.Contrato;

import edu.escola.sistemaedu.model.Matricula.MatriculaEntity;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class ContratoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long contratoID;

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
    private MatriculaEntity matriculaEntity;

    public Long getContratoID() {
        return contratoID;
    }

    public void setContratoID(Long contratoID) {
        this.contratoID = contratoID;
    }

    public String getSituacaoContrato() {
        return situacaoContrato;
    }

    public void setSituacaoContrato(String situacaoContrato) {
        this.situacaoContrato = situacaoContrato;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    public MatriculaEntity getMatriculaEntity() {
        return matriculaEntity;
    }

    public void setMatriculaEntity(MatriculaEntity matriculaEntity) {
        this.matriculaEntity = matriculaEntity;
    }
}
