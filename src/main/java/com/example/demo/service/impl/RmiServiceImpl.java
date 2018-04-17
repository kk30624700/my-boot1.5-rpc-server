package com.example.demo.service.impl;

import org.springframework.stereotype.Service;

import com.m24.demo.rpc.api.RmiService;

@Service
public class RmiServiceImpl implements RmiService {
	public String getMsg()  {
		return "RmiServiceImpl";
	}
}
