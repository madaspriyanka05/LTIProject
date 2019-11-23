package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Beneficiary")
public class Beneficiary 
{
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(sequenceName = "beneficiary_seq", name = "seq", allocationSize = 1)
	private int bAccId; 
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="accountId")
	private Account  account;

	public int getbAccId() {
		return bAccId;
	}

	public void setbAccId(int bAccId) {
		this.bAccId = bAccId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Beneficiary [bAccId=" + bAccId + ", name=" + name + ", account=" + account + "]";
	}
	
	

}
