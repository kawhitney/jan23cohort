package com.codingdojo.dojosAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosAndNinjas.models.Dojo;
import com.codingdojo.dojosAndNinjas.services.DojoServ;
import com.codingdojo.dojosAndNinjas.services.NinjaServ;

@Controller
public class DojoController {
    @Autowired
    private DojoServ dojoServ;
    
    @Autowired
    private NinjaServ ninjaServ;
    
    // VIEW ALL
    @GetMapping("/dojos") // reserve route
    public String dojos(Model model) {
    	model.addAttribute("allDojos", dojoServ.getAll());
    	model.addAttribute("allNinjas", ninjaServ.getAll());
        return "viewDojos.jsp"; // map route to jsp
    }
    
    // CREATE NEW 
    @GetMapping("/dojos/new")
    public String newDojo() {
        return "addDojo.jsp";
    }
    @PostMapping("/dojos/new")
	public String newDojo(@Valid @ModelAttribute("burgerForm") Dojo dojo, BindingResult result, Model model) {		
        if (result.hasErrors()) { 
            return "addDojo.jsp";
        } 
        else {
        	dojoServ.createOne(dojo);
            return "redirect:/";
        }
	}
}
