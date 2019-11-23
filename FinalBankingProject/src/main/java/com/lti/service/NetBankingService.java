package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.Interface.NetBankingInterface;
import com.lti.entity.NetBankAccount;

@Service
public class NetBankingService 
{
	@Autowired
	private NetBankingInterface netbankinginterface;
	
	public void addNetBanking(NetBankAccount netbankingobj)
	{
		netbankinginterface.addNetBankingAcc(netbankingobj);
	}
	
	public void updateNetBanking(NetBankAccount netbankingobj)
	{
		netbankinginterface.updateNetBankingAcc(netbankingobj);
	}
}
