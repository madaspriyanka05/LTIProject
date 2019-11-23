package com.lti.Interface;

/**
 * @author Priyanka Madas and Jyoti Dixit
 * @Date 14-11-19
 */


import java.util.List;


import com.lti.entity.Customer;

public interface CustomerInterface
{
	public void addNewCustomer(Customer customer);
	public void updateNewCustomer(Customer customer);

	public void deleteNewCustomer(Customer customer);
	
	public List<Customer> getCustomersList();
	}
