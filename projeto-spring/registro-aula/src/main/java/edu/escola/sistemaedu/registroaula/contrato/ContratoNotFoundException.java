package edu.escola.sistemaedu.registroaula.contrato;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Contrato não encontrado")
public class ContratoNotFoundException extends ResponseStatusException {
    public ContratoNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}