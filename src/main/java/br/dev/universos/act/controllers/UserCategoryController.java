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

import br.dev.universos.act.models.UserCategory;
import br.dev.universos.act.services.UserCategoryService;

@RestController
@RequestMapping("user-category")
public class UserCategoryController {
    
    @Autowired
    UserCategoryService userCategoryService;

    @PostMapping
    public UserCategory createUserCategory(@RequestBody UserCategory userCategory) {
        return userCategoryService.saveUserCategory(userCategory);
    }

    @GetMapping
    public List<UserCategory> listUserCategory() {
        return userCategoryService.findAllUserCategory();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserCategory> getUserCategory(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(userCategoryService.findUserCategoryById(id).orElseThrow(() -> new Exception("Categoria não encontrada")));
    }

    @PutMapping
    public UserCategory updateUserCategory(@RequestBody UserCategory userCategory) {
        return userCategoryService.updateUserCategory(userCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<UserCategory> deleteUserCategory(@PathVariable("id") Long id) {
        try {
            userCategoryService.deleteUserCategory(id);
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    }

}
