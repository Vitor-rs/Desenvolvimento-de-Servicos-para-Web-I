package edu.escola.sistemaedu.registroaula.dadoprofissional;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.*;

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