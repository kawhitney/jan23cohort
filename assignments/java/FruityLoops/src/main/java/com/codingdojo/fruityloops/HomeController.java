package com.codingdojo.fruityloops;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		return "index.jsp"
	}
}
