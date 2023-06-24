package edu.escola.sistemaedu.registroaula.matricula;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Matricula não encontrada")
public class MatriculaNotFoundException extends ResponseStatusException {
    public MatriculaNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}