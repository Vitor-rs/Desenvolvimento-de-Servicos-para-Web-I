package edu.escola.sistemaedu.model.Professor;

import edu.escola.sistemaedu.model.Pessoa.Pessoa;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity
public class ProfessorEntity extends Pessoa {

    @Column(name = "col_especialidade_tb_Professor")
    private String especialidade;

    @Column(unique = true, name = "col_login_tb_Professor")
    private String login;

    @Column(unique = true, name = "col_senha_tb_Professor")
    private String senha;


    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
