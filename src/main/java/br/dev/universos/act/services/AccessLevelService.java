package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.AccessLevel;
import br.dev.universos.act.repositories.AccessLevelRepository;

@Service
public class AccessLevelService {
    
    @Autowired
    AccessLevelRepository accessLevelRepository;

    public AccessLevel saveAccessLevel(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }

    public List<AccessLevel> findAllAccessLevel() {
        return accessLevelRepository.findAll();
    }

    public Optional<AccessLevel> findAccessLevelById(Long id) {
        return accessLevelRepository.findById(id);
    }

    public AccessLevel updateAccessLevel(AccessLevel accessLevel) {
        return accessLevelRepository.save(accessLevel);
    }

    public void deleteAccessLevel(Long id) {
        accessLevelRepository.deleteById(id);
    } 

}
