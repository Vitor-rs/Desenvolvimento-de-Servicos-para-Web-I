package edu.escola.sistemaedu.registroaula.curso;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CursoForm extends AdapterBaseObjectDto {

    private Integer duracaoCurso;
    private Integer numHorasAulaCurso;

}