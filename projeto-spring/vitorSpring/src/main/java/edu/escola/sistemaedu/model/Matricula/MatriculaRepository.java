package edu.escola.sistemaedu.model.Matricula;

import edu.escola.sistemaedu.model.Matricula.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<MatriculaEntity, Long> {
}