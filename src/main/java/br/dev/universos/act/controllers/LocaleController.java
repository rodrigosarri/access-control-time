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

import br.dev.universos.act.models.Locale;
import br.dev.universos.act.services.LocaleService;

@RestController
@RequestMapping("locale")
public class LocaleController {
    
    @Autowired
    LocaleService localeService;

    @PostMapping
    public Locale createLocale(@RequestBody Locale locale) {
        return localeService.saveLocale(locale);
    }

    @GetMapping
    public List<Locale> listLocale() {
        return localeService.findAllLocale();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Locale> getLocale(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(localeService.findLocaleById(id).orElseThrow(() -> new Exception("Localidade não encontrada")));
    }

    @PutMapping
    public Locale updateLocale(@RequestBody Locale locale) {
        return localeService.updateLocale(locale);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Locale> deleteLocale(@PathVariable("id") Long id) {
        try {
            localeService.deleteLocale(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    } 

}
