package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectForm;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PessoaForm extends AdapterBaseObjectForm {

    // private Long id; Já está no AdapterBaseObjectForm
    // private String nome; Já está no AdapterBaseObjectForm

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

    // private DadoAcademicoDto dadoAcademico; Já está no AdapterBaseObjectForm
    // private DadoProfissionalDto dadoProfissional; Já está no AdapterBaseObjectForm
    // private EnderecoLogradouroDto enderecoLogradouro; Já está no AdapterBaseObjectForm

}