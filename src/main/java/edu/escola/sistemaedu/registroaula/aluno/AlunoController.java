package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/aluno")
public class AlunoController extends AbstractBasicController<Aluno, AlunoDto, AlunoForm, AlunoRepository, AlunoService, Long> {

    @Autowired
    @Override
    public void setService(AlunoService service) {
        this.service = service;
        setMapper(AlunoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Aluno entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/aluno/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}