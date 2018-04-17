package com.example.demo.rpc.rmi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.conf.rmi.RmiSerConfig;

public class TestSer {
	public static void main(String[] args) throws InterruptedException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.getEnvironment().setActiveProfiles("default");
		context.register(RmiSerConfig.class);
		context.refresh();
		
		Thread.sleep(10000);
		
		context.close();
		
		
	}
}
