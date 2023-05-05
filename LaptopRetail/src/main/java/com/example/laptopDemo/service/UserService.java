package com.example.laptopDemo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.laptopDemo.dao.UserRepository;
import com.example.laptopDemo.model.UserDetails;

@Service
public class UserService {
	@Autowired
	UserRepository userRepo;

	public String login(String user,String pass) {
		List<UserDetails> li = userRepo.findAll();
		String res = null;
		for(UserDetails l : li) {
			if(l.getUsername().equals(user)&&l.getPassword().equals(pass)) {
				res = "Login sucessfull";
			}
		}
		if(res==null) {
			res= "Login failed";
		}
		return res;
	}
	
	public UserDetails register(UserDetails user) {
		return userRepo.save(user);
	}
}
