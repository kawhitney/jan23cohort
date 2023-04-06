package com.codingdojo.fullStack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.fullStack.models.Puppy;
import com.codingdojo.fullStack.repositories.PuppyRepo;


@Service
public class PuppyServ {
    @Autowired
    private PuppyRepo puppyRepo;

// ==========================
//        CRUD METHODS
// ==========================
    // create
    public Puppy createOne(Puppy i) {
        return puppyRepo.save(i);
    }
    // read all 
    public List<Puppy> getAll() {
        return puppyRepo.findAll();
    }
    // read one
    public Puppy getOne(Long id) {
        return puppyRepo.findById(id).orElse(null);
    }
    // update
    public Puppy updateOne(Puppy i) {
        return puppyRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
        puppyRepo.deleteById(id);
    }

}
