package edu.escola.sistemaedu.registroaula.dadoacademico;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DadoAcademicoForm {

    private String serieEscolar;
    private String escolaridadeAtual;
    private String orgaoInstituicaoEmpresa;

}