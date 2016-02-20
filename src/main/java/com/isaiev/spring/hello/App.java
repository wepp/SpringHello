package com.isaiev.spring.hello;

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
    	ApplicationContext context = new ClassPathXmlApplicationContext("SpringBean.xml");
    	HelloWorld obj = (HelloWorld) context.getBean("helloBean");
    	obj.printHello();
    	SportCar bmw = (SportCar) context.getBean("sportCarBMW");
    	SportCar audi = (SportCar) context.getBean("sportCarAudi");
    	bmw.run();
    	audi.run();
    	Transporter truck = (Transporter) context.getBean("sportCarTransporter");
    	truck.run();
    }
}
