package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademicoForm;
import edu.escola.sistemaedu.registroaula.dadoprofissional.DadoProfissionalForm;
import edu.escola.sistemaedu.registroaula.enderecologradouro.EnderecoLogradouroForm;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class PessoaForm {

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

    private DadoAcademicoForm dadoAcademico;
    private DadoProfissionalForm dadoProfissional;
    private EnderecoLogradouroForm enderecoLogradouro;
}