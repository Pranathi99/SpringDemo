package com.examples.SpringJDBCDemo.dao;

import java.util.List;

import com.examples.SpringJDBCDemo.entity.Employee;

public interface EmployeeDAO {
	int create(Employee emp);
	int update(Employee emp);
	int delete(int id);
	Employee read(int id);
	List<Employee>read();
}
