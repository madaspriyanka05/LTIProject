package com.lti.Interface;

/**
 * @author : Jyoti Dixit
 */

import java.util.List;

import com.lti.entity.NetBankAccount;

public interface NetBankingInterface 
{
	public void addNetBankingAcc(NetBankAccount netbankaccount);
	public void updateNetBankingAcc(NetBankAccount netbankaccount);
	public List<NetBankAccount> getNetBankingAcc();
}
