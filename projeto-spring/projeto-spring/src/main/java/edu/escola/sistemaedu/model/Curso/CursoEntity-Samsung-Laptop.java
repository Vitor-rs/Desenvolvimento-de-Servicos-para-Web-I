package edu.escola.sistemaedu.model.Curso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CursoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cursoID;

    private String metodologia;

    private int numHorasAulaCurso;

    private int duracaoCurso;

    private String descricao;

    public Long getCursoID() {
        return cursoID;
    }

    public void setCursoID(Long cursoID) {
        this.cursoID = cursoID;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
