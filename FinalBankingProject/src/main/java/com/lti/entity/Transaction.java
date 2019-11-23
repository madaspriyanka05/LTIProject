package com.lti.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Transaction")
public class Transaction 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(sequenceName = "transaction1_seq", name = "seq", allocationSize = 1)
	private int tid;
			
	private double amount;
	
	private String type;

	private LocalDateTime dateTime;
	
	@ManyToOne
	@JoinColumn(name="fromaccountId", nullable=false)
	private Account account;

	@ManyToOne
	@JoinColumn(name="toaccountId", nullable=false)
	private Account toAccount;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Account getToAccount() {
		return toAccount;
	}

	public void setToAccount(Account toAccount) {
		this.toAccount = toAccount;
	}

	@Override
	public String toString() {
		return "Transaction [tid=" + tid + ", amount=" + amount + ", type=" + type + ", dateTime=" + dateTime
				+ ", account=" + account + ", toAccount=" + toAccount + "]";
	}
	
	
}
