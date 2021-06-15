package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileClient {

	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Mobile mobile=context.getBean(Mobile.class,"mobile");
		
		/*
		//SIM sim=context.getBean(AirtelSIM.class,"airtelSIM");
		SIM sim=context.getBean(JioSIM.class,"jioSIM");
		mobile.setSim(sim);
		*/
		
		mobile.doCall();
		mobile.doMessage();
				
		/*
		Mobile mobile=new Mobile();
		AirtelSIM sim=new AirtelSIM();
		sim.setMobileNumber("9893212234");
		mobile.setSim(sim);
		mobile.doCall();
		mobile.doMessage();
		*/
	}

}
