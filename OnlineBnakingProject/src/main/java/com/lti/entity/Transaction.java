package com.lti.entity;


/**
 * @author Priyanka Madas and Jyoti Dixit
 * @Date 14-11-19
 */


import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transaction
{
	@Id
	@GeneratedValue
	private int txId;
	
	
	
	//beneficary table two fk no and name
	
	private double txAmount;
	
	private String txType;

//	private int txOtp;
	
	private LocalDateTime txDateTime;
	
	@ManyToOne
	@JoinColumn(name="ACC_ID", nullable=false)
	private Account account;

	public int getTxId() {
		return txId;
	}

	public void setTxId(int txId) {
		this.txId = txId;
	}

	public double getTxAmount() {
		return txAmount;
	}

	public void setTxAmount(double txAmount) {
		this.txAmount = txAmount;
	}

	public String getTxType() {
		return txType;
	}

	public void setTxType(String txType) {
		this.txType = txType;
	}

	public LocalDateTime getTxDateTime() {
		return txDateTime;
	}

	public void setTxDateTime(LocalDateTime txDateTime) {
		this.txDateTime = txDateTime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	

}