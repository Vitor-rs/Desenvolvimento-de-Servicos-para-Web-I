package edu.escola.sistemaedu.registroaula.professor;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/professor")
public class ProfessorController extends AbstractBasicController<Professor, ProfessorDto, ProfessorForm, ProfessorRepository, ProfessorService, Long> {
    @Override
    public void setService(ProfessorService service) {
        this.service = service;
        setMapper(ProfessorMapper.INSTANCE);
    }

    @Override
    public URI createUri(Professor entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/professor/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}