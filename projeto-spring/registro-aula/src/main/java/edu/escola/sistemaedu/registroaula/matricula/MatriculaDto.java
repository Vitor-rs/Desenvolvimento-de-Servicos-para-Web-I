package edu.escola.sistemaedu.registroaula.matricula;

import lombok.*;

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