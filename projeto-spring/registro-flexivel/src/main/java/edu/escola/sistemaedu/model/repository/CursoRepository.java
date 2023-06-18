package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CursoRepository extends JpaRepository<Curso, UUID> {
}