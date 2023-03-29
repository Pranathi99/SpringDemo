package com.examples.SpringDIDemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.examples.ConstructorInjecting.Computer;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringDIDemo/springconfig.xml");
//        Employee emp=(Employee) ctx.getBean("emp8");
//        System.out.println(emp.hashCode());   //scope-prototype
//        
//        Employee emp1=(Employee) ctx.getBean("emp8");
//        System.out.println(emp1.hashCode());
//        
//        Employee emp2=(Employee) ctx.getBean("emp7");
//        System.out.println(emp2.hashCode()); //scope-singleton
//        
//        Employee emp3=(Employee) ctx.getBean("emp7");
//        System.out.println(emp3.hashCode());
        
//        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/SpringDIDemo/springconfig.xml");
//        ShoppingCart sc=(ShoppingCart) ctx.getBean("cart1");
//        System.out.println(sc);
        
//        Car c1=(Car)ctx.getBean("car");
//        System.out.println(c1.hashCode());
//        
//        Car c2=(Car)ctx.getBean("car");
//        System.out.println(c2.hashCode());
//        
//        Bank b1=(Bank)ctx.getBean("bank");
//        System.out.println(b1.hashCode());
//        
//        Bank b2=(Bank)ctx.getBean("bank");
//        System.out.println(b2.hashCode());
        
//        Computer c1=(Computer)ctx.getBean("computer");
//        System.out.println(c1);
//        
//        Computer c2=(Computer)ctx.getBean("officeComputer");
//        System.out.println(c2);
        
        EmployeeDAO emp1=(EmployeeDAO)ctx.getBean("empdao");
        System.out.println(emp1);
        
    }
}
