package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

import com.m24.demo.rpc.api.RmiService;

@Configuration
public class RmiConfig {
	@Autowired
	RmiService rmiService;
	
	@Bean
	public RmiServiceExporter rmiExporter() {
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setService(rmiService);
		rmiServiceExporter.setServiceName("rmiService");
		rmiServiceExporter.setServiceInterface(RmiService.class);
//		rmiServiceExporter.setRegistryHost("127.0.0.1");
//		rmiServiceExporter.setRegistryPort(1199);
		return rmiServiceExporter;
	}
	
}
