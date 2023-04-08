package com.codingdojo.dojosAndNinjas.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.dojosAndNinjas.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
//	Model gets imported here	
    List<Ninja> findAll();

//	No need to add .save here because CrudRepository already has it	
//	Repo gets "exported" to model Service

}
