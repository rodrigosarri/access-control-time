package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.UserCategory;

public interface UserCategoryRepository extends JpaRepository<UserCategory, Long> {
    
}
