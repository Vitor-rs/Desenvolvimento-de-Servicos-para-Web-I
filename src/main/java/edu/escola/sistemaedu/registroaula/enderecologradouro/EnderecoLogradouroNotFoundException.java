package edu.escola.sistemaedu.registroaula.enderecologradouro;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Endereco Logradouro não encontrado")
public class EnderecoLogradouroNotFoundException extends ResponseStatusException {
    public EnderecoLogradouroNotFoundException(String errorMessage) {
        super(HttpStatus.NOT_FOUND, errorMessage);
    }
}