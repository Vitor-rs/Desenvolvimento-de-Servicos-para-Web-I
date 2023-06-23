package edu.escola.sistemaedu.registroaula.dadoprofissional;

import edu.escola.sistemaedu.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@SequenceGenerator(sequenceName = "dadoProfissionalSequence", name = "dado_profissional_seq", allocationSize = 1)
public class DadoProfissional extends BaseObject {

    // private Long dadoProfissionalId; Atributo não necessário, pois o id já está sendo gerado automaticamente pelo sequence generator

    private String profissaoFuncaoCargo;

    private String orgaoInstituicaoEmpresa;

    private String outros;

}