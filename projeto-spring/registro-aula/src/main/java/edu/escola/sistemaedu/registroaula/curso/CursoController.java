package edu.escola.sistemaedu.registroaula.curso;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/curso")
public class CursoController extends AbstractBasicController<Curso, CursoDto, CursoForm, CursoRepository, CursoService, Long> {

    @Override
    public void setService(CursoService service) {
        this.service = service;
        setMapper(CursoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Curso entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/curso/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}