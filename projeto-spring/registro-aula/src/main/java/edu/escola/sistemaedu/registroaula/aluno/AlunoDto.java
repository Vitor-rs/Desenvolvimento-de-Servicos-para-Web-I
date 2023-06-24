package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import edu.escola.sistemaedu.registroaula.contrato.Contrato;
import edu.escola.sistemaedu.registroaula.curso.Curso;
import edu.escola.sistemaedu.registroaula.matricula.Matricula;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * DTO for {@link Aluno}
 */

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
//@NoArgsConstructor
@SuperBuilder
public class AlunoDto extends AdapterBaseObjectDto implements Serializable {

    // private final Long id; Já está no AdapterBaseObjectDto
    // private final String nome; Já está no AdapterBaseObjectDto

    private Matricula matricula;
    private Contrato contrato;
    private Curso curso;
}