package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.registroaula.aluno.AlunoDto;
import edu.escola.sistemaedu.registroaula.curso.Curso;
import edu.escola.sistemaedu.registroaula.matricula.Matricula;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * DTO for {@link Contrato}
 */
@EqualsAndHashCode
@Builder
@AllArgsConstructor
public class ContratoDto implements Serializable {

    @Id
    private Long contratoId;
    private String situacaoContrato;
    private String tipoContrato;
    private String contratante;
    private String modalidade;
    private String dataInicio;
    private String dataTermino;
    private Curso curso;
    private AlunoDto aluno;
    private Matricula matricula;
}