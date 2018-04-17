package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.m24.demo.rpc.api.HessianService;

@Service
public class HessianServiceImpl implements HessianService {
	public String getMsg()  {
		return "HessianServiceImpl";
	}
}
