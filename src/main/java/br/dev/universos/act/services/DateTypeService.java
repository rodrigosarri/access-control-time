package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.DateType;
import br.dev.universos.act.repositories.DateTypeRepository;

@Service
public class DateTypeService {
    
    @Autowired
    DateTypeRepository dateTypeRepository;

    public DateType saveDateType(DateType userCategory) {
        return dateTypeRepository.save(userCategory);
    }

    public List<DateType> findAllDateType() {
        return dateTypeRepository.findAll();
    }

    public Optional<DateType> findDateTypeById(Long id) {
        return dateTypeRepository.findById(id);
    }

    public DateType updateDateType(DateType userCategory) {
        return dateTypeRepository.save(userCategory);
    }

    public void deleteDateType(Long id) {
        dateTypeRepository.deleteById(id);
    } 

}
