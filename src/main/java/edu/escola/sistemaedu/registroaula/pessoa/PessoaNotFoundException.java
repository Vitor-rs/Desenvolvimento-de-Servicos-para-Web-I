package edu.escola.sistemaedu.registroaula.pessoa;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Pessoa não encontrada")
public class PessoaNotFoundException extends ResponseStatusException {
    public PessoaNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}