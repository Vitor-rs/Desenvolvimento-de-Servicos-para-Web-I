package edu.escola.sistemaedu.registroaula.dadoprofissional;

import edu.escola.sistemaedu.arch.BaseObject;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@SequenceGenerator(sequenceName = "dadoProfissionalSequence", name = "dado_profissional_seq", allocationSize = 1)
public class DadoProfissional {

    @Id
    private Long dadoProfissionalId;

    private String profissaoFuncaoCargo;

    private String orgaoInstituicaoEmpresa;

    private String outros;

}