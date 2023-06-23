package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/dadoacademico")
public class DadoAcademicoController extends AbstractBasicController<DadoAcademico, DadoAcademicoDto, DadoAcademicoForm, DadoAcademicoRepository, DadoAcademicoService, Long> {

    @Autowired
    @Override
    public void setService(DadoAcademicoService service) {
        this.service = service;
        setMapper(DadoAcademicoMapper.INSTANCE);
    }

    @Override
    public URI createUri(DadoAcademico entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/campus/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }
}