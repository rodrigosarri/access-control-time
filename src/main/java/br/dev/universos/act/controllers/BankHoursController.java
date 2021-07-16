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

import br.dev.universos.act.models.BankHours;
import br.dev.universos.act.services.BankHoursService;

@RestController
@RequestMapping("bank-hours")
public class BankHoursController {
    
    @Autowired
    BankHoursService bankHoursService;

    @PostMapping
    public BankHours createBankHours(@RequestBody BankHours bankHours) {
        return bankHoursService.saveBankHours(bankHours);
    }

    @GetMapping
    public List<BankHours> listBankHours() {
        return bankHoursService.findAllBankHours();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BankHours> getBankHours(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(bankHoursService.findBankHoursById(id).orElseThrow(() -> new Exception("Banco de horas não encontrado")));
    }

    @PutMapping
    public BankHours updateBankHours(@RequestBody BankHours bankHours) {
        return bankHoursService.updateBankHours(bankHours);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BankHours> deleteBankHours(@PathVariable("id") Long id) {
        try {
            bankHoursService.deleteBankHours(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    } 

}
