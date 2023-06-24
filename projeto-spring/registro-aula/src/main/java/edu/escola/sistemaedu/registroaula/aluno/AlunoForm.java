package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectForm;
import edu.escola.sistemaedu.registroaula.contrato.Contrato;
import edu.escola.sistemaedu.registroaula.curso.Curso;
import edu.escola.sistemaedu.registroaula.matricula.Matricula;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AlunoForm extends AdapterBaseObjectForm {

    // private Long id; Já está no AdapterBaseObjectForm
    // private String nome; Já está no AdapterBaseObjectForm

    private Matricula matricula;
    private Contrato contrato;
    private Curso curso;

}