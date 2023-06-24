package edu.escola.sistemaedu.registroaula.curso;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends IArchRepository<Curso, Long>, JpaSpecificationExecutor<Curso> {
}