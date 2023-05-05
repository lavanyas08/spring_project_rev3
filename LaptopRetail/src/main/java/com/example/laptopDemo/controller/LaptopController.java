package com.example.laptopDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.laptopDemo.model.Laptop;
import com.example.laptopDemo.service.LaptopService;





@RestController
public class LaptopController {
@Autowired
	LaptopService lapService;
	@GetMapping(value="fetchDetails") 
	public List<Laptop> getAllDetails(){
	List<Laptop> lapList=lapService.getAllDetails();
		return lapList;
}
	@PostMapping(value="/saveDetails")
	public   Laptop saveDetails(@RequestBody Laptop s)
	{
		return lapService.saveLaptops(s);
	}
	@PutMapping(value="/updateDetails")
	public Laptop updateLaptop(@RequestBody Laptop s)
	{
		return lapService.saveLaptops(s);
	}
	@DeleteMapping(value="/deleteDetails/{rno}")
	public void deleteLaptop(@PathVariable("rno") int sNo) {
		lapService.deleteLaptop(sNo);
	}
	@GetMapping(value="/getLaptop/{rno}")
	public Laptop getLaptop(@PathVariable("rno") int sNo) {
		return lapService.getLaptop(sNo);
	}
	@GetMapping("/sortLaptop/{field}")
	 public List<Laptop>sortLaptop(@PathVariable String field) 
	 {
		 return lapService.sortLaptop(field);
		 
	 }
	 
	 //paging
	 @GetMapping("/pagingLaptops/{offset}/{pageSize}")
	 public List<Laptop>paginglaptop(@PathVariable int offset,@PathVariable int pageSize) 
	 {
		 return lapService.PagingLaptop(offset,pageSize);
	 }
	 
	 //paging&&sorting
	
	 @GetMapping("/pagingSortingLaptop/{offset}/{pageSize}/{field}")
	  public List<Laptop>pagingSortingLaptop(@PathVariable int offset,@PathVariable int pageSize,@PathVariable String field) 
	  {
		 return lapService.pagingSortingLaptop(offset,pageSize,field);
	  }
	 
	 @GetMapping("/getLaptopByBrand/{brand}")
	 public List<Laptop>getLaptopByBrand(@PathVariable String brand) {
		 List<Laptop> lapList=lapService.getLaptopByBrand(brand);
		 return lapList;
	 }
	 
	 @DeleteMapping("/deleteLaptopByBrand/{brand}")
	 public String deleteLaptopByName(@PathVariable String brand) {
		 int result=lapService.deleteLaptopByBrand(brand);
		 if(result>0)
			 return "Student record deleted";
		 else
			 return "Problem occured while deleting";
	 }
	 @PutMapping("/updateLaptopByBrand/{brand}/{price}")
	 public String updateLaptopByBrand(@PathVariable String brand,@PathVariable String price) {
		 int result=lapService.UpdateLaptopByBrand(brand,price);
		 if(result>0)
			 return "Laptop record updated";
		 else
			 return "Problem occured while updating";
	 }

	 
	  
}