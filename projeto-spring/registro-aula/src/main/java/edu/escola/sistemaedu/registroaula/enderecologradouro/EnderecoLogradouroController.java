package edu.escola.sistemaedu.registroaula.enderecologradouro;


import edu.escola.sistemaedu.arch.controller.AbstractBasicController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class EnderecoLogradouroController extends AbstractBasicController<EnderecoLogradouro, EnderecoLogradouroDto, EnderecoLogradouroForm, EnderecoLogradouroRepository, EnderecoLogradouroService, Long> {

    @Autowired
    @Override
    public void setService(EnderecoLogradouroService service) {
        this.service = service;
        setMapper(EnderecoLogradouroMapper.INSTANCE);
    }

    @Override
    public URI createUri(EnderecoLogradouro entity, UriComponentsBuilder uriBuilder) {
        return uriBuilder.path("/enderecologradouro/{id}").buildAndExpand(entity.getEnderecoLogradouroId()).toUri();
    }


}