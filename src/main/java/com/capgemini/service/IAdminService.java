package com.capgemini.service;
import java.util.List;

import com.capgemini.entities.Admin;
public interface IAdminService {
	public String createAdmin(Admin admin);

	public Admin findById(int userId);

	public List<Admin> getAllAdmin();

	//public boolean isVaildAdmin(String username, String password);


}
