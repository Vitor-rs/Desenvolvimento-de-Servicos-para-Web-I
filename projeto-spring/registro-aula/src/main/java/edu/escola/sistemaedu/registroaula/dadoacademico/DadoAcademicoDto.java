package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import lombok.*;
import lombok.experimental.SuperBuilder;


@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DadoAcademicoDto extends AdapterBaseObjectDto {

    // private Long dadoAcademicoId; Já está no AdapterBaseObjectDto
    private String serieEscolar;
    private String escolaridadeAtual;
    private String orgaoInstituicaoEmpresa;

}