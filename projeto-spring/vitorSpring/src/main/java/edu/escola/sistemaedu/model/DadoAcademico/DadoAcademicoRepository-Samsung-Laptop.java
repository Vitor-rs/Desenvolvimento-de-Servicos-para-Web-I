package edu.escola.sistemaedu.model.DadoAcademico;

import edu.escola.sistemaedu.model.DadoAcademico.DadoAcademicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DadoAcademicoRepository extends JpaRepository<DadoAcademicoEntity, UUID> { }