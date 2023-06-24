package edu.escola.sistemaedu.registroaula.matricula;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@SequenceGenerator(sequenceName = "matriculaSequence", name = "matricula_seq", allocationSize = 1)
public class Matricula {

    @Id
    private Long id;
    private Boolean ePrimeiraMatricula;
    private Boolean eAtual;
    private String dataInicio;
    private String dataFim;
    private String cursoBaseadoEmHorasOuPeriodo;
}