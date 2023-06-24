package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import edu.escola.sistemaedu.registroaula.curso.Curso;

import jakarta.persistence.OneToOne;
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

    private String conteudoMateria;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private Integer numeroLicoes;
    private Integer numeroHoras;
    private Curso curso;

}