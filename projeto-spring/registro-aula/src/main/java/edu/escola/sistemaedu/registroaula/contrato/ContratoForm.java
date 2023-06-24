package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.registroaula.aluno.AlunoDto;
import edu.escola.sistemaedu.registroaula.curso.Curso;
import edu.escola.sistemaedu.registroaula.matricula.Matricula;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ContratoForm {

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