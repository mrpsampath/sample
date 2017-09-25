package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DAO;

@Service
public class EmployeeService implements InterfaceService{

	@Autowired
	private DAO userDao;

	public boolean createEmployee() {
		return userDao.createEmployee();
	}
	
	public void getUserDetails() {
		 userDao.getUserDetails();
	}
}
