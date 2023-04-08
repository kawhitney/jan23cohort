package com.codingdojo.dojosAndNinjas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.dojosAndNinjas.services.DojoServ;

@Controller
public class HomeController {
    @Autowired
    private DojoServ dojoServ;
    
    @GetMapping("/") // reserve route
    public String index(Model model) {
    	model.addAttribute("allDojos", dojoServ.getAll());
        return "redirect:/dojos"; // map route to jsp
    }
}
