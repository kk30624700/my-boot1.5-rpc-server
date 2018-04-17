package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

import com.m24.demo.rpc.api.HessianService;

@Configuration
public class HessianConfig {
	@Autowired
	HessianService hessianService;
	
	@Bean(name = "/hessianService")
	public HessianServiceExporter hessianExported() {
		HessianServiceExporter exporter = new HessianServiceExporter();
		exporter.setService(hessianService);
		exporter.setServiceInterface(HessianService.class);
		return exporter;
	}
}
