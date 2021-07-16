package br.dev.universos.act.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dev.universos.act.models.Movement;
import br.dev.universos.act.services.MovementService;

@RestController
@RequestMapping("movement")
public class MovementController {
    
    @Autowired
    MovementService movementService;

    @PostMapping
    public Movement createMovement(@RequestBody Movement movement) {
        return movementService.saveMovement(movement);
    }

    @GetMapping
    public List<Movement> listMovement() {
        return movementService.findAllMovement();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movement> getMovement(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(movementService.findMovementById(id).orElseThrow(() -> new Exception("Movimentação não encontrada")));
    }

    @PutMapping
    public Movement updateMovement(@RequestBody Movement movement) {
        return movementService.updateMovement(movement);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Movement> deleteMovement(@PathVariable("id") Long id) {
        try {
            movementService.deleteMovement(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }    

}
