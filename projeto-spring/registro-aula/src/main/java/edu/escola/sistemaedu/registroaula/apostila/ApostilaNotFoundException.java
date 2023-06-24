package edu.escola.sistemaedu.registroaula.apostila;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Apostila não encontrada")
public class ApostilaNotFoundException extends ResponseStatusException {
    public ApostilaNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}