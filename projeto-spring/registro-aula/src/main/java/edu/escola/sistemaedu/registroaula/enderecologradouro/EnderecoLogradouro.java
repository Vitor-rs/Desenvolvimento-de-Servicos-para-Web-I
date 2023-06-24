package edu.escola.sistemaedu.registroaula.enderecologradouro;

import edu.escola.sistemaedu.arch.BaseObject;
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
@SequenceGenerator(name = "enderecoLogradouroSequence", sequenceName = "endereco_logradouro_seq", allocationSize = 1)
@Entity
public class EnderecoLogradouro extends BaseObject {

    // private Long enderecoId;
    // private String nome;


    private String CEP;

    private String tipo;

    private int numero;

    private String complemento;

    private String bairro;

    private String cidadeAtual;

    private String estadoAtual;

}