package com.codingdojo.fullStack.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.fullStack.models.Puppy;

@Repository
public interface PuppyRepo extends CrudRepository<Puppy, Long> {
//	Model gets imported here	
    List<Puppy> findAll();

//	No need to add .save here because CrudRepository already has it	
//	Repo gets "exported" to model Service

}
