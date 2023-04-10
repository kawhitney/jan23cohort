package com.codingdojo.loginReg.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.loginReg.models.Book;
import com.codingdojo.loginReg.repositories.BookRepo;

@Service
public class BookServ {
    @Autowired
    private BookRepo bookRepo;

// ==========================
//        CRUD METHODS
// ==========================
    // create
    public Book createOne(Book i) {
        return bookRepo.save(i);
    }
    // read all 
    public List<Book> getAll() {
        return bookRepo.findAll();
    }
    // read one
    public Book getOne(Long id) {
        return bookRepo.findById(id).orElse(null);
    }
    // update
    public Book updateOne(Book i) {
        return bookRepo.save(i);
    }
    // delete
    public void deleteOne(Long id) {
        bookRepo.deleteById(id);
    }

}
