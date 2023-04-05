package com.codingdojo.wosmart.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.wosmart.models.Burger;

@Repository
public interface BurgerRepo extends CrudRepository<Burger, Long> {
//	Model gets imported here	
    List<Burger> findAll();

//	No need to add .save here because CrudRepository already has it	
//	Repo gets "exported" to model Service
}
