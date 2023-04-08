package com.codingdojo.dojosAndNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosAndNinjas.models.Dojo;
import com.codingdojo.dojosAndNinjas.repositories.DojoRepo;

@Service
public class DojoServ {
    @Autowired
    private DojoRepo dojoRepo;

// ==========================
//        CRUD METHODS
// ==========================
    // create
    public Dojo createOne(Dojo i) {
        return dojoRepo.save(i);
    }
    // read all 
    public List<Dojo> getAll() {
        return dojoRepo.findAll();
    }
    // read one
    public Dojo getOne(Long id) {
        return dojoRepo.findById(id).orElse(null);
    }
    // update
    public Dojo updateOne(Dojo i) {
        return dojoRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
        dojoRepo.deleteById(id);
    }

}
