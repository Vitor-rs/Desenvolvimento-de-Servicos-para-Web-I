package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.BaseObject;
import edu.escola.sistemaedu.registroaula.curso.Curso;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(name = "apostilaSequence", sequenceName = "apostila_seq", allocationSize = 1)
public class Apostila extends BaseObject {

    private String conteudoMateria;
    private Integer idadeMinima;
    private Integer idadeMaxima;
    private Integer numeroLicoes;
    private Integer numeroHoras;

    @ManyToOne
    private Curso curso;


}