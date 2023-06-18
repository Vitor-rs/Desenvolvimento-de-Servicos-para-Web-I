package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfessorRepository extends JpaRepository<Professor, UUID> {
}