package edu.escola.sistemaedu.model.Endereco;

import edu.escola.sistemaedu.model.Endereco.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, UUID> { }
