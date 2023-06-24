package edu.escola.sistemaedu.registroaula.professor;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends IArchRepository<Professor, Long> {}