package com.dao;

import com.sample.model.Employee;

public interface DAO {
	public boolean createEmployee();
	public boolean createEmployee(Employee employee);
	public void getUserDetails();
}
