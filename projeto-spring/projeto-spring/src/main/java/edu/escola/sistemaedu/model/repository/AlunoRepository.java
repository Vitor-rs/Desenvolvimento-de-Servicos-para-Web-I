package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlunoRepository extends JpaRepository<Aluno, UUID> {
}