package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademicoDto;
import edu.escola.sistemaedu.registroaula.dadoprofissional.DadoProfissionalDto;
import edu.escola.sistemaedu.registroaula.enderecologradouro.EnderecoLogradouroDto;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link Pessoa}
 */

@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class PessoaDto extends AdapterBaseObjectDto implements Serializable {

    // private Long id; Já está no AdapterBaseObjectDto
    // private String nome; Já está no AdapterBaseObjectDto

    private LocalDateTime createdAt;
    private String sobrenome;
    private String CPF;
    private String RG;
    private char genero;
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