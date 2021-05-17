package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Loan_details;
import com.capgemini.exception.LoannotfoundException;
import com.capgemini.repository.Loan_detailsRepository;
import com.capgemini.service.Loan_detailsServiceimpl;

@RestController
@RequestMapping("/api/loan_details/")
public class Loan_detailsController {

	@Autowired
	Loan_detailsRepository loandetailsreposirory;

	@Autowired
	Loan_detailsServiceimpl service;

	@PostMapping("/addloandetails")
	public ResponseEntity<String> createloandetails(@RequestBody Loan_details loandetails) {
		service.addLoan_details(loandetails);
		return new ResponseEntity<>("Added", HttpStatus.OK);
	}

	@PutMapping("/{loan_id}")
	public ResponseEntity<String> updateloandetails(@PathVariable int loanid, @RequestBody Loan_details loandetails)
			throws LoannotfoundException {
		service.updateLoan_details(loanid, loandetails);
		return new ResponseEntity<>("Updated", HttpStatus.OK);
	}

	@DeleteMapping("/{loanid}")
	public ResponseEntity<String> deleteLoan_details(@PathVariable int loanid) {
		service.deleteLoan_details(loanid);
		return new ResponseEntity<>("Deleted", HttpStatus.OK);

	}
	
	@GetMapping("/{loanid}")
	public Loan_details findById(@PathVariable int loanid) {
		return loandetailsreposirory.findById(loanid).get();
	}
	
}
