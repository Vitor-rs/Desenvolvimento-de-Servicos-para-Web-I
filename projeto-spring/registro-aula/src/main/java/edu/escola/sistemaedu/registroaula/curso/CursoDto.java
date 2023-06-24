package edu.escola.sistemaedu.registroaula.curso;

import edu.escola.sistemaedu.arch.BaseObject;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * DTO for {@link Curso}
 */
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@SuperBuilder
public class CursoDto extends BaseObject implements Serializable {

    // private Long id; Já está herdado de BaseObject
    // private String nome; Já está herdado de BaseObject

    private Integer duracaoCurso;
    private Integer numHorasAulaCurso;
}