package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.DadoProfissional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DadoProfissionalRepository extends JpaRepository<DadoProfissional, UUID> {
}