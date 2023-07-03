package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.registroaula.contrato.Contrato;
import edu.escola.sistemaedu.registroaula.curso.Curso;
import edu.escola.sistemaedu.registroaula.matricula.Matricula;
import edu.escola.sistemaedu.registroaula.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@DiscriminatorValue("ALUNO")
@SequenceGenerator(sequenceName = "alunoSequence", name = "aluno_seq", allocationSize = 1)
public class Aluno extends Pessoa {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "matriculaId")
    private Matricula matricula;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contratoId")
    private Contrato contrato;

    @ManyToOne
    @JoinColumn(name = "cursoId")
    private Curso curso;
}