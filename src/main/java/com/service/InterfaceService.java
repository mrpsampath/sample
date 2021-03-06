package com.service;

import com.models.EmployeeModel;

public interface InterfaceService {
	public boolean createEmployee();
	public boolean createEmployee(EmployeeModel employee);
	public void getUserDetails();
	public EmployeeModel getEmployee(String Employee);
	public void deleteEmployee(String employee);
}
