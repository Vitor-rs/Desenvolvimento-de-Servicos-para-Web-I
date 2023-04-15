package edu.escola.sistemaedu.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID pessoaID;

    @Column
    private String nomeCompleto;

    @Column(unique = true)
    private String CPF;

    @Column(unique = true)
    private String RG;

    @Column
    private Date dataNascimento;

    @Column
    private String genero;

    @Column
    private String email;

    @Column
    private String telefoneCelular;

    @Column
    private String telefoneFixo;

    @ManyToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    @Column
    private String cidadeNatal;

    @Column
    private String estadoNatal;

    @Column
    private boolean estrangeiro;

    @OneToOne(cascade = CascadeType.ALL)
    private DadoAcademico dadosAcademicos;

    @OneToOne(cascade = CascadeType.ALL)
    private DadoProfissional dadosProfissionais;


    public UUID getPessoaID() {
        return pessoaID;
    }

    public void setPessoaID(UUID pessoaID) {
        this.pessoaID = pessoaID;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getCidadeNatal() {
        return cidadeNatal;
    }

    public void setCidadeNatal(String cidadeNatal) {
        this.cidadeNatal = cidadeNatal;
    }

    public String getEstadoNatal() {
        return estadoNatal;
    }

    public void setEstadoNatal(String estadoNatal) {
        this.estadoNatal = estadoNatal;
    }

    public boolean isEstrangeiro() {
        return estrangeiro;
    }

    public void setEstrangeiro(boolean estrangeiro) {
        this.estrangeiro = estrangeiro;
    }

    public DadoAcademico getDadosAcademicos() {
        return dadosAcademicos;
    }

    public void setDadosAcademicos(DadoAcademico dadosAcademicos) {
        this.dadosAcademicos = dadosAcademicos;
    }

    public DadoProfissional getDadosProfissionais() {
        return dadosProfissionais;
    }

    public void setDadosProfissionais(DadoProfissional dadosProfissionais) {
        this.dadosProfissionais = dadosProfissionais;
    }
}
