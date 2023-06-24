package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.registroaula.contrato.Contrato;
import edu.escola.sistemaedu.registroaula.curso.Curso;
import edu.escola.sistemaedu.registroaula.matricula.Matricula;
import edu.escola.sistemaedu.registroaula.pessoa.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@SequenceGenerator(sequenceName = "alunoSequence", name = "aluno_seq", allocationSize = 1)
public class Aluno extends Pessoa {
    private Matricula matricula;
    private Contrato contrato;
    private Curso curso;
}