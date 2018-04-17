package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.BurlapServiceExporter;

import com.m24.demo.rpc.api.BurlapService;

@Configuration
@ComponentScan
public class BurlapConfig {
	@Autowired
	BurlapService burlapService;
	
	@Bean(name = "/burlapService")
	public BurlapServiceExporter burlapExported() {
		BurlapServiceExporter exporter = new BurlapServiceExporter();
		exporter.setService(burlapService);
		exporter.setServiceInterface(BurlapService.class);
		return exporter;
	}
}
