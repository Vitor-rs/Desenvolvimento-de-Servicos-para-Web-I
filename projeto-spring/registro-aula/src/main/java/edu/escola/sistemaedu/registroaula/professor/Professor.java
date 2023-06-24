package edu.escola.sistemaedu.registroaula.professor;

import edu.escola.sistemaedu.registroaula.pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("PROFESSOR")
public class Professor extends Pessoa {

    private String especialidade;

}