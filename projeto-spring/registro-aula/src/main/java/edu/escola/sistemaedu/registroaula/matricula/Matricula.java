package edu.escola.sistemaedu.registroaula.matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@SequenceGenerator(sequenceName = "matriculaSequence", name = "matricula_seq", allocationSize = 1)
public class Matricula {

    @Id
    private Long matriculaId;
    private Boolean ePrimeiraMatricula;
    private Boolean eAtual;
    private String dataInicio;
    private String dataFim;
    private String cursoBaseadoEmHorasOuPeriodo;

}