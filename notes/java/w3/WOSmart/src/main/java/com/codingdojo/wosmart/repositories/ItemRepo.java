package com.codingdojo.wosmart.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.wosmart.models.Item;

@Repository
public interface ItemRepo extends CrudRepository<Item, Long> {
//	Model gets imported here	
    List<Item> findAll();

//	No need to add .save here because CrudRepository already has it	
//	Repo gets "exported" to model Service

}
