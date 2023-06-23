package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@SequenceGenerator(name = "dadoAcademicoSequence", sequenceName = "dado_academico_seq", allocationSize = 1)
@Entity
public class DadoAcademico extends BaseObject {

    // private Long dadoAcademicoId; Atributo não necessário, pois o id já está sendo gerado automaticamente pelo sequence generator

    private String serieEscolar;

    private String escolaridadeAtual;

    private String orgaoInstituicaoEmpresa;

}