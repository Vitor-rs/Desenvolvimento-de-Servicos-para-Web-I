package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;
import org.springframework.stereotype.Service;

@Service
public class DadoAcademicoService extends AbstractBasicService<DadoAcademico, Long, DadoAcademicoForm, DadoAcademicoRepository> {
    @Override
    public void setRepository(DadoAcademicoRepository repository) {
        super.repository = repository;
        setMapper(DadoAcademicoMapper.INSTANCE);
    }
}