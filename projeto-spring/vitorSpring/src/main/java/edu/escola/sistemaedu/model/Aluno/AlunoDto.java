package edu.escola.sistemaedu.model.Aluno;

import edu.escola.sistemaedu.model.Contrato.ContratoEntity;
import edu.escola.sistemaedu.model.DadoAcademico.DadoAcademicoEntity;
import edu.escola.sistemaedu.model.DadoProfissional.DadoProfissionalEntity;
import edu.escola.sistemaedu.model.Endereco.EnderecoEntity;
import edu.escola.sistemaedu.model.Matricula.MatriculaEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * A DTO for the {@link AlunoEntity} entity
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AlunoDto implements Serializable {
    private Long pessoaID;
    private String nomeCompleto;
    private String CPF;
    private String RG;
    private Date dataNascimento;
    private String genero;
    private String email;
    private String telefoneCelular;
    private String telefoneFixo;
    private String cidadeNatal;
    private String estadoNatal;
    private boolean estrangeiro;
    private DadoAcademicoEntity dadosAcademicos;
    private DadoProfissionalEntity dadosProfissionais;
    private String login;
    private String senha;
    private List<ContratoEntity> contratoEntities;
    private EnderecoEntity enderecoEntity;
    private List<MatriculaEntity> matriculaEntities;
}