package edu.escola.sistemaedu.model.repository;

import edu.escola.sistemaedu.model.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<Endereco, UUID> { }
