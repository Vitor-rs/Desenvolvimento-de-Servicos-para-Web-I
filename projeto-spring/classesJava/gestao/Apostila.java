package gestao;

import java.util.Collection;

public class Apostila {

	private long apostilaId;

	private String nome;

	private String conteudoMateria;

	private int idadeMinima;

	private int idadeMaxima;

	private int numeroLicoes;

	private int numeroHoras;

	private Curso curso;

	private Collection<PlanejamentoApostila> planejamentoApostila;

}
