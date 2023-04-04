package com.codingdojo.wosmart.controllers;

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

import com.codingdojo.wosmart.models.Item;
import com.codingdojo.wosmart.services.ItemServ;

@Controller
public class HomeController {
	@Autowired
	private ItemServ itemServ;
	
	// Main landing page
    @GetMapping("/") // reserve route
    public String index(@ModelAttribute("item") Item item, Model model) {
    	
    	model.addAttribute("allItems", itemServ.allItems());
    	
        return "index.jsp"; // map route to jsp
    }
    
    // add item
    @GetMapping("/addItem") // reserve route
    public String addItem(@ModelAttribute("itemForm") Item item) {    	
        return "addItem.jsp"; // map route to jsp
    }
    @PostMapping("/createItem")
    public String createItem(@Valid @ModelAttribute("itemForm") Item newItem, BindingResult result, Model model) {
    	if(result.hasErrors()) {
    		return "addItem.jsp";
    	}
    	else {
    		itemServ.createItem(newItem);
    		return "redirect:/";
    	}
    }
    
    // update item
    @GetMapping("/item/{id}/edit") // reserve route
    public String editItem(@PathVariable("id") Long id, @ModelAttribute("itemForm") Item item, Model model) { 
    	model.addAttribute("item", itemServ.getOne(id));
        return "editItem.jsp"; // map route to jsp
    }
    @PutMapping("/item/{id}/update")
    public String updateItem(@PathVariable("id") Long id, @Valid @ModelAttribute("itemForm") Item item, BindingResult result, Model model) {    	
    	if(result.hasErrors()) {
    		return "editItem.jsp";
    	}
    	else {
    		itemServ.updateItem(item);
    		return "redirect:/";
    	}
    }
    
    // view single item
    
    // delete single item
    @DeleteMapping("/item/{id}/delete")
    public String destroy(@PathVariable("id") Long id) {
    	itemServ.deleteOne(id);
    	return "redirect:/";
    }
    
}