package edu.escola.sistemaedu.registroaula.contrato;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContratoRepository extends IArchRepository<Contrato, Long> {
}