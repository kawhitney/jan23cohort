package com.codingdojo.saveTravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.saveTravels.models.Expense;
import com.codingdojo.saveTravels.repositories.ExpenseRepo;

@Service
public class ExpenseServ {
	@Autowired
	private ExpenseRepo expenseRepo;

// ==========================
//        CRUD METHODS
// ==========================
	// create
	public Expense createOne(Expense i) {
		return expenseRepo.save(i);
	}

	// read all
	public List<Expense> getAll() {
		return expenseRepo.findAll();
	}

	// read one
	public Expense getOne(Long id) {
		return expenseRepo.findById(id).orElse(null);
	}

	// update
	public Expense updateOne(Expense i) {
		return expenseRepo.save(i);
	}

	// delete
	public void deleteOne(Long id) {
		expenseRepo.deleteById(id);
	}

}
