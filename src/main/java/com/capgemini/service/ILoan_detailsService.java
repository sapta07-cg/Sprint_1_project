package com.capgemini.service;

import com.capgemini.entities.Loan_details;

public interface ILoan_detailsService {
	public String addLoan_details(Loan_details loandetails);
	public String updateLoan_details(int loanid,Loan_details loandetails);
	public String deleteLoan_details(int loanid);

}
