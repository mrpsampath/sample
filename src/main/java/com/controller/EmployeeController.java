package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.InterfaceService;

@RestController
public class EmployeeController {
	
		@Autowired
		InterfaceService employeeService;
	
	    @RequestMapping(value = "/greeting",method = RequestMethod.POST)
	    public boolean greeting() {
	   	 employeeService.createEmployee();
	   	 return true;
	    }
}
