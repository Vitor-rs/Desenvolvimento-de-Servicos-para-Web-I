package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DadoAcademicoDto extends AdapterBaseObjectDto implements Serializable {

    private String serieEscolar;
    private String escolaridadeAtual;
    private String orgaoInstituicaoEmpresa;

}