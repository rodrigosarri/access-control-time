package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.WorkingDay;
import br.dev.universos.act.repositories.WorkingDayRepository;

@Service
public class WorkingDayService {
    
    @Autowired
    WorkingDayRepository workingDayRepository;

    public WorkingDay saveWorkingDay(WorkingDay WorkingDay) {
        return workingDayRepository.save(WorkingDay);
    }

    public List<WorkingDay> findAllWorkingDay() {
        return workingDayRepository.findAll();
    }

    public Optional<WorkingDay> findWorkingDayById(Long id) {
        return workingDayRepository.findById(id);
    }

    public WorkingDay updateWorkingDay(WorkingDay WorkingDay) {
        return workingDayRepository.save(WorkingDay);
    }

    public void deleteWorkingDay(Long id) {
        workingDayRepository.deleteById(id);
    }    

}
