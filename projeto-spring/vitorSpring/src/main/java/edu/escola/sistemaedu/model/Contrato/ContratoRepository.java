package edu.escola.sistemaedu.model.Contrato;

import edu.escola.sistemaedu.model.Contrato.ContratoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContratoRepository extends JpaRepository<ContratoEntity, UUID> {
}