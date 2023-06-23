package edu.escola.sistemaedu.registroaula.dadoacademico;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@SequenceGenerator(name = "dadoAcademicoSequence", sequenceName = "dado_academico_seq", allocationSize = 1)
@Entity
public class DadoAcademico  {

    @Id
    private Long dadoAcademicoId;

	private String serieEscolar;

	private String escolaridadeAtual;

	private String orgaoInstituicaoEmpresa;

}