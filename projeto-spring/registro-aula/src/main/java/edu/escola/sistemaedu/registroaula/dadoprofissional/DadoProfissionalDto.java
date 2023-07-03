package edu.escola.sistemaedu.registroaula.dadoprofissional;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@AllArgsConstructor
@EqualsAndHashCode
@Builder
public class DadoProfissionalDto implements Serializable {

    @Id
    private Long dadoProfissionalId;

    private String profissaoFuncaoCargo;

    private String orgaoInstituicaoEmpresa;

    private String outros;

}