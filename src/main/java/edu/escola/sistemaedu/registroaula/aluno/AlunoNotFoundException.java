package edu.escola.sistemaedu.registroaula.aluno;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Aluno não encontrado")
public class AlunoNotFoundException extends ResponseStatusException {
    public AlunoNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}