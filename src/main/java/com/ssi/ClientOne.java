package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientOne {

	public static void main(String[] args) {
		
		
		//here we will ask spring container to provide us a instance of Info bean.
		
		//step-1	(create your container)
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//ApplicationContext context=new FileSystemXmlApplicationContext("g:/conf/spring.xml");
		
		//step-2	(ask your container to provide desired instance)
		
		//Info info=(Info)context.getBean("companyinfo");
		Info info=context.getBean(Info.class,"companyinfo");
		System.out.println(info);
	}

}
