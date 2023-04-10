package com.codingdojo.loginReg.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.loginReg.models.Book;

@Repository
public interface BookRepo extends CrudRepository<Book, Long> {
//	Model gets imported here	
    List<Book> findAll();

//	No need to add .save here because CrudRepository already has it	
//	Repo gets "exported" to model Service

}
