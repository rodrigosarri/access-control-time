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

import br.dev.universos.act.models.Occurrence;
import br.dev.universos.act.services.OccurrenceService;

@RestController
@RequestMapping("occurrence")
public class OccurrenceController {
    
    @Autowired
    OccurrenceService occurrenceService;

    @PostMapping
    public Occurrence createOccurrence(@RequestBody Occurrence occurrence) {
        return occurrenceService.saveOccurrence(occurrence);
    }

    @GetMapping
    public List<Occurrence> listOccurrence() {
        return occurrenceService.findAllOccurrence();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Occurrence> getOccurrence(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(occurrenceService.findOccurrenceById(id).orElseThrow(() -> new Exception("Ocorrência não encontrada")));
    }

    @PutMapping
    public Occurrence updateOccurrence(@RequestBody Occurrence occurrence) {
        return occurrenceService.updateOccurrence(occurrence);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Occurrence> deleteOccurrence(@PathVariable("id") Long id) {
        try {
            occurrenceService.deleteOccurrence(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
