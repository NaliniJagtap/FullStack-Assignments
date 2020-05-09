package construcorBasedDI;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  

public class Main {
	 public static void main(String[] args) {  
	        Resource r=new ClassPathResource("applicationContext.xml");  
	        BeanFactory factory=new XmlBeanFactory(r);  
	        Payment service=(Payment)factory.getBean("payment");
	        System.out.println("Using Consructor Based DI");
	        service.display();
	        service.Set("Payment : Nalini");
	        System.out.println("After Setting A parameter through Setter method");
	        service.display();  
	    }  

}
