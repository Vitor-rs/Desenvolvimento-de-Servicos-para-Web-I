package edu.escola.sistemaedu.registroaula.matricula;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Matricula}
 */
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class MatriculaDto implements Serializable {

    private Boolean ePrimeiraMatricula;
    private Boolean eAtual;
    private String dataInicio;
    private String dataFim;
    private String cursoBaseadoEmHorasOuPeriodo;
}