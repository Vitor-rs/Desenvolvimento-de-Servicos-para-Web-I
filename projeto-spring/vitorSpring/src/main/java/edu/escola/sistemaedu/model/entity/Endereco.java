package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "tb_Endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;

    @Column(name = "col_logradouro_tb_Endereco")
    private String logradouro;

    @Column(name = "col_complemento_tb_Endereco")
    private String complemento;

    @Column(name = "col_numero_tb_Endereco")
    private String numero;

    @Column(name = "col_bairro_tb_Endereco")
    private String bairro;

    @Column(name = "col_cidade_tb_Endereco")
    private String cidade;

    @Column(name = "col_estado_tb_Endereco")
    private String estado;

    @Column(name = "col_cep_tb_Endereco")
    private String cep;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
