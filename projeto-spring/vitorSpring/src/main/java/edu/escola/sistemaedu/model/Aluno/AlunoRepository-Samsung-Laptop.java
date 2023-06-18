package edu.escola.sistemaedu.model.Aluno;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AlunoRepository extends JpaRepository<AlunoEntity, UUID> {
}