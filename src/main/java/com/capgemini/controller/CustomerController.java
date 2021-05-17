package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Customer;
import com.capgemini.exception.CustomerNotFoundException;
import com.capgemini.repository.CustomerRepository;
@RestController
@RequestMapping("/apply_loan/customer/")
public class CustomerController {
	@Autowired
	private CustomerRepository customerRepository;
	
	@PostMapping("/")
	public String create(@RequestBody Customer customer) {
		customerRepository.save(customer);
		return "Customer applied !!";
	}
	@GetMapping("/profile")
	public String create() {
		// logic for create
		return "this is customer profile!!";
	}
	@GetMapping("/status")
	public int  create1() {
		// logic for create
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
	
	@PostMapping("/authenticate")
	public Customer findByEmailAndPassworddddd(@RequestBody Customer customer) throws CustomerNotFoundException{
		Customer dbcustomer=customerRepository.findByEmailAndPassword(customer.getEmail(),customer.getPassword());
		if(dbcustomer==null) {
			throw new CustomerNotFoundException("Customer Not Found");
		}
		else {
			return dbcustomer;
		}
	}

	
	
	

}
