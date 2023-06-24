package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import edu.escola.sistemaedu.registroaula.curso.Curso;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * DTO for {@link Apostila}
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@SuperBuilder
public class ApostilaDto extends AdapterBaseObjectDto implements Serializable {

    // private final Long id; Já está no AdapterBaseObjectDto
    // private final String nome; Já está no AdapterBaseObjectDto

    private String conteudoMateria;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private Integer numeroLicoes;
    private Integer numeroHoras;
    private Curso curso;
}