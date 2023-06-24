package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/apostila")
public class ApostilaController extends AbstractBasicController<Apostila, ApostilaDto, ApostilaForm, ApostilaRepository, ApostilaService, Long> {
    @Override
    public void setService(ApostilaService service) {
        this.service = service;
        setMapper(ApostilaMapper.INSTANCE);
    }

    @Override
    public URI createUri(Apostila entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/apostila/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}