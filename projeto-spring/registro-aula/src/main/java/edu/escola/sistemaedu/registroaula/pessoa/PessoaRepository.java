package edu.escola.sistemaedu.registroaula.pessoa;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends IArchRepository<Pessoa, Long>, JpaSpecificationExecutor<Pessoa> {}