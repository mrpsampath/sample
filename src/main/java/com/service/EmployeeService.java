package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.DAO;
import com.models.EmployeeModel;
import com.sample.model.Employee;

@Service
public class EmployeeService implements InterfaceService{

	@Autowired
	private DAO userDao;

	public boolean createEmployee() {
		return userDao.createEmployee();
	}
	
	public boolean createEmployee(EmployeeModel emp) {
		Employee employee = new Employee(emp.getName(),emp.getLastName());
		return userDao.createEmployee(employee);
	}
	
	public void getUserDetails() {
		 userDao.getUserDetails();
	}
}
