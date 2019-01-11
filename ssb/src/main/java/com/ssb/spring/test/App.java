package com.ssb.spring.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.ssb.spring.bean.Business;
import com.ssb.spring.config.ApplicationConfig;
import com.ssb.spring.service.BusinessService;

public class App {
	
	public static void main(String args[])
	{
	 AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
     BusinessService  businessService = (BusinessService) context.getBean("businessService");
     // Delete All cars
     businessService.deleteAll();

    Business painter= new Business("1","painter");
    businessService.create(painter);
	}
}
