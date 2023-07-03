package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Registro de frequência de aula não encontrado")
public class RegistroFrequenciaAulaNotFoundException extends ResponseStatusException {
    public RegistroFrequenciaAulaNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}