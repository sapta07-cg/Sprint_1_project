package com.capgemini.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class Loan_status {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int item_no;
	private String reject;
	private String approved;
	private String pending;
	

}
