package com.codingdojo.loginReg.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/") // reserve route
    public String index(HttpSession session, Model model) {
    	if(session.getAttribute("userID") == null) {
    		return "redirect:/logReg";
    	}
        return "redirect:/books"; // map route to jsp
    }
}
