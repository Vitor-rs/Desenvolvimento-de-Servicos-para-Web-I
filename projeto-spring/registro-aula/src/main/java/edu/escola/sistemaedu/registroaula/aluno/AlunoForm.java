package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.registroaula.contrato.Contrato;
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
public class AlunoForm {

    private String nome;
    private Matricula matricula;
    private Contrato contrato;
    private Curso curso;
}