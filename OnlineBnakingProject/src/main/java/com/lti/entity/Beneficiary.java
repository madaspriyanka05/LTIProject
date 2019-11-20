package com.lti.entity;

/**
 * @author Priyanka Madas and Jyoti Dixit
 * @Date 14-11-19
 */

import javax.persistence.*;


@Entity
public class Beneficiary 
{
	@Id
	@GeneratedValue
	private int bfId;
	
	@ManyToOne
	@JoinColumn(name="account_id")
	private Account  account;
	
	
	public int getBfId() {
		return bfId;
	}

	public void setBfId(int bfId) {
		this.bfId = bfId;
	}

	public double getBfMaxTransferAmt() {
		return bfMaxTransferAmt;
	}

	public void setBfMaxTransferAmt(double bfMaxTransferAmt) {
		this.bfMaxTransferAmt = bfMaxTransferAmt;
	}

	public String getBfName() {
		return bfName;
	}

	public void setBfName(String bfName) {
		this.bfName = bfName;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	private double bfMaxTransferAmt;
	private String bfName;
	
}
