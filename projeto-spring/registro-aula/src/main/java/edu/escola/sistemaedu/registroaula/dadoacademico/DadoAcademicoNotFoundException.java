package edu.escola.sistemaedu.registroaula.dadoacademico;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dado Academico não encontrado")
public class DadoAcademicoNotFoundException extends ResponseStatusException {
    public DadoAcademicoNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}