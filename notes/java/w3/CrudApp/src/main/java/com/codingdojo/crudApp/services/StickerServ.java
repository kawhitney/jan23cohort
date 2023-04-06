package com.codingdojo.crudApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.crudApp.models.Sticker;
import com.codingdojo.crudApp.repositories.StickerRepo;

@Service
public class StickerServ {
    @Autowired
    private StickerRepo stickerRepo;

// ==========================
//        CRUD METHODS
// ==========================
    // create
    public Sticker createOne(Sticker i) {
        return stickerRepo.save(i);
    }
    // read all 
    public List<Sticker> getAll() {
        return stickerRepo.findAll();
    }
    // read one
    public Sticker getOne(Long id) {
        return stickerRepo.findById(id).orElse(null);
    }
    // update
    public Sticker updateOne(Sticker i) {
        return stickerRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
        stickerRepo.deleteById(id);
    }

}
