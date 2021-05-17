package com.capgemini.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.entities.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	Customer findByEmailAndPassword(String email, String password);


}
