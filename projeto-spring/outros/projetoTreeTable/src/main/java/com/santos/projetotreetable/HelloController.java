package com.santos.projetotreetable;

import javafx.beans.binding.Bindings;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.paint.Color;
import javafx.util.converter.IntegerStringConverter;

import java.net.URL;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.*;

public class HelloController implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, String> nomeColumn;

    @FXML
    private TableColumn<Person, String> presencaColumn;

    @FXML
    private TableColumn<Person, Integer> mesColumn;

    @FXML
    private TableColumn<Person, Integer> numSemanaColumn;

    @FXML
    private TableColumn<Person, String> diaSemanaColumn;

    @FXML
    private TableColumn<Person, String> diaMesColumn;

    @FXML
    private TableColumn<Person, String> inicioColumn;

    @FXML
    private TextField nomeTextField;

    @FXML
    private TextField presencaTextField;

    private Random random;

    public void initialize(URL location, ResourceBundle resources) {
        // Configuração das colunas da tabela
        nomeColumn.setCellValueFactory(new PropertyValueFactory<>("nome"));
        presencaColumn.setCellValueFactory(new PropertyValueFactory<>("presenca"));
        mesColumn.setCellValueFactory(new PropertyValueFactory<>("mes"));
        numSemanaColumn.setCellValueFactory(new PropertyValueFactory<>("numSemana"));
        diaSemanaColumn.setCellValueFactory(new PropertyValueFactory<>("diaSemana"));

        // Configuração das colunas extras
        diaMesColumn.setCellValueFactory(new PropertyValueFactory<>("diaMes"));

        // Configuração da coluna de início
        inicioColumn.setCellValueFactory(new PropertyValueFactory<>("inicio"));

        // Definir a formatação de cores da célula de presença
        presencaColumn.setCellFactory(column -> new TableCell<Person, String>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);

                if (item == null || empty) {
                    setText(null);
                    setStyle("");
                } else {
                    setText(item);

                    // Aplicar formatação de cor com base no valor da célula
                    if (item.equalsIgnoreCase("x")) {
                        setStyle("-fx-background-color: #f64747;" +
                                "-fx-text-fill: white;" +
                                "-fx-font-weight: bold;" +
                                "-fx-font-size: 14px;" +
                                "-fx-alignment: center;" +
                                "-fx-border-insets: 0 0 0 0, 0, 1, 1;");
                    } else if (item.equalsIgnoreCase("p")) {
                        setStyle("-fx-background-color: #16a085;" +
                                "-fx-text-fill: white;" +
                                "-fx-font-weight: bold;" +
                                "-fx-font-size: 14px;" +
                                "-fx-alignment: center;" +
                                "-fx-border-insets: 0 0 0 0, 0, 1, 1;");
                    } else {
                        // Caso não seja "x" nem "p", usar formatação padrão
                        setStyle("");
                    }
                }
            }
        });

        mesColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        mesColumn.setOnEditCommit(event -> {
            TablePosition<Person, Integer> position = event.getTablePosition();
            Integer newMes = event.getNewValue();
            int row = position.getRow();
            Person person = event.getTableView().getItems().get(row);
            person.setMes(newMes);

            tableView.refresh(); // Atualiza a tabela para refletir as mudanças

            // Formata a borda superior da linha se houver mudança de mês
            ObservableList<TablePosition> selectedCells = tableView.getSelectionModel().getSelectedCells();
            if (!selectedCells.isEmpty()) {
                int selectedRow = selectedCells.get(0).getRow();
                Person selectedPerson = tableView.getItems().get(selectedRow);

                for (int i = selectedRow; i >= 0; i--) {
                    Person currentPerson = tableView.getItems().get(i);
                    if (currentPerson.getMes() != selectedPerson.getMes()) {
                        TableRow<Person> currentRow = (TableRow<Person>) tableView.lookup(".table-row-cell[index=" + i + "]");
                        currentRow.setStyle("-fx-border-color: black black black black; -fx-border-width: 1 0 0 0;");
                    } else {
                        break;
                    }
                }
            }
        });



        // Configurar a edição das células
        tableView.setEditable(true);
        tableView.getSelectionModel().cellSelectionEnabledProperty().set(true);

        // Configurar a edição da célula de Mes
        mesColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        mesColumn.setOnEditCommit(event -> {
            TablePosition<Person, Integer> position = event.getTablePosition();
            Integer newMes = event.getNewValue();
            int row = position.getRow();
            Person person = event.getTableView().getItems().get(row);
            person.setMes(newMes);
        });


    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void adicionarPessoa() {
        String nome = nomeTextField.getText();
        String presenca = presencaTextField.getText();

        // Obtém os valores para as colunas extras
        int mes = LocalDate.now().getMonthValue();
        int numSemana = LocalDate.now().get(WeekFields.ISO.weekOfMonth());
        String diaSemana = LocalDate.now().getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
        String diaMes = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM"));
        String inicio = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));

        Person pessoa = new Person(nome, presenca, mes, numSemana, diaSemana, diaMes, inicio);
        tableView.getItems().add(pessoa);

        // Limpa os campos do formulário após adicionar a pessoa
        nomeTextField.clear();
        presencaTextField.clear();
    }
}
