package com.ltts.SpringDemoInjectionUsingAnnotations;

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
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
    	
    	Employee e = (Employee)(context.getBean("id"));
    	e.setId(2);
    	e.setName("s");
    	System.out.println(e);
    	
    
    	
    }
}
