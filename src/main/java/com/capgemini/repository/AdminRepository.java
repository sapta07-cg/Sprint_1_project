package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer>{
	
	//public Admin findByUserAndPassword(String username, String password);

}
