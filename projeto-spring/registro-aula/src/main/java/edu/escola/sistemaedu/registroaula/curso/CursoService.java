package edu.escola.sistemaedu.registroaula.curso;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class CursoService extends AbstractBasicService<Curso, Long, CursoForm, CursoRepository> {
    @Override
    public void setRepository(CursoRepository repository) {
        super.repository = repository;
        setMapper(CursoMapper.INSTANCE);
    }
}