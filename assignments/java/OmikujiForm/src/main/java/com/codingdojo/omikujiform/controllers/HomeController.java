package com.codingdojo.omikujiform.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@GetMapping("/omikuji")
	public String omikuji() {
		return "omikuji.jsp";
	}
	// number 5-25, string city, string name, string profession/hobby, string
	@GetMapping("/omikuji/show")
    public String show(Model model) { //, @ModelAttribute("image") <MODEL_NAME> image

        return "show.jsp";
    }
}