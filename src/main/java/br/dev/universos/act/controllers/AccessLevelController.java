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

import br.dev.universos.act.models.AccessLevel;
import br.dev.universos.act.services.AccessLevelService;

@RestController
@RequestMapping("access-level")
public class AccessLevelController {
    
    @Autowired
    AccessLevelService accessLevelService;

    @PostMapping
    public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel) {
        return accessLevelService.saveAccessLevel(accessLevel);
    }

    @GetMapping
    public List<AccessLevel> listAccessLevel() {
        return accessLevelService.findAllAccessLevel();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AccessLevel> getAccessLevel(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(accessLevelService.findAccessLevelById(id).orElseThrow(() -> new Exception("Nível de acesso não encontrado")));
    }

    @PutMapping
    public AccessLevel updateAccessLevel(@RequestBody AccessLevel accessLevel) {
        return accessLevelService.updateAccessLevel(accessLevel);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AccessLevel> deleteAccessLevel(@PathVariable("id") Long id) {
        try {
            accessLevelService.deleteAccessLevel(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }     

}
