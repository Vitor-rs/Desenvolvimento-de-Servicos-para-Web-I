package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import edu.escola.sistemaedu.registroaula.matricula.Matricula;
import edu.escola.sistemaedu.registroaula.professor.Professor;

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
@SequenceGenerator(name = "registroFrequenciaAula", sequenceName = "seq_registro_frequencia_aula", allocationSize = 1)
public class RegistroFrequenciaAula {

    @Id
    private long registroFrequenciaAulaId;

	private String dataHora;

	private int numeroAula;

	private char presenca;

	private String licaoConteudo;

	private String observacoesAnotacoes;

	private String duracaoAula;

	private int fala;

	private int audicao;

	private int leitura;

	private int escrita;

	private int tarefa;

	private char situacaoTarefa;

	private String app;

	private int engajamento;

	private String sala;

	private Matricula matricula;

	private Professor professor;

}