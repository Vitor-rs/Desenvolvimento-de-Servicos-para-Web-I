package edu.escola.sistemaedu.registroaula.aluno;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends IArchRepository<Aluno, Long> {
}