package com.codingdojo.demo.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class DemoController {
	@RequestMapping("/")
	public String demo(HttpSession session) {
		session.setAttribute("name", "WOS Mart");
		return "demo.jsp";
	}
	
	// route
	@PostMapping("/updateSession")
	public String updateSession(@RequestParam String NAME, @RequestParam String petName, Model model, HttpSession session, RedirectAttributes redirectAttributes) {
		session.setAttribute("name", NAME);
		session.setAttribute("petName", petName);
		redirectAttributes.addFlashAttribute("session", "Sessjion has been updated");
		return "redirect:/results";
	}
	// results shown
	@RequestMapping("/results")
	public String results() {
		return "results.jsp";
	}
	
	// clear session
	@RequestMapping("/logout")
	public String logout(HttpSession session, RedirectAttributes redirectAttributes) {
		session.invalidate();
		redirectAttributes.addFlashAttribute("session", "Session has been updated");
		return "redirect:/";
	}
}
