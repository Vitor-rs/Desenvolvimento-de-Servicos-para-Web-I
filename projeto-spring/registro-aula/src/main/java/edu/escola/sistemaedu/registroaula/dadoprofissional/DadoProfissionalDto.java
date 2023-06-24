package edu.escola.sistemaedu.registroaula.dadoprofissional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * DTO for {@link DadoProfissional}
 */
@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class DadoProfissionalDto implements Serializable {

    private String profissaoFuncaoCargo;
    private String orgaoInstituicaoEmpresa;
    private String outros;
}