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

import br.dev.universos.act.models.DateType;
import br.dev.universos.act.services.DateTypeService;

@RestController
@RequestMapping("date-type")
public class DateTypeController {
    
    @Autowired
    DateTypeService dateTypeService;

    @PostMapping
    public DateType createDateType(@RequestBody DateType dateType) {
        return dateTypeService.saveDateType(dateType);
    }

    @GetMapping
    public List<DateType> listDateType() {
        return dateTypeService.findAllDateType();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DateType> getDateType(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(dateTypeService.findDateTypeById(id).orElseThrow(() -> new Exception("Tipo de data não encontrada")));
    }

    @PutMapping
    public DateType updateDateType(@RequestBody DateType dateType) {
        return dateTypeService.updateDateType(dateType);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DateType> deleteDateType(@PathVariable("id") Long id) {
        try {
            dateTypeService.deleteDateType(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }    

}
