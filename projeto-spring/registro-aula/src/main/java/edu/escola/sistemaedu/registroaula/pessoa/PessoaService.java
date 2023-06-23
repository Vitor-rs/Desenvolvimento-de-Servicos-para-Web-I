package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class PessoaService extends AbstractBasicService<Pessoa, Long, PessoaForm, PessoaRepository> {
    @Override
    public void setRepository(PessoaRepository repository) {
        super.repository = repository;
        setMapper(PessoaMapper.INSTANCE);
    }
}