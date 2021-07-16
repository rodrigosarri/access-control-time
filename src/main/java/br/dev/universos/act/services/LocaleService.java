package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.Locale;
import br.dev.universos.act.repositories.LocaleRepository;

@Service
public class LocaleService {
    
    @Autowired
    LocaleRepository localeRepository;

    public Locale saveLocale(Locale locale) {
        return localeRepository.save(locale);
    }

    public List<Locale> findAllLocale() {
        return localeRepository.findAll();
    }

    public Optional<Locale> findLocaleById(Long id) {
        return localeRepository.findById(id);
    }

    public Locale updateLocale(Locale locale) {
        return localeRepository.save(locale);
    }

    public void deleteLocale(Long id) {
        localeRepository.deleteById(id);
    } 

}
