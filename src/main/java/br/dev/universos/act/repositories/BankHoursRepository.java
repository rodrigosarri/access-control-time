package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.BankHours;

public interface BankHoursRepository extends JpaRepository<BankHours, Long> {
    
}
