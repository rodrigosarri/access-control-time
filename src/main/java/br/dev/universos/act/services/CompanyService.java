package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.Company;
import br.dev.universos.act.repositories.CompanyRepository;

@Service
public class CompanyService {
    
    @Autowired
    CompanyRepository companyRepository;

    public Company saveCompany(Company company) {
        return companyRepository.save(company);
    }

    public List<Company> findAllCompany() {
        return companyRepository.findAll();
    }

    public Optional<Company> findCompanyById(Long id) {
        return companyRepository.findById(id);
    }

    public Company updateCompany(Company company) {
        return companyRepository.save(company);
    }

    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    } 

}
