package edu.escola.sistemaedu.registroaula.curso;


import edu.escola.sistemaedu.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@SequenceGenerator(name = "seq_curso", sequenceName = "seq_curso", initialValue = 1, allocationSize = 1)
@EqualsAndHashCode(callSuper = true)
public class Curso extends BaseObject {

    // private Long cursoId; Atributo herdado de BaseObject
    // private String nome; Atributo herdado de BaseObject

    private Integer duracaoCurso;
    private Integer numHorasAulaCurso;

}