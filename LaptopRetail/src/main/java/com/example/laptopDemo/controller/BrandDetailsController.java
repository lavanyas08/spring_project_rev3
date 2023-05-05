package com.example.laptopDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptopDemo.model.BrandDetails;
import com.example.laptopDemo.service.BrandDetailsService;

@RestController
public class BrandDetailsController {

	

		@Autowired
		BrandDetailsService bservice;
		
		@PostMapping("/postDetails")
		public  BrandDetails postDetails(@RequestBody BrandDetails p)
		{
			return bservice.postDetails(p);
		}
		@GetMapping("/getDetails")
		public List<BrandDetails>fetchAllDetails()
		{
			return bservice.fetchAllDetails();
		}
}
