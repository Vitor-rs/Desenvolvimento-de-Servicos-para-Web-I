package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.BaseObject;

import edu.escola.sistemaedu.registroaula.curso.Curso;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;

import lombok.experimental.SuperBuilder;
import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(name = "apostila_seq", sequenceName = "apostila_seq", allocationSize = 1)
public class Apostila extends BaseObject {

    // private long apostilaId; Já está no BaseObject

	// private String nome; Já está no BaseObject

	private String conteudoMateria;

	private int idadeMinima;

	private int idadeMaxima;

	private int numeroLicoes;

	private int numeroHoras;

	private Curso curso;

}