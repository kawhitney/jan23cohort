package com.codingdojo.crudApp.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.crudApp.models.Category;

@Repository
public interface CatRepo extends CrudRepository<Category, Long> {
//	Model gets imported here	
    List<Category> findAll();

//	No need to add .save here because CrudRepository already has it	
//	Repo gets "exported" to model Service

}
