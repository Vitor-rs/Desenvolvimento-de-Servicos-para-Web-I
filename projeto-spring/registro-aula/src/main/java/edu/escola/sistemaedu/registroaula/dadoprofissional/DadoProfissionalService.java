package edu.escola.sistemaedu.registroaula.dadoprofissional;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class DadoProfissionalService extends AbstractBasicService<DadoProfissional, Long, DadoProfissionalForm, DadoProfissionalRepository> {

    @Override
    public void setRepository(DadoProfissionalRepository repository) {
        super.repository = repository;
        setMapper(DadoProfissionalMapper.INSTANCE);
    }

}