package edu.escola.sistemaedu.model.Aluno;

import edu.escola.sistemaedu.model.Contrato.ContratoEntity;
import edu.escola.sistemaedu.model.Endereco.EnderecoEntity;
import edu.escola.sistemaedu.model.Matricula.MatriculaEntity;
import edu.escola.sistemaedu.model.Pessoa.Pessoa;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class AlunoEntity extends Pessoa {

    @Column(unique = true, name = "col_Login_Aluno")
    private String login;

    @Column(unique = true, name = "col_Senha_Aluno", nullable = false)
    private String senha;

    @Column(name = "col_Contratos_Aluno")
    @OneToMany(mappedBy = "aluno")
    private List<ContratoEntity> contratoEntities;


    @Column(name = "col_Endereco_Aluno")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enderecoId")
    private EnderecoEntity enderecoEntity;


    @OneToMany(mappedBy = "aluno", cascade = CascadeType.ALL)
    private List<MatriculaEntity> matriculaEntities;


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<ContratoEntity> getContratoEntities() {
        return contratoEntities;
    }

    public void setContratoEntities(List<ContratoEntity> contratoEntities) {
        this.contratoEntities = contratoEntities;
    }

    @Override
    public EnderecoEntity getEnderecoEntity() {
        return enderecoEntity;
    }

    @Override
    public void setEnderecoEntity(EnderecoEntity enderecoEntity) {
        this.enderecoEntity = enderecoEntity;
    }

    public List<MatriculaEntity> getMatriculaEntities() {
        return matriculaEntities;
    }

    public void setMatriculaEntities(List<MatriculaEntity> matriculaEntities) {
        this.matriculaEntities = matriculaEntities;
    }
}
