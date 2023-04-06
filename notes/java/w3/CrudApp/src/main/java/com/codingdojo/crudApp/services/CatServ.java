package com.codingdojo.crudApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.crudApp.models.Category;
import com.codingdojo.crudApp.repositories.CatRepo;

@Service
public class CatServ {
    @Autowired
    private CatRepo catRepo;

// ==========================
//        CRUD METHODS
// ==========================
    // create
    public Category createOne(Category i) {
        return catRepo.save(i);
    }
    // read all 
    public List<Category> getAll() {
        return catRepo.findAll();
    }
    // read one
    public Category getOne(Long id) {
        return catRepo.findById(id).orElse(null);
    }
    // update
    public Category updateOne(Category i) {
        return catRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
        catRepo.deleteById(id);
    }

}
