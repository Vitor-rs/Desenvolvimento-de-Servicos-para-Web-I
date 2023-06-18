package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContratoRepository extends JpaRepository<Contrato, UUID> {
}