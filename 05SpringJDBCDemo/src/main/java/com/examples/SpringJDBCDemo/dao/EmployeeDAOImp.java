package com.examples.SpringJDBCDemo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.examples.SpringJDBCDemo.entity.Employee;
import com.examples.SpringJDBCDemo.rowmapper.EmployeeRowMapper;

@Component("employeedao")
public class EmployeeDAOImp implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public int create(Employee emp) {
		String sql="insert into employee values(?,?,?)";
		int result=jdbcTemplate.update(sql,emp.getId(),emp.getFirstName(),emp.getLastName());
		return result;
	}
	
	 @Override
 	public int update(Employee emp) {
 		String sql="update employee set firstname=?, lastname=? where id=?";
 		int result=jdbcTemplate.update(sql,emp.getFirstName(),emp.getLastName(),emp.getId());
 		return result;
 	}

 	@Override
 	public int delete(int id) {
 		String sql="delete from employee where id=?";
 		int result=jdbcTemplate.update(sql,id);
 		return result;
 	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper empRowMapper=new EmployeeRowMapper();
		Employee emp=jdbcTemplate.queryForObject(sql, empRowMapper,id);
		return emp;
	}

	@Override
	public List<Employee> read() {
		String sql="select * from employee";
		EmployeeRowMapper empRowMapper=new EmployeeRowMapper();
		List<Employee> employees=(List<Employee>) jdbcTemplate.query(sql, empRowMapper);
		return employees;
	}
	
}
