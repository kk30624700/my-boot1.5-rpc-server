package com.example.demo.conf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerServiceExporter;

import com.m24.demo.rpc.api.HttpInvokerService;

@Configuration
public class HttpInvokerConfig {
	@Autowired
	HttpInvokerService httpInvokerService;
	
	@Bean(name = "/httpInvokerService")
	public HttpInvokerServiceExporter httpInvokerExported() {
		HttpInvokerServiceExporter exporter = new HttpInvokerServiceExporter();
		exporter.setService(httpInvokerService);
		exporter.setServiceInterface(HttpInvokerService.class);
		return exporter;
	}
}
