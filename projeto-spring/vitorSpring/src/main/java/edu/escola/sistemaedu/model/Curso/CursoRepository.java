package edu.escola.sistemaedu.model.Curso;

import edu.escola.sistemaedu.model.Curso.CursoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CursoRepository extends JpaRepository<CursoEntity, UUID> {
}