package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DadoAcademicoDto extends AdapterBaseObjectDto implements Serializable {

    // private Long dadoAcademicoId; Já está no AdapterBaseObjectDto
    private String serieEscolar;
    private String escolaridadeAtual;
    private String orgaoInstituicaoEmpresa;

}