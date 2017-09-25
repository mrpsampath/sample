package com.sample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	@Id
	@Column
	private final String name;
	@Column
	private final String lastName;
	public String getName() {
		return name;
	}
	public String getLastName() {
		return lastName;
	}
	public Employee(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}
	
}
