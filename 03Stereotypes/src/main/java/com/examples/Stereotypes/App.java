package com.examples.Stereotypes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.Stereotypes.beans.Instructor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/examples/Stereotypes/springconfig.xml");
        Instructor ist=(Instructor)ctx.getBean("instructor");
        System.out.println(ist);
    }
}
