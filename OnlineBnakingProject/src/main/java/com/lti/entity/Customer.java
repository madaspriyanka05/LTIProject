package com.lti.entity;

/**
 * @author Priyanka Madas
 * @Date  14-11-19
 */


import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue
	private int custId;

	private String custFname;
	private String custMname;
	private String custLname;
	private String custGender;
	private LocalDate custDoB;
	private int custAadhar;
	private String custEmailId;
	private int custMobileNo;
	private String custAddress;
	private String custFathername;
	private String custOccType;
	private double custIncome;
	private String custState;
	private int custZipcode ;
	
	@OneToOne(mappedBy="account",cascade=CascadeType.ALL)
	private Account  custaccount;
	
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
	 * @return the custFname
	 */
	public String getCustFname() {
		return custFname;
	}
	/**
	 * @param custFname the custFname to set
	 */
	public void setCustFname(String custFname) {
		this.custFname = custFname;
	}
	/**
	 * @return the custMname
	 */
	public String getCustMname() {
		return custMname;
	}
	/**
	 * @param custMname the custMname to set
	 */
	public void setCustMname(String custMname) {
		this.custMname = custMname;
	}
	/**
	 * @return the custLname
	 */
	public String getCustLname() {
		return custLname;
	}
	/**
	 * @param custLname the custLname to set
	 */
	public void setCustLname(String custLname) {
		this.custLname = custLname;
	}
	/**
	 * @return the custGender
	 */
	public String getCustGender() {
		return custGender;
	}
	/**
	 * @param custGender the custGender to set
	 */
	public void setCustGender(String custGender) {
		this.custGender = custGender;
	}
	/**
	 * @return the custDoB
	 */
	public LocalDate getCustDoB() {
		return custDoB;
	}
	/**
	 * @param custDoB the custDoB to set
	 */
	public void setCustDoB(LocalDate custDoB) {
		this.custDoB = custDoB;
	}
	
	/**
	 * @return the custEmailId
	 */
	public String getCustEmailId() {
		return custEmailId;
	}
	/**
	 * @param custEmailId the custEmailId to set
	 */
	public void setCustEmailId(String custEmailId) {
		this.custEmailId = custEmailId;
	}
	/**
	 * @return the custMobileNo
	 */
	public int getCustMobileNo() {
		return custMobileNo;
	}
	/**
	 * @param custMobileNo the custMobileNo to set
	 */
	public void setCustMobileNo(int custMobileNo) {
		this.custMobileNo = custMobileNo;
	}
	/**
	 * @return the custAddress
	 */
	public String getCustAddress() {
		return custAddress;
	}
	/**
	 * @param custAddress the custAddress to set
	 */
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	/**
	 * @return the custFathername
	 */
	public String getCustFathername() {
		return custFathername;
	}
	/**
	 * @param custFathername the custFathername to set
	 */
	public void setCustFathername(String custFathername) {
		this.custFathername = custFathername;
	}
	/**
	 * @return the custOccType
	 */
	public String getCustOccType() {
		return custOccType;
	}
	/**
	 * @param custOccType the custOccType to set
	 */
	public void setCustOccType(String custOccType) {
		this.custOccType = custOccType;
	}
	/**
	 * @return the custIncome
	 */
	public double getCustIncome() {
		return custIncome;
	}
	/**
	 * @param custIncome the custIncome to set
	 */
	public void setCustIncome(double custIncome) {
		this.custIncome = custIncome;
	}
	/**
	 * @return the custState
	 */
	public String getCustState() {
		return custState;
	}
	/**
	 * @param custState the custState to set
	 */
	public void setCustState(String custState) {
		this.custState = custState;
	}
	/**
	 * @return the custZipcode
	 */
	public int getCustZipcode() {
		return custZipcode;
	}
	/**
	 * @param custZipcode the custZipcode to set
	 */
	public void setCustZipcode(int custZipcode) {
		this.custZipcode = custZipcode;
	}
	
	public int getCustAadhar() {
		return custAadhar;
	}
	public void setCustAadhar(int custAadhar) {
		this.custAadhar = custAadhar;
	}
	public Account getCustaccount() {
		return custaccount;
	}
	public void setCustaccount(Account custaccount) {
		this.custaccount = custaccount;
	}
	
	
}