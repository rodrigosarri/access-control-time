package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.BankHours;
import br.dev.universos.act.repositories.BankHoursRepository;

@Service
public class BankHoursService {
    
    @Autowired
    BankHoursRepository bankHoursRepository;

    public BankHours saveBankHours(BankHours bankHours) {
        return bankHoursRepository.save(bankHours);
    }

    public List<BankHours> findAllBankHours() {
        return bankHoursRepository.findAll();
    }

    public Optional<BankHours> findBankHoursById(Long id) {
        return bankHoursRepository.findById(id);
    }

    public BankHours updateBankHours(BankHours bankHours) {
        return bankHoursRepository.save(bankHours);
    }

    public void deleteBankHours(Long id) {
        bankHoursRepository.deleteById(id);
    }

}
