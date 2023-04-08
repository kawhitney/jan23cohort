package com.codingdojo.dojosAndNinjas.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojosAndNinjas.models.Ninja;
import com.codingdojo.dojosAndNinjas.services.DojoServ;
import com.codingdojo.dojosAndNinjas.services.NinjaServ;

@Controller
public class NinjaController {
    @Autowired
    private NinjaServ ninjaServ;
    
    @Autowired
    private DojoServ dojoServ;
    
    // VIEW ALL
    @GetMapping("/ninjas/{dojo_id}") // reserve route
    public String ninjas(@PathVariable("dojo_id") Long id, Model model) {
    	model.addAttribute("dojoID", id);
    	model.addAttribute("allNinjas", ninjaServ.getAll());
        return "viewNinjas.jsp"; // map route to jsp
    }
    
    // CREATE NEW 
    @GetMapping("/ninjas/new")
    public String addNinja(Model model) {
    	model.addAttribute("allDojos", dojoServ.getAll());
        return "addNinja.jsp";
    }
    @PostMapping("/ninjas/new")
	public String addNinja(@Valid @ModelAttribute("modelForm") Ninja ninja, BindingResult result, Model model) {		
        if (result.hasErrors()) { 
        	model.addAttribute("allDojos", dojoServ.getAll());
            return "addNinja.jsp";
        } 
        else {
        	ninjaServ.createOne(ninja);
            return "redirect:/ninjas/" + ninja.getDojo().getId();
        }
	}
}
