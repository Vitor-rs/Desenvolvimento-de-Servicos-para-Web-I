package edu.escola.sistemaedu.registroaula.dadoacademico;

import edu.escola.sistemaedu.registroaula.dadoacademico.DadoAcademico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadoAcademicoRepository extends JpaRepository<DadoAcademico, Long> {}