package edu.escola.sistemaedu.registroaula.matricula;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class MatriculaService extends AbstractBasicService<Matricula, Long, MatriculaForm, MatriculaRepository> {
    @Override
    public void setRepository(MatriculaRepository repository) {
        super.repository = repository;
        setMapper(MatriculaMapper.INSTANCE);
    }
}