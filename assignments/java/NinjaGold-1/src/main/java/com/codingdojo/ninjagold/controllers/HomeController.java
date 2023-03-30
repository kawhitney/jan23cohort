package com.codingdojo.ninjagold.controllers;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}		
		return "index.jsp";
	}
	
	@PostMapping("gold/{place}")
	public String gold(@PathVariable String place, HttpSession session, Model model) {
		int count = (int)session.getAttribute("count");
		Random rand = new Random();
		switch(place) {
			case "farm":
				break;
			case "cave":
				break;
			case "house":
				break;
			case "quest":
				break;
			default:
				break;
		}
		return "redirect:/";
	}
}
