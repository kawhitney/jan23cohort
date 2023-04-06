package com.codingdojo.saveTravels.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.saveTravels.models.Expense;

@Repository
public interface ExpenseRepo extends CrudRepository<Expense, Long> {
//	Model gets imported here	
	List<Expense> findAll();

//	No need to add .save here because CrudRepository already has it	
//	Repo gets "exported" to model Service

}
