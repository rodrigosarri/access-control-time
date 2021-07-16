package br.dev.universos.act.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.dev.universos.act.models.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    
}
