package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import edu.escola.sistemaedu.registroaula.matricula.MatriculaDto;
import edu.escola.sistemaedu.registroaula.professor.ProfessorDto;
import lombok.*;

import java.time.LocalDateTime;

/**
 * Form for {@link RegistroFrequenciaAula}
 */
@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegistroFrequenciaAulaForm {

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