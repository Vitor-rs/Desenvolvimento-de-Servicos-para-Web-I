package edu.escola.sistemaedu.registroaula.dadoprofissional;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class DadoProfissionalController extends AbstractBasicController<DadoProfissional, DadoProfissionalDto, DadoProfissionalForm, DadoProfissionalRepository, DadoProfissionalService, Long> {

    @Autowired
    @Override
    public void setService(DadoProfissionalService service) {
        this.service = service;
        setMapper(DadoProfissionalMapper.INSTANCE);
    }

    @Override
    public URI createUri(DadoProfissional entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/dadoprofissional/{id}")
                .buildAndExpand(entity.getDadoProfissionalId())
                .toUri();
    }

}