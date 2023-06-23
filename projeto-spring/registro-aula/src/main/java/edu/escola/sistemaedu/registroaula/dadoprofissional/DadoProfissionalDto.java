package edu.escola.sistemaedu.registroaula.dadoprofissional;

import edu.escola.sistemaedu.arch.dto.AdapterBaseObjectDto;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;


/**
 * DTO for {@link DadoProfissional}
 */
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class DadoProfissionalDto extends AdapterBaseObjectDto implements Serializable {

    // private final Long id; Já está no AdapterBaseObjectDto

    private String profissaoFuncaoCargo;
    private String orgaoInstituicaoEmpresa;
    private String outros;
}