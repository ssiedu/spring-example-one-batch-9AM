package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CustomerClient {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("spring3.xml");
		Customer c1=(Customer)context.getBean("c1");
		Customer c2=(Customer)context.getBean("c2");
		Customer c3=(Customer)context.getBean("c3");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
