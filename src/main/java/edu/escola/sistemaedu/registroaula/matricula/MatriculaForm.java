package edu.escola.sistemaedu.registroaula.matricula;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class MatriculaForm {

    private Boolean ePrimeiraMatricula;
    private Boolean eAtual;
    private String dataInicio;
    private String dataFim;
    private String cursoBaseadoEmHorasOuPeriodo;
}