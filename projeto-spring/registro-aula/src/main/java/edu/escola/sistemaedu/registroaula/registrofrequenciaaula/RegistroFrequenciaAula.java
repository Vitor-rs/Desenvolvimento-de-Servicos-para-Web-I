package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import edu.escola.sistemaedu.registroaula.matricula.Matricula;
import edu.escola.sistemaedu.registroaula.professor.Professor;

import jakarta.persistence.*;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@SequenceGenerator(name = "registroFrequenciaAula", sequenceName = "seq_registro_frequencia_aula", allocationSize = 1)
public class RegistroFrequenciaAula {

    @Id
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

    @ManyToOne
    private Matricula matricula;

    @ManyToOne
    @JoinColumn(name = "professorId")
    private Professor professor;

    // Campos derivados do LocalDateTime
    private String nomeMesAtual;
    private Integer numeroSemanaMesAtual;
    private String nomeDiaDaSemana;
    private String dataDiaEMes;
    private String horaInicioAula;
    private String horaFimAula;

    // Método para calcular e atualizar os campos derivados
    public void atualizarCamposDerivados() {
        if (dataHora != null) {
            // Nome do mês atual
            nomeMesAtual = dataHora.getMonth().name();

            // Número da semana no mês atual
            numeroSemanaMesAtual = dataHora.getDayOfMonth() / 7 + 1;

            // Nome do dia da semana
            nomeDiaDaSemana = dataHora.getDayOfWeek().name();

            // Data no formato "dia/mês"
            dataDiaEMes = dataHora.format(DateTimeFormatter.ofPattern("dd/MM"));

            // Hora de início da aula no formato "HH:mm"
            horaInicioAula = dataHora.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm"));

            // Hora de término da aula (considerando uma duração fixa de 1 hora) no formato "HH:mm"
            LocalTime horaFim = dataHora.toLocalTime().plusHours(1);
            horaFimAula = horaFim.format(DateTimeFormatter.ofPattern("HH:mm"));
        }
    }
}