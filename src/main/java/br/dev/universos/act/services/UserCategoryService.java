package br.dev.universos.act.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dev.universos.act.models.UserCategory;
import br.dev.universos.act.repositories.UserCategoryRepository;

@Service
public class UserCategoryService {

    @Autowired
    UserCategoryRepository userCategoryRepository;

    public UserCategory saveUserCategory(UserCategory userCategory) {
        return userCategoryRepository.save(userCategory);
    }

    public List<UserCategory> findAllUserCategory() {
        return userCategoryRepository.findAll();
    }

    public Optional<UserCategory> findUserCategoryById(Long id) {
        return userCategoryRepository.findById(id);
    }

    public UserCategory updateUserCategory(UserCategory userCategory) {
        return userCategoryRepository.save(userCategory);
    }

    public void deleteUserCategory(Long id) {
        userCategoryRepository.deleteById(id);
    }

}
