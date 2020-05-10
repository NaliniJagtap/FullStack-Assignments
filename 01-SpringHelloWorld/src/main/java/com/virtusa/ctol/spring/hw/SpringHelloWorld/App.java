package com.virtusa.ctol.spring.hw.SpringHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
    	  MyBean obj = (MyBean) context.getBean("mybean");
          obj.getMessage();
          System.out.println("=======================");
          MyBean obj2 = (MyBean) context.getBean("mybean");
          obj2.getMessage();
          MyBean obj3 = (MyBean) context.getBean("mybean");
          obj3.getMessage();
          
          ((AbstractApplicationContext) context).registerShutdownHook();
          
       
    }
}
