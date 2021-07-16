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

import br.dev.universos.act.models.Company;
import br.dev.universos.act.services.CompanyService;

@RestController
@RequestMapping("company")
public class CompanyController {
    
    @Autowired
    CompanyService companyService;

    @PostMapping
    public Company createCompany(@RequestBody Company company) {
        return companyService.saveCompany(company);
    }

    @GetMapping
    public List<Company> listCompany() {
        return companyService.findAllCompany();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompany(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(companyService.findCompanyById(id).orElseThrow(() -> new Exception("Empresa não encontrada")));
    }

    @PutMapping
    public Company updateCompany(@RequestBody Company company) {
        return companyService.updateCompany(company);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Company> deleteCompany(@PathVariable("id") Long id) {
        try {
            companyService.deleteCompany(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }    

}
