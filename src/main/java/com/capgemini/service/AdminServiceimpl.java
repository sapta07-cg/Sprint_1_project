package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.entities.Admin;
import com.capgemini.exception.AdminException;
import com.capgemini.repository.AdminRepository;


@Service
public class AdminServiceimpl implements IAdminService{
	
	
	@Autowired
	private AdminRepository adminrepository;
	@Autowired
	AdminServiceimpl adminserviceimpl;
	
	
	
	@Override
	public String createAdmin(Admin admin) {
		adminrepository.save(admin);
		return "Admin registered!!";
	}
	
	

	@Override
	public Admin findById(int userId) {
		if(!adminrepository.existsById(userId)){
			throw new AdminException("Admin is Not Found!!");
		}
		Admin a= adminrepository.findById(userId).get();
		return a;
	}
	
	@Override
	public List<Admin> getAllAdmin() {
		return adminrepository.findAll();
	}

	/*@Override
	public boolean isVaildAdmin(String username, String password) {
		// TODO Auto-generated method stub
		return adminrepository.findByUserAndPassword(username, password)!=null;
	}*/

}
