package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.Occurrence;
import br.dev.universos.act.repositories.OccurrenceRepository;

@Service
public class OccurrenceService {

    @Autowired
    OccurrenceRepository occurrenceRepository;

    public Occurrence saveOccurrence(Occurrence userCategory) {
        return occurrenceRepository.save(userCategory);
    }

    public List<Occurrence> findAllOccurrence() {
        return occurrenceRepository.findAll();
    }

    public Optional<Occurrence> findOccurrenceById(Long id) {
        return occurrenceRepository.findById(id);
    }

    public Occurrence updateOccurrence(Occurrence userCategory) {
        return occurrenceRepository.save(userCategory);
    }

    public void deleteOccurrence(Long id) {
        occurrenceRepository.deleteById(id);
    }    
}
