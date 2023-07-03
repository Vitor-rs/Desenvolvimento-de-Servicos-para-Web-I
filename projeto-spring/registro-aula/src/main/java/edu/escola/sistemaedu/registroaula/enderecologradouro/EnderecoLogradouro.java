package edu.escola.sistemaedu.registroaula.enderecologradouro;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator(name = "enderecoLogradouroSequence", sequenceName = "endereco_logradouro_seq", allocationSize = 1)
@Entity
public class EnderecoLogradouro {

    @Id
    private Long enderecoLogradouroId;

    @NotNull
    private String nome;

    private String CEP;

    private String tipo;

    private int numero;

    private String complemento;

    private String bairro;

    private String cidadeAtual;

    private String estadoAtual;


}