package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.registroaula.aluno.AlunoDto;
import edu.escola.sistemaedu.registroaula.curso.CursoDto;
import edu.escola.sistemaedu.registroaula.matricula.MatriculaDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO for {@link Contrato}
 */
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContratoDto implements Serializable {

    private Long id;

    private String situacaoContrato;
    private String tipoContrato;
    private String contratante;
    private String modalidade;
    private String dataInicio;
    private String dataTermino;

    private CursoDto curso;
    private AlunoDto aluno;
    private MatriculaDto matricula;

}