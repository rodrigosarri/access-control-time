package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.Movement;
import br.dev.universos.act.repositories.MovementRepository;

@Service
public class MovementService {
    
    @Autowired
    MovementRepository movementRepository;

    public Movement saveMovement(Movement movement) {
        return movementRepository.save(movement);
    }

    public List<Movement> findAllMovement() {
        return movementRepository.findAll();
    }

    public Optional<Movement> findMovementById(Long id) {
        return movementRepository.findById(id);
    }

    public Movement updateMovement(Movement movement) {
        return movementRepository.save(movement);
    }

    public void deleteMovement(Long id) {
        movementRepository.deleteById(id);
    }

}
