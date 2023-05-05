package com.example.laptopDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopDemo {
	@GetMapping("/signin")
	public String signin() {
		return "Sign in was successful";
	}
}
