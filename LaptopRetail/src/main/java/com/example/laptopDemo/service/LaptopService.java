package com.example.laptopDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.laptopDemo.dao.LaptopRepository;
import com.example.laptopDemo.model.Laptop;

import jakarta.transaction.Transactional;






@Service
public class LaptopService {
@Autowired
	LaptopRepository lapRepository;
	public List <Laptop> getAllDetails(){
		List<Laptop>lapList=lapRepository.findAll();
		return lapList;
	}
	public Laptop saveLaptops(Laptop s) {
		Laptop obj=lapRepository.save(s);
		return obj;
		//return studRepository.save(S);
	}
	public Laptop updateLaptop(Laptop s)
	{
		Laptop obj=lapRepository.save(s);
		return obj;
	}
	public void deleteLaptop(int sNo)
	{
		lapRepository.deleteById(sNo);
	}
	public Laptop getLaptop(int sNo)
	{
		Laptop s=lapRepository.findById(sNo).get();
		return s;
	}
	
	public List<Laptop> sortLaptop(String field) {
		//return lapRepository.findAll(Sort.by(field)); //to return the table data in ascending order
		return lapRepository.findAll(Sort.by(Direction.DESC,field));
	}
	public List<Laptop>PagingLaptop(int offset,int pageSize)
	{
		Pageable paging=PageRequest.of(offset, pageSize);
		Page<Laptop>lapData=lapRepository.findAll(paging);
		List<Laptop>lapList=lapData.getContent();
		return  lapList;
	}
	

	
	public List<Laptop>pagingSortingLaptop(int offset,int pageSize,String field){
		
		Pageable paging=PageRequest.of(offset,pageSize).withSort(Sort.by(field));
		Page<Laptop>lapData= lapRepository.findAll(paging);	
		List<Laptop>lapList=lapData.getContent();
		return lapList;
	}
	
	public List<Laptop>getLaptopByBrand(String brand) {
		List<Laptop> lapList=lapRepository.getLaptopByBrand(brand);
		return lapList;
	}
	@Transactional
	public int deleteLaptopByBrand(String brand) {
		return lapRepository.deleteLaptopByBrand(brand);
	}
	
	@Transactional
	public int UpdateLaptopByBrand(String brand,String price) {
		return lapRepository.UpdateLaptopByBrand(brand,price);
	}

	

}
