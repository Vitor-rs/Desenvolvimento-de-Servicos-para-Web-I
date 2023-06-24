package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import edu.escola.sistemaedu.registroaula.matricula.MatriculaDto;
import edu.escola.sistemaedu.registroaula.professor.ProfessorDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO for {@link RegistroFrequenciaAula}
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistroFrequenciaAulaDto implements Serializable {

    private Long id;
    private LocalDateTime dataHora;
    private Integer numeroAula;
    private char presenca;
    private String licaoConteudo;
    private String observacoesAnotacoes;
    private String duracaoAula;
    private Integer fala;
    private Integer audicao;
    private Integer leitura;
    private Integer escrita;
    private Integer tarefa;
    private char situacaoTarefa;
    private String app;
    private Integer engajamento;
    private String sala;

    private MatriculaDto matricula;
    private ProfessorDto professor;

    private String nomeMesAtual;
    private Integer numeroSemanaMesAtual;
    private String nomeDiaDaSemana;
    private String dataDiaEMes;
    private String horaInicioAula;
    private String horaFimAula;
}