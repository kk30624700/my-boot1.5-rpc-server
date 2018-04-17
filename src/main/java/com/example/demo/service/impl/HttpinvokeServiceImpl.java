package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.m24.demo.rpc.api.HttpInvokerService;

@Service
public class HttpinvokeServiceImpl implements HttpInvokerService {
	public String getMsg()  {
		return "HttpinvokeServiceImpl";
	}
}
