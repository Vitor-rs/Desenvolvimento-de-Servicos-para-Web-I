package edu.escola.sistemaedu.registroaula.professor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Professor}
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class ProfessorDto implements Serializable {

    private String especialidade;

}