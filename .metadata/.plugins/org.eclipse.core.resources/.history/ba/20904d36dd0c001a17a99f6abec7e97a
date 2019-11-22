/**
 * 
 */
package com.lti.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lti.Exception.CustomerException;
import com.lti.entity.Customer;
import com.lti.service.CustomerService;

/**
 * @author Priyanka Madas
 *
 */
@Controller
public class CustomerController {

	
	@Autowired
	private CustomerService customerService;
	
	
// No. of ways to write the register method to get the data from the jsp file
//public String register(HttpServletRequest request){
//public String register(@RequestParam("name") String name,@RequestParam("name") String name,...)  Use this when you have only two or three parameteres by max
//form data can be stored in the object directly, also the best method to do that
	
	@RequestMapping(path="register.lti",method=RequestMethod.POST)
	public String register(Customer cust) throws CustomerException
	{
		customerService.register(cust);
		System.out.println(cust);
		return "Login.jsp";
		
	}
	
	}
	

