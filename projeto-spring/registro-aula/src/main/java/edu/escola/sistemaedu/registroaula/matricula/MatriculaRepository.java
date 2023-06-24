package edu.escola.sistemaedu.registroaula.matricula;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends IArchRepository<Matricula, Long>, JpaSpecificationExecutor<Matricula> {}