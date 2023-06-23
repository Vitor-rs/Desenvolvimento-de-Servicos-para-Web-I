package edu.escola.sistemaedu.registroaula.dadoprofissional;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Dado Profissional não encontrado")
public class DadoProfissionalNotFoundException extends ResponseStatusException {

    public DadoProfissionalNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }

}