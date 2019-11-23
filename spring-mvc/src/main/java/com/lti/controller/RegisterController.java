package com.lti.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.lti.Service.CustomerService;
import com.lti.entity.Customer;

@Controller
public class RegisterController {

	
	@Autowired
	private CustomerService customerService;
	
	
// No. of ways to write the register method to get the data from the jsp file
//public String register(HttpServletRequest request){
//public String register(@RequestParam("name") String name,@RequestParam("name") String name,...)  Use this when you have only two or three parameteres by max
//form data can be stored in the object directly, also the best method to do that
	@RequestMapping(path="register.lti",method=RequestMethod.POST)
	public String register(Customer cust,@RequestParam("profilePic") MultipartFile m )
	{
		
		String path = "d:/uploads/";
		//String filename = data.getName() + "-" + data.getProfilePic().getOriginalFilename(); 
		String finalpath = path + m.getOriginalFilename();
		try 
		{
		  m.transferTo(new File(finalpath));
		}catch (IOException e) {e.printStackTrace();}
		
		cust.setProfilePicName(m.getOriginalFilename());
		customerService.register(cust);
		return "Confirmation.jsp";
		
	}
	
	}
	

