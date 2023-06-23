package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/api/pessoa")
public class PessoaController extends AbstractBasicController<Pessoa, PessoaDto, PessoaForm, PessoaRepository, PessoaService, Long> {

    @Override
    public void setService(PessoaService service) {
        this.service = service;
        setMapper(PessoaMapper.INSTANCE);
    }

    @Override
    public URI createUri(DadoAcademico entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/pessoa/{id}")
                .buildAndExpand(entity.getId())
                .toUri();
    }

}