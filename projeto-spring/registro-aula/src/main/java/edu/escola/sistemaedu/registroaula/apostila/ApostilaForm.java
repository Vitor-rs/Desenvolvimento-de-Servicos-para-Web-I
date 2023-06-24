package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectForm;
import edu.escola.sistemaedu.registroaula.curso.Curso;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ApostilaForm extends AdapterBaseObjectForm {

    private String conteudoMateria;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private Integer numeroLicoes;
    private Integer numeroHoras;
    private Curso curso;

}