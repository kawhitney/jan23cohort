package com.codingdojo.dojosAndNinjas.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.dojosAndNinjas.models.Ninja;
import com.codingdojo.dojosAndNinjas.repositories.NinjaRepo;

@Service
public class NinjaServ {
    @Autowired
    private NinjaRepo ninjaRepo;

// ==========================
//        CRUD METHODS
// ==========================
    // create
    public Ninja createOne(Ninja i) {
        return ninjaRepo.save(i);
    }
    // read all 
    public List<Ninja> getAll() {
        return ninjaRepo.findAll();
    }
    // read one
    public Ninja getOne(Long id) {
        return ninjaRepo.findById(id).orElse(null);
    }
    // update
    public Ninja updateOne(Ninja i) {
        return ninjaRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
        ninjaRepo.deleteById(id);
    }

}
