package edu.escola.sistemaedu.registroaula.enderecologradouro;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class EnderecoLogradouroService extends AbstractBasicService<EnderecoLogradouro, Long, EnderecoLogradouroForm, EnderecoLogradouroRepository> {
    @Override
    public void setRepository(EnderecoLogradouroRepository repository) {
        super.repository = repository;
        setMapper(EnderecoLogradouroMapper.INSTANCE);
    }
}