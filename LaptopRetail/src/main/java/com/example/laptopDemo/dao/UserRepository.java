package com.example.laptopDemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.laptopDemo.model.UserDetails;

public interface UserRepository extends JpaRepository<UserDetails,Integer>{
}
