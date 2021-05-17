package com.capgemini.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Loan_details;
import com.capgemini.exception.LoannotfoundException;
import com.capgemini.repository.Loan_detailsRepository;

@Service
public class Loan_detailsServiceimpl implements ILoan_detailsService{
	
	@Autowired
	Loan_detailsRepository loandetailsrepository;

	@Override
	public String addLoan_details(Loan_details loandetails) {
		loandetailsrepository.save(loandetails);
		return "Loan details record added!!";
	}

	@Override
	public String updateLoan_details(int loanid, Loan_details loandetails) {
		if(!loandetailsrepository.existsById(loanid)) {
			throw new LoannotfoundException("Check the id and Try again");
		}
		Loan_details ld=loandetailsrepository.findById(loanid).get();
		ld.setLoan_type(loandetails.getLoan_type());
		ld.setInterest_rate(loandetails.getInterest_rate());
		loandetailsrepository.save(ld);
		
		return "Loan_details updated";
	}

	@Override
	public String deleteLoan_details(int loanid) {
		loandetailsrepository.deleteById(loanid);
		return "Record deleted";
	}

}
