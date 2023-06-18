package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class Professor extends Pessoa {

    @Column(name = "col_especialidade_tb_Professor")
    private String especialidade;

    @Column(unique = true, name = "col_login_tb_Professor")
    private String login;

    @Column(unique = true, name = "col_senha_tb_Professor")
    private String senha;




}
