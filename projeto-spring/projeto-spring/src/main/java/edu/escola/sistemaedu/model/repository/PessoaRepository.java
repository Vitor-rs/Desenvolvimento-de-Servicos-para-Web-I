package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaRepository extends JpaRepository<Pessoa, UUID> {
}