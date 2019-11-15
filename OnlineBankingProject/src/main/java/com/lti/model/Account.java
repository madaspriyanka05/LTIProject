/**
 * 
 */
/**
 * @author Priyanka Madas
 * @Date 14-11-19
 */
package com.lti.model;

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
	@Id
	//@GeneratedValue
	private int custId;
	
	@OneToOne
	@JoinColumn(name = "Cust_Id", nullable=false)// name of the foreign key
	private Customer customer;
	
	@OneToMany(mappedBy="account",cascade=CascadeType.ALL)
	private List <Transcation> transcations;
	
	private double accBalance;
	private LocalDate accOpenAccDate;
	private String accStatus;
	
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
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	public void setCustId(int custId) {
		this.custId = custId;
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
	
	
	}