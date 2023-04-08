package com.codingdojo.loginReg.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.codingdojo.loginReg.services.UserServ;

@Controller
public class HomeController {
    @Autowired
    private UserServ userServ;
    
    @GetMapping("/") // reserve route
    public String index(HttpSession session, Model model) {
    	if(session.getAttribute("userID") == null) {
            return "redirect:/logReg"; // map route to jsp            
    	}
    	
    	model.addAttribute("user", userServ.getOne((Long)session.getAttribute("userID")));
    	return "index.jsp";
    }
}
