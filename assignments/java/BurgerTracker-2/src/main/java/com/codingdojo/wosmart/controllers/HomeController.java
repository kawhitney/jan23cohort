package com.codingdojo.wosmart.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.codingdojo.wosmart.models.Burger;
import com.codingdojo.wosmart.services.BurgerServ;

@Controller
public class HomeController {
    @Autowired
    private BurgerServ burgerServ;
    
    @GetMapping("/") // reserve route
    public String index(@ModelAttribute("burger") Burger burger, Model model) {
    	model.addAttribute("allBurgers", burgerServ.allBurgers());
        return "index.jsp"; // map route to jsp
    }
    
    // create
    @PostMapping("/createBurger")
	public String createBurger(@Valid @ModelAttribute("burgerForm") Burger burger, BindingResult result, Model model) {		
        if (result.hasErrors()) { 
        	model.addAttribute("allBurgers", burgerServ.allBurgers());
            return "index.jsp";
        } 
        else {
        	burgerServ.createBurger(burger);
            return "redirect:/";
        }
	}
    
    // read all
    
    // read one
    
    // update
    @GetMapping("/burger/{id}/edit") // reserve route
    public String index(@PathVariable("id") Long id, @ModelAttribute("burger") Burger burger, Model model) {
    	model.addAttribute("burger", burgerServ.getOne(id));
    	return "editBurger.jsp";
        
    }
    @PutMapping("/burger/{id}/update")
    public String updateItem(@PathVariable("id") Long id, @Valid @ModelAttribute("burgerForm") Burger burger, BindingResult result, Model model) {    	
    	if(result.hasErrors()) {
    		model.addAttribute("burger", burgerServ.getOne(id));
    		return "editBurger.jsp";
    	}
    	else {
    		burgerServ.updateBurger(burger);
    		return "redirect:/";
    	}
    }
    
    // delete
}
