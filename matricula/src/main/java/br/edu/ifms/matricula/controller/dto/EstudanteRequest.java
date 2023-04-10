package br.edu.ifms.matricula.controller.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class EstudanteRequest {

	@NotBlank
	@Size(max = 80, message = "Informe o nome completo")
	private String nome;

	@NotBlank
	@Size(min = 11)
	private String cpf;

	@Size(max = 150, message = "Informe um endreço de e-mail")
	private String email;

	@Size(max = 50, message = "Informe uma senha com até 50 caracteres")
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
