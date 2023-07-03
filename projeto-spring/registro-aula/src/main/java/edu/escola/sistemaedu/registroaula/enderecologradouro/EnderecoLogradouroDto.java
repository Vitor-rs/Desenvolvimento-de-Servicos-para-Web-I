package edu.escola.sistemaedu.registroaula.enderecologradouro;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;

import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@AllArgsConstructor
@EqualsAndHashCode
@SuperBuilder
public class EnderecoLogradouroDto  implements Serializable {

    private Long id;
    private String nome;
    private String CEP;
    private String tipo;
    private int numero;
    private String complemento;
    private String bairro;
    private String cidadeAtual;
    private String estadoAtual;
}