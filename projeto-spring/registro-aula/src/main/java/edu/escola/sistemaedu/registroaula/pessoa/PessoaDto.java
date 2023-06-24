package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademicoDto;
import edu.escola.sistemaedu.registroaula.dadoprofissional.DadoProfissionalDto;
import edu.escola.sistemaedu.registroaula.enderecologradouro.EnderecoLogradouroDto;
import lombok.*;

import java.io.Serializable;

/**
 * DTO for {@link Pessoa}
 */
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class PessoaDto implements Serializable {

    private Long id;
    private String nome;
    private String sobrenome;
    private String CPF;
    private String RG;
    private String genero;
    private String dataNascimento;
    private Boolean estrangeiro;
    private String email;
    private String numeroTelCelular;
    private String numeroTelFixo;
    private String cidadeNatal;
    private String estadoNatal;
    private DadoAcademicoDto dadoAcademico;
    private DadoProfissionalDto dadoProfissional;
    private EnderecoLogradouroDto enderecoLogradouro;
}