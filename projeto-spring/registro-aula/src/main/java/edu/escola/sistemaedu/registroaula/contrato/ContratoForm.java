package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.registroaula.aluno.AlunoForm;
import edu.escola.sistemaedu.registroaula.curso.CursoForm;
import edu.escola.sistemaedu.registroaula.matricula.MatriculaForm;
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

    private CursoForm curso;
    private AlunoForm aluno;
    private MatriculaForm matricula;

}