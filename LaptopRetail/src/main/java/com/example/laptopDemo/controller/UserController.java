package com.example.laptopDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptopDemo.model.UserDetails;
import com.example.laptopDemo.service.UserService;


@RestController
public class UserController {
	


	    @Autowired
		UserService userServ;
	    
	    @GetMapping("/checklogin")
	    public String login(@RequestParam String user,@RequestParam String password)
	    {
	    	return userServ.login(user, password);
	    }
	    
	    @PostMapping("/register")
	    public UserDetails register(@RequestBody UserDetails user) {
	    	return userServ.register(user);
	    }
}


