package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.Movement;

public interface MovementRepository extends JpaRepository<Movement, Long> {
    
}
