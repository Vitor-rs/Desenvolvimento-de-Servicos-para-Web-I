package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.arch.BaseObject;
import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademico;
import edu.escola.sistemaedu.registroaula.dadoprofissional.DadoProfissional;
import edu.escola.sistemaedu.registroaula.enderecologradouro.EnderecoLogradouro;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@SequenceGenerator(name = "pessoaSequence", sequenceName = "pessoa_seq", allocationSize = 1)
@Entity
public abstract class Pessoa extends BaseObject {

    // private long pessoaId; Já existe no BaseObject

    // private String nome; Já existe no BaseObject

    private String sobrenome;

    private String CPF;

    private String RG;

    private char genero;

    private String dataNascimento;

    private boolean estrangeiro;

    private String email;

    private String numeroTelCelular;

    private String numeroTelFixo;

    private String cidadeNatal;

    private String estadoNatal;

    private DadoAcademico dadoAcademico;

    private DadoProfissional dadoProfissional;

    private EnderecoLogradouro enderecoLogradouro;

}