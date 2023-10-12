package com.firstproject.spring.learnspringframework.enterprise.example.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.firstproject.spring.learnspringframework.enterprise.example.business.BusinessService;

@Component
public class MyWebContoller {
	
	@Autowired
	private BusinessService businessService;
        public long returnValueFromBusinessService() {
        	return businessService.calculateSum();
        }
}

