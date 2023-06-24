package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/contrato")
public class ContratoController extends AbstractBasicController<Contrato, ContratoDto, ContratoForm, ContratoRepository, ContratoService, Long> {
    @Override
    public void setService(ContratoService service) {
        this.service = service;
        setMapper(ContratoMapper.INSTANCE);
    }

    @Override
    public URI createUri(Contrato entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/contrato/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}