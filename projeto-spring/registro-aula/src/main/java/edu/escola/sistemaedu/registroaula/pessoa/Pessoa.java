package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademico;
import edu.escola.sistemaedu.registroaula.dadoprofissional.DadoProfissional;
import edu.escola.sistemaedu.registroaula.enderecologradouro.EnderecoLogradouro;

import jakarta.persistence.*;
import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "tb_pessoa")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo")
public abstract class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pessoaId")
    private Long id;

    private String nome;
    private String sobrenome;
    private String CPF;
    private String RG;
    private String genero;
    private String dataNascimento;
    private Boolean estrangeiro;
    private String email;
    private String numeroTelCelular;
    private String numeroTelFixo;
    private String cidadeNatal;
    private String estadoNatal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadoAcademicoId")
    private DadoAcademico dadoAcademico;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dadoProfissionalId")
    private DadoProfissional dadoProfissional;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "enderecoLogradouroId")
    private EnderecoLogradouro enderecoLogradouro;
}