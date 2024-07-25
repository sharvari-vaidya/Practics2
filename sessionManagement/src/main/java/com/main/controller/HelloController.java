package com.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
public class HelloController {

	@GetMapping("/home")
	public String home() {
		return "Welcome! This is the home page.";
	}

	@GetMapping("/session")
	public String sessionInfo(HttpSession session) {
		return "Session ID: " + session.getId();
	}

	@GetMapping("/login")
	public String loginPage() {
		return "login"; 
	}

}
