package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Professor extends Pessoa {

    @Column
    private String especialidade;

    @Column(unique = true)
    private String login;

    @Column(unique = true)
    private String senha;

    // construtores, getters e setters
}
