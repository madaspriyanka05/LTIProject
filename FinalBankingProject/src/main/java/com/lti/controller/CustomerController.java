package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.entity.Customer;
import com.lti.service.CustomerService;

@Controller
public class CustomerController
{
	@Autowired
	private CustomerService customerService;
	
	
	//Registering the customer 
    @RequestMapping(value="/register" , method=RequestMethod.POST)
	public ModelAndView register(Customer cust) 
	{
    	ModelAndView mode=null;
	
		customerService.register(cust);
		mode=new ModelAndView("CustomerAdded");
		return mode;
		
	}
	
}
