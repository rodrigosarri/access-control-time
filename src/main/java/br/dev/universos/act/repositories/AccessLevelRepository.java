package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.AccessLevel;

public interface AccessLevelRepository extends JpaRepository<AccessLevel, Long> {
    
}
