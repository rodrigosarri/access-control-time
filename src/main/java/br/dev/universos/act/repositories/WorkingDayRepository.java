package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.dev.universos.act.models.WorkingDay;

public interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {
    
}
