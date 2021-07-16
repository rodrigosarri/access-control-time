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

import br.dev.universos.act.models.Calendar;
import br.dev.universos.act.services.CalendarService;

@RestController
@RequestMapping("calendar")
public class CalendarController {
    
    @Autowired
    CalendarService calendarService;

    @PostMapping
    public Calendar createCalendar(@RequestBody Calendar calendar) {
        return calendarService.saveCalendar(calendar);
    }

    @GetMapping
    public List<Calendar> listCalendar() {
        return calendarService.findAllCalendar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Calendar> getCalendar(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(calendarService.findCalendarById(id).orElseThrow(() -> new Exception("Data não encontrada")));
    }

    @PutMapping
    public Calendar updateCalendar(@RequestBody Calendar calendar) {
        return calendarService.updateCalendar(calendar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Calendar> deleteCalendar(@PathVariable("id") Long id) {
        try {
            calendarService.deleteCalendar(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }     

}
