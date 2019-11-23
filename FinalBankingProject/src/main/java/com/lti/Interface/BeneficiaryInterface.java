package com.lti.Interface;

/**
 * @author : Jyoti Dixit
 */

import java.util.List;

import com.lti.entity.Account;
import com.lti.entity.Beneficiary;

public interface BeneficiaryInterface 
{
	public void addNewBeneficiary(Beneficiary beneficiaryobj);
	public void removeBeneficiary(Beneficiary beneficiaryobj);
	public List<Beneficiary> getBeneficiaries();
}
