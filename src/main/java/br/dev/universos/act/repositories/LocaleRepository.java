package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.Locale;

public interface LocaleRepository extends JpaRepository<Locale, Long> {
    
}
