package edu.escola.sistemaedu.registroaula.matricula;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/matricula")
public class MatriculaController extends AbstractBasicController<Matricula, MatriculaDto, MatriculaForm, MatriculaRepository, MatriculaService, Long> {

    @Override
    public void setService(MatriculaService service) {
        this.service = service;
        setMapper(MatriculaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Matricula entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/matricula/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}