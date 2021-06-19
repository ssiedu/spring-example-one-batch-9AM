package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoClient {

	public static void main(String[] args) {

		System.out.println("Creating ApplicationContext Object...");
		ApplicationContext context=new ClassPathXmlApplicationContext("spring1.xml");
		
		 DemoBean ob1=context.getBean("d1",DemoBean.class);
		 System.out.println(ob1);
		/*
		 System.out.println("Now Asking For An Instance With Id d1...!");
		 DemoBean ob1=context.getBean("d1",DemoBean.class);
		 
		 System.out.println("Now Asking For An Instance With Id d1 Once Again...!");
		 DemoBean ob2=context.getBean("d1", DemoBean.class);
		 */
		/*
		 System.out.println("First Object : "+ob1);
		 System.out.println("Second Object : "+ob2);
		 
		 System.out.println("Now Changing Ob1..");
		 ob1.setX(50);
		 ob1.setY("Indore");
		 
		 System.out.println("First Object : "+ob1);
		 System.out.println("Second Object : "+ob2);
		 */
		//System.out.println(ob1==ob2);
		
	}

}
