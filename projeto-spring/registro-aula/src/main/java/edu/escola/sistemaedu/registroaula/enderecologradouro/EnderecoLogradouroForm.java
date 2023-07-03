package edu.escola.sistemaedu.registroaula.enderecologradouro;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectForm;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EnderecoLogradouroForm extends AdapterBaseObjectForm {

    private String nome;
    private String CEP;
    private String tipo;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidadeAtual;
    private String estadoAtual;

}