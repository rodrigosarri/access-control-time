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

import br.dev.universos.act.models.Users;
import br.dev.universos.act.services.UsersService;

@RestController
@RequestMapping("users")
public class UsersController {
    
    @Autowired
    UsersService usersService;

    @PostMapping
    public Users createUsers(@RequestBody Users users) {
        return usersService.saveUsers(users);
    }

    @GetMapping
    public List<Users> listUsers() {
        return usersService.findAllUsers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUsers(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(usersService.findUsersById(id).orElseThrow(() -> new Exception("Jornada não encontrada")));
    }

    @PutMapping
    public Users updateUsers(@RequestBody Users users) {
        return usersService.updateUsers(users);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Users> deleteUsers(@PathVariable("id") Long id) {
        try {
            usersService.deleteUsers(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
