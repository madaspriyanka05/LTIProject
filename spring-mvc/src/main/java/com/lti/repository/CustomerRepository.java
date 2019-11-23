package com.lti.repository;
import javax.persistence.*;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.entity.Customer;

@Repository
//another name for dao
//instead of @Component,suggestion is to use @Repository
public class CustomerRepository 
{
	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void add(Customer cust){
		
		entityManager.persist(cust);
	}
	
	

}
