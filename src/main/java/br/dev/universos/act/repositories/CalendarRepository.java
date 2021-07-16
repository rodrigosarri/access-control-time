package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.Calendar;

public interface CalendarRepository extends JpaRepository<Calendar, Long> {
    
}
