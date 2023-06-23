package edu.escola.sistemaedu.registroaula.dadoprofissional;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class DadoProfissionalForm {

    private String profissaoFuncaoCargo;
    private String orgaoInstituicaoEmpresa;
    private String outros;
}