package br.edu.ifms.matricula.model.repositories;

import br.edu.ifms.matricula.model.entities.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstudanteRepository
extends JpaRepository<Estudante, UUID> {

}


