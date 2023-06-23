package com.santos.projetotreetable;

public class Person {
    private String nome;
    private String presenca;
    private int mes;
    private int numSemana;
    private String diaSemana;
    private String diaMes;
    private String inicio;

    public Person(String nome, String presenca, int mes, int numSemana, String diaSemana, String diaMes, String inicio) {
        this.nome = nome;
        this.presenca = presenca;
        this.mes = mes;
        this.numSemana = numSemana;
        this.diaSemana = diaSemana;
        this.diaMes = diaMes;
        this.inicio = inicio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPresenca() {
        return presenca;
    }

    public void setPresenca(String presenca) {
        this.presenca = presenca;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getNumSemana() {
        return numSemana;
    }

    public void setNumSemana(int numSemana) {
        this.numSemana = numSemana;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getDiaMes() {
        return diaMes;
    }

    public void setDiaMes(String diaMes) {
        this.diaMes = diaMes;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }
}
