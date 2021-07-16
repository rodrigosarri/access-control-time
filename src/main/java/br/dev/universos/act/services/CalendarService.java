package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.Calendar;
import br.dev.universos.act.repositories.CalendarRepository;

@Service
public class CalendarService {
    
    @Autowired
    CalendarRepository calendarRepository;

    public Calendar saveCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    public List<Calendar> findAllCalendar() {
        return calendarRepository.findAll();
    }

    public Optional<Calendar> findCalendarById(Long id) {
        return calendarRepository.findById(id);
    }

    public Calendar updateCalendar(Calendar calendar) {
        return calendarRepository.save(calendar);
    }

    public void deleteCalendar(Long id) {
        calendarRepository.deleteById(id);
    } 

}
