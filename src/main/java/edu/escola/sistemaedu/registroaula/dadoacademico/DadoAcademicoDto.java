package edu.escola.sistemaedu.registroaula.dadoacademico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class DadoAcademicoDto implements Serializable {

    private String serieEscolar;
    private String escolaridadeAtual;
    private String orgaoInstituicaoEmpresa;

}