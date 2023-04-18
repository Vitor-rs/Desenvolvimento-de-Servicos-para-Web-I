package edu.escola.sistemaedu.model.DadoProfissional;

import edu.escola.sistemaedu.model.DadoProfissional.DadoProfissionalEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DadoProfissionalRepository extends JpaRepository<DadoProfissionalEntity, UUID> {
}