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

import br.dev.universos.act.models.WorkingDay;
import br.dev.universos.act.services.WorkingDayService;

@RestController
@RequestMapping("working-day")
public class WorkingDayController {
    
    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.saveWorkingDay(workingDay);
    }

    @GetMapping
    public List<WorkingDay> listWorkingDay() {
        return workingDayService.findAllWorkingDay();
    }

    @GetMapping("/{id}")
    public ResponseEntity<WorkingDay> getWorkingDay(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(workingDayService.findWorkingDayById(id).orElseThrow(() -> new Exception("Jornada não encontrada")));
    }

    @PutMapping
    public WorkingDay updateWorkingDay(@RequestBody WorkingDay workingDay) {
        return workingDayService.updateWorkingDay(workingDay);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<WorkingDay> deleteWorkingDay(@PathVariable("id") Long id) {
        try {
            workingDayService.deleteWorkingDay(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
