package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Beneficiary;

@Repository
public class BeneficiaryRepository
{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Transactional
	public void addNewBeneficiary(Beneficiary beneficiaryobj) 
	{
		entityManager.persist(beneficiaryobj);
	}

	public void removeBeneficiary(Beneficiary beneficiaryobj) 
	{
		entityManager.remove(beneficiaryobj);
	}
	
	public List<Beneficiary> getBeneficiaries() 
	{
		Query q = entityManager.createQuery("Select b from beneficiary b");
		return q.getResultList();
	}
	
}
