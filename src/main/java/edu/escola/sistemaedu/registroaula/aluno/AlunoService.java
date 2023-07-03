package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class AlunoService extends AbstractBasicService<Aluno, Long, AlunoForm, AlunoRepository> {

    @Override
    public void setRepository(AlunoRepository repository) {
        super.repository = repository;
        setMapper(AlunoMapper.INSTANCE);
    }
}