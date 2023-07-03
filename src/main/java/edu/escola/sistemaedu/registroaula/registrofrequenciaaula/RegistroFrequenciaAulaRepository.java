package edu.escola.sistemaedu.registroaula.registrofrequenciaaula;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroFrequenciaAulaRepository extends IArchRepository<RegistroFrequenciaAula, Long> {
}