package edu.escola.sistemaedu.registroaula.dadoacademico;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class DadoAcademicoNotFoundException extends RuntimeException {
    public DadoAcademicoNotFoundException(Long message) {
        super(message);
    }
}