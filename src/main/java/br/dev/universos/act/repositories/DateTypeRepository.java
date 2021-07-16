package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.DateType;

public interface DateTypeRepository extends JpaRepository<DateType, Long> {
    
}
