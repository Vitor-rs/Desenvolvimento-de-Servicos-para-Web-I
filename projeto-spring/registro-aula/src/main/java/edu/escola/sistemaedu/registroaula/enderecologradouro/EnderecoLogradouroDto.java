package edu.escola.sistemaedu.registroaula.enderecologradouro;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * DTO for {@link EnderecoLogradouro}
 */
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class EnderecoLogradouroDto extends AdapterBaseObjectDto implements Serializable {

    // private final Long id; Já está no AdapterBaseObjectDto
    // private final String nome; Já está no AdapterBaseObjectDto

    private String CEP;
    private String tipo;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidadeAtual;
    private String estadoAtual;
}