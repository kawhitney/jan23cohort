package com.codingdojo.wosmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.wosmart.models.Burger;
import com.codingdojo.wosmart.repositories.BurgerRepo;

@Service
public class BurgerServ {
    @Autowired
    private BurgerRepo burgerRepo;

// ==========================
//        CRUD METHODS
// ==========================
    // create
    public Burger createBurger(Burger i) {
        return burgerRepo.save(i);
    }
    // read all 
    public List<Burger> allBurgers() {
        return burgerRepo.findAll();
    }
    // read one
    public Burger getOne(Long id) {
        return burgerRepo.findById(id).orElse(null);
    }
    // update
    public Burger updateBurger(Burger i) {
        return burgerRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
    	burgerRepo.deleteById(id);
    }

}
