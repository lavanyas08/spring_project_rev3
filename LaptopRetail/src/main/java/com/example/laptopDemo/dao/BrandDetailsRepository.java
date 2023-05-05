package com.example.laptopDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.laptopDemo.model.BrandDetails;


public interface BrandDetailsRepository extends JpaRepository<BrandDetails,Long> {

}
