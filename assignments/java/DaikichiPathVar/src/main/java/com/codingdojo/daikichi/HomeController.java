package com.codingdojo.daikichi;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index(Model moel, HttpSession session) {
		session.setAttribute("phrase", "");
		return "index.jsp";
	}
	
	// congrats with city name
	@RequestMapping("daikichi/travel/{city}")
	public String travel(@PathVariable String city, Model model, HttpSession session) {
		session.setAttribute("phrase", String.format("Congratulations! You will soon travel to %s", city));
		return "index.jsp";
	}
	
	// journey in the near future
	@RequestMapping("daikichi/lotto/{num}")
	public String journey(@PathVariable int num, Model model, HttpSession session) {
		if(num % 2 == 0) {
			session.setAttribute("phrase", "Your will take a grand journey in the near future, but be warty of tempting offers.");
		}
		else {
			session.setAttribute("phrase", "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends.");
		}
		return "index.jsp";
	}
	
}

