package com.codingdojo.saveTravels.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.saveTravels.models.Expense;
import com.codingdojo.saveTravels.services.ExpenseServ;

@Controller
public class HomeController {
	//private final ImageServ imageServ;
	
	//public ImageController(ImageServ imageServ){
	//	this.imageServ = imageServ;
	//}
	
	@Autowired
	private ExpenseServ expenseServ;

	@GetMapping("/") // reserve route
	public String index(@ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("allExpenses", expenseServ.getAll());
		return "index.jsp"; // map route to jsp
	}

	// create
	@PostMapping("/createExpense")
	public String createExpense(@Valid @ModelAttribute("expenseForm") Expense expense, BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			model.addAttribute("allExpenses", expenseServ.getAll());
			return "index.jsp";
		} else {
			expenseServ.createOne(expense);
			return "redirect:/";
		}
	}

	// edit
	@GetMapping("/expense/{id}/edit")
	public String edit(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		// get attribute from server
		// add attribute to model
		model.addAttribute("expense", expenseServ.getOne(id));

		return "edit.jsp";
	}
	@PutMapping("/expense/{id}/update")
	public String update(@PathVariable("id") Long id, @Valid @ModelAttribute("expense") Expense expense, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("expense", expenseServ.getOne(id));
    		return "edit.jsp";
    	}
    	else {
    		expenseServ.updateOne(expense);
    		return "redirect:/";
    	}
		
	}
	
	// read one
	@GetMapping("/expense/{id}/view")
	public String view(@PathVariable("id") Long id, @ModelAttribute("expense") Expense expense, Model model) {
		model.addAttribute("expense", expenseServ.getOne(id));
		return "viewExpense.jsp";
	}
	
	// delete
	@DeleteMapping("/expense/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
    	expenseServ.deleteOne(id);
    	return "redirect:/";
    }
}

