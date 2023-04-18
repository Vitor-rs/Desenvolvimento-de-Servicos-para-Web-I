package edu.escola.sistemaedu.model.Matricula;

import edu.escola.sistemaedu.model.Curso.CursoEntity;
import edu.escola.sistemaedu.model.Professor.ProfessorEntity;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class MatriculaEntity {

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
    private CursoEntity cursoEntity;

    @ManyToMany
    private List<ProfessorEntity> professores;

    public Long getMatriculaID() {
        return matriculaID;
    }

    public void setMatriculaID(Long matriculaID) {
        this.matriculaID = matriculaID;
    }

    public boolean isAtual() {
        return atual;
    }

    public void setAtual(boolean atual) {
        this.atual = atual;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public LocalDate getDataInicioMatricula() {
        return dataInicioMatricula;
    }

    public void setDataInicioMatricula(LocalDate dataInicioMatricula) {
        this.dataInicioMatricula = dataInicioMatricula;
    }

    public LocalDate getDataFimMatricula() {
        return dataFimMatricula;
    }

    public void setDataFimMatricula(LocalDate dataFimMatricula) {
        this.dataFimMatricula = dataFimMatricula;
    }

    public int getNumHorasAulaCurso() {
        return numHorasAulaCurso;
    }

    public void setNumHorasAulaCurso(int numHorasAulaCurso) {
        this.numHorasAulaCurso = numHorasAulaCurso;
    }

    public int getDuracaoCurso() {
        return duracaoCurso;
    }

    public void setDuracaoCurso(int duracaoCurso) {
        this.duracaoCurso = duracaoCurso;
    }

    public String getDiasDaSemana() {
        return diasDaSemana;
    }

    public void setDiasDaSemana(String diasDaSemana) {
        this.diasDaSemana = diasDaSemana;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public CursoEntity getCursoEntity() {
        return cursoEntity;
    }

    public void setCursoEntity(CursoEntity cursoEntity) {
        this.cursoEntity = cursoEntity;
    }

    public List<ProfessorEntity> getProfessores() {
        return professores;
    }

    public void setProfessores(List<ProfessorEntity> professores) {
        this.professores = professores;
    }
}
