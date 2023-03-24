package com.codingdojo.com.controllerintro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/") // HAVE TO USE SLASH!!!! why? no one knows....
public class HomeController {
	@RequestMapping("") 
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/hey")
	public String hey() {
		return "Hey World!";
	}
}