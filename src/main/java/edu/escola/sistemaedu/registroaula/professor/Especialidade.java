package edu.escola.sistemaedu.registroaula.professor;

public enum Especialidade {

    INFORMATICA("Informática"),
    MATEMATICA("Matemática"),
    PORTUGUES("Português"),
    INGLES("Inglês");

    private final String descricao;

    Especialidade(String descricao) {
        this.descricao = descricao;
    }

}