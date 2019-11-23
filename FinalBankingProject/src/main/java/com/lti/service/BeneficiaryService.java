package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Interface.BeneficiaryInterface;
import com.lti.entity.Beneficiary;

@Service
public class BeneficiaryService 
{
	@Autowired
	private BeneficiaryInterface beneficiaryinterface;
	
	public void addBeneficiary(Beneficiary beneficiaryobj)
	{
		beneficiaryinterface.addNewBeneficiary(beneficiaryobj);
	}
	
	public void removeBeneficiary(Beneficiary beneficiaryobj)
	{
		beneficiaryinterface.removeBeneficiary(beneficiaryobj);
	}
}
