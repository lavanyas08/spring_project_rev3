package com.example.laptopDemo.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.laptopDemo.model.Laptop;





public interface LaptopRepository extends JpaRepository<Laptop,Integer>{
	
	
	
	@Query("select s from Laptop s where s.brand=:brand")
	public List<Laptop>getLaptopByBrand(String brand);
    
	@Modifying
	@Query("delete from Laptop s  where s.brand=?1")
	public int deleteLaptopByBrand(String brand);
	
	@Modifying
	@Query("update Laptop s set s.brand=?1 where s.price=?2")
	public int UpdateLaptopByBrand(String brand,String price);
	
	List<Laptop> findByBrandStartingWith(String prefix);
	List<Laptop> findByBrandEndingWith(String suffix);
	List<Laptop> findByBrand(String Brand);


	
}
