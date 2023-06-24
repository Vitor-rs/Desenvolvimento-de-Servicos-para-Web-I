package edu.escola.sistemaedu.registroaula.professor;

import edu.escola.sistemaedu.arch.service.AbstractBasicService;

public class ProfessorService extends AbstractBasicService<Professor, Long, ProfessorForm, ProfessorRepository> {
        @Override
        public void setRepository(ProfessorRepository repository) {
            super.repository = repository;
            setMapper(ProfessorMapper.INSTANCE);
        }
}