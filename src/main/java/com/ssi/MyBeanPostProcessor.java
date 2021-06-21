package com.ssi;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		System.out.println("Bean : "+beanName+" Is Initialized....! ");
		return bean;
	}

	
	
}
