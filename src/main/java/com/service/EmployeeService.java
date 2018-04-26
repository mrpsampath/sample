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
	
	public EmployeeModel getEmployee(String employeeName) {
		EmployeeModel empModel=new EmployeeModel();
		Employee emp =userDao.getEmployee(employeeName);
		empModel.setName(emp.getName());
		empModel.setLastName(emp.getLastName());
		return empModel;
	}
	public void getUserDetails() {
		 userDao.getUserDetails();
	}

	@Override
	public void deleteEmployee(String employee) {
		userDao.deleteEmployee(employee);
	}
}
