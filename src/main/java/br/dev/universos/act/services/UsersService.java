package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.Users;
import br.dev.universos.act.repositories.UsersRepository;

@Service
public class UsersService {
    
    @Autowired
    UsersRepository usersRepository;

    public Users saveUsers(Users users) {
        return usersRepository.save(users);
    }

    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> findUsersById(Long id) {
        return usersRepository.findById(id);
    }

    public Users updateUsers(Users users) {
        return usersRepository.save(users);
    }

    public void deleteUsers(Long id) {
        usersRepository.deleteById(id);
    } 

}
