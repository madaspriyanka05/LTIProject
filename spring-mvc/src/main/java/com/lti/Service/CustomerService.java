package com.lti.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Customer;
import com.lti.repository.CustomerRepository;

//again instead of @Component
//Suggestion is to use @Service

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private SendMailService sendMailService; 
	
	public void register(Customer cust) 
	{
		//add some business logic before adding to the database
//		if(cust.getName()==null)
//		{
//			
//		}
		customerRepository.add(cust);
		sendMailService.send(cust.getEmail(),"Thank You", "We thank you for registering with us.");
	}
}
