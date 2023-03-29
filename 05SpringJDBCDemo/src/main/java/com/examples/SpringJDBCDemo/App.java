package com.examples.SpringJDBCDemo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.examples.SpringJDBCDemo.dao.EmployeeDAO;
import com.examples.SpringJDBCDemo.entity.Employee;

public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringJDBCDemo/springconfig.xml");
//        JdbcTemplate jdbcTemplate =(JdbcTemplate) ctx.getBean("jdbctemplate");
//        String sql= "insert into employee values(?,?,?)";
//        int result=jdbcTemplate.update(sql,1,"Elena","Summers");
//        System.out.println(result);
        
        EmployeeDAO empdao=(EmployeeDAO) ctx.getBean("employeedao");
        
//        Employee emp=new Employee();
//        emp.setId(3);
//        emp.setFirstName("Ben");
//        emp.setLastName("William");
//        
//        System.out.println(empdao.create(emp));
        
//        emp.setFirstName("Maximus");
//        emp.setLastName("Wilson");
        
        //System.out.println(empdao.update(emp));
        
        //System.out.println(empdao.delete(2));
        
//        Employee emp=empdao.read(1);
//        System.out.println(emp);
        List<Employee>emp=empdao.read();
        System.out.println(emp);
    }
}
