package com.codingdojo.wosmart.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.wosmart.models.Item;
import com.codingdojo.wosmart.repositories.ItemRepo;

@Service
public class ItemServ {
    @Autowired
    private ItemRepo itemRepo;

// ==========================
//       CRUD METHODS
// ==========================
    // create
    public Item createItem(Item i) {
        return itemRepo.save(i);
    }
    // read all 
    public List<Item> allItems() {
        return itemRepo.findAll();
    }
    // read one
    public Item getOne(Long id) {
    	return itemRepo.findById(id).orElse(null);
    }
    // update
    public Item updateItem(Item i) {
        return itemRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
    	itemRepo.deleteById(id);
    }

}
