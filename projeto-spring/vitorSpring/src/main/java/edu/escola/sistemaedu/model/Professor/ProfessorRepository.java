package edu.escola.sistemaedu.model.Professor;

import edu.escola.sistemaedu.model.Professor.ProfessorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessorRepository extends JpaRepository<ProfessorEntity, UUID> {
}