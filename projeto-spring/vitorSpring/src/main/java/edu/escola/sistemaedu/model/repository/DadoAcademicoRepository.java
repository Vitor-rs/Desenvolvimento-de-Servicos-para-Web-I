package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.dto.DadoAcademico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DadoAcademicoRepository extends JpaRepository<DadoAcademico, UUID> {
}