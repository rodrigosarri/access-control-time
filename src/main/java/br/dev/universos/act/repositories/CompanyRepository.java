package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.Company;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    
}
