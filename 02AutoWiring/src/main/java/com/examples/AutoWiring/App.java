package com.examples.AutoWiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	//Employee emp;
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/AutoWiring/springconfig.xml");
        //App app=new App();
        //app.emp=(Employee)ctx.getBean("emp");
        //System.out.println(app.emp);
        Employee emp=(Employee)ctx.getBean("emp");
        System.out.println(emp);
    }
}
