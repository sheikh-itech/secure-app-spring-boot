package com.module.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	
	@GetMapping("/index")
	public String greet() {
		
		return "index";
	}
	
	@GetMapping("/login")
	public String login() {
		
		return "login";
	}
	
	@GetMapping("/logout")
	public String logOut() {
		
		return "logout";
	}
	
	@GetMapping("/home")
	public String home() {
		
		return "home";
	}
	
	@GetMapping("/error")
	public String error() {
		
		return "error";
	}
}
