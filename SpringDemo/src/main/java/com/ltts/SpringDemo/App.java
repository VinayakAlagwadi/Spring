package com.ltts.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
   
    {
    	//student1 and 2 are setter injections 
    	//student3 is constructor injection
    	ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
    	//student1 Singleton scope 
    	
    	Student s = (Student)(context.getBean("student1"));
    	
    	
    	Student s1 = (Student)(context.getBean("student1"));
    	
    	s1.setStudName("singleton2");
    	s.setStudName("singleton1");
    	
    	System.out.println(s);
    	System.out.println(s1);
    	
    	//student2 is a prototype scope 
    	
    	Student s3 = (Student)(context.getBean("student2"));
    	
    	s3.setStudName("prototype");
    	Student s4 = (Student)(context.getBean("student2"));
    	s4.setStudName("pro2");
    	
    	
    	System.out.println(s3);
    	System.out.println(s4);
    	
    	
    	Student s5 = (Student)(context.getBean("student3"));
    	
    	System.out.println(s5);
    	
    	
    	
    	

    	
       
    }
}
