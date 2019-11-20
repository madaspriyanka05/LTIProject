package com.lti.entity;

/**
 * @author Priyanka Madas and Jyoti Dixit
 * @Date 14-11-19
 */


import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Account
{
	@Id
	@GeneratedValue
	private int accId;
	
//	@Id
//    @GeneratedValue
//	private int custId;
//	
	private double accBalance;
	private LocalDate accOpenAccDate;
	private String accStatus;
	
	@OneToOne
	@JoinColumn(name = "custId", nullable=false)// name of the foreign key
	private Customer customer;
		
	@OneToMany(mappedBy="account",cascade=CascadeType.ALL) //List of Transaction  
	private List <Transaction> transactions;
	
	@OneToMany(mappedBy="account",cascade=CascadeType.ALL)
	private Beneficiary beneficiary;

	
	/**
	 * @return the accId
	 */
	public int getAccId() {
		return accId;
	}

	/**
	 * @param accId the accId to set
	 */
	public void setAccId(int accId) {
		this.accId = accId;
	}

	/**
	 * @return the accBalance
	 */
	public double getAccBalance() {
		return accBalance;
	}

	/**
	 * @param accBalance the accBalance to set
	 */
	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	/**
	 * @return the accOpenAccDate
	 */
	public LocalDate getAccOpenAccDate() {
		return accOpenAccDate;
	}

	/**
	 * @param accOpenAccDate the accOpenAccDate to set
	 */
	public void setAccOpenAccDate(LocalDate accOpenAccDate) {
		this.accOpenAccDate = accOpenAccDate;
	}

	/**
	 * @return the accStatus
	 */
	public String getAccStatus() {
		return accStatus;
	}

	/**
	 * @param accStatus the accStatus to set
	 */
	public void setAccStatus(String accStatus) {
		this.accStatus = accStatus;
	}

	/**
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}

	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	/**
	 * @return the transactions
	 */
	public List<Transaction> getTransactions() {
		return transactions;
	}

	/**
	 * @param transactions the transactions to set
	 */
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}
	
	/**
	 * @return the beneficiary
	 */
	public Beneficiary getBeneficiary() {
		return beneficiary;
	}

	/**
	 * @param beneficiary the beneficiary to set
	 */
	public void setBeneficiary(Beneficiary beneficiary) {
		this.beneficiary = beneficiary;
	}

	
	}
