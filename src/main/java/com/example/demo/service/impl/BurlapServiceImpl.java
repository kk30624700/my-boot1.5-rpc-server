package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.m24.demo.rpc.api.BurlapService;

@Service
public class BurlapServiceImpl implements BurlapService {
	public String getMsg()  {
		return "BurlapServiceImpl";
	}
}
