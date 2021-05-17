package com.capgemini.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String loan_type;
	private String name;
	private String email;
	private String mobile;
	private String gender;
	private String city;
	private String state;
	private String nationality;
	private String annual_income;
	private String pan_number;
	private String account_no;
	private String password;

}
