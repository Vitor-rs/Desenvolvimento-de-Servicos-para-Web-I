package edu.escola.sistemaedu.registroaula.apostila;

import edu.escola.sistemaedu.arch.repository.IArchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApostilaRepository extends IArchRepository<Apostila, Long> {
}