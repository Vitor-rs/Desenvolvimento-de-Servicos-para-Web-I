package edu.escola.sistemaedu.registroaula.dadoacademico;

import lombok.*;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DadoAcademicoForm {

    private String serieEscolar;
    private String escolaridadeAtual;
    private String orgaoInstituicaoEmpresa;

}