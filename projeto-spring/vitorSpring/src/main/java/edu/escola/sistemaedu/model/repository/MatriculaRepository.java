package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MatriculaRepository extends JpaRepository<Matricula, Long> {
}