package com.lti.entity;
/**
 * @author Priyanka and Jyoti
 * @Date 14-11-19
 *
 */


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class NetBankAccount 
{
	@Id
	private String nbUsername;
	private String nbpassword;
	private String nbTransferpass;
	//private int nbotp;
	private String nbSecurityQues;
	private String nbSecurityAns;
	
	@OneToOne(mappedBy="account",cascade=CascadeType.ALL)
	private Account NetBankingAccount;

	public String getNbUsername() {
		return nbUsername;
	}

	public void setNbUsername(String nbUsername) {
		this.nbUsername = nbUsername;
	}

	public String getNbpassword() {
		return nbpassword;
	}

	public void setNbpassword(String nbpassword) {
		this.nbpassword = nbpassword;
	}

	public String getNbTransferpass() {
		return nbTransferpass;
	}

	public void setNbTransferpass(String nbTransferpass) {
		this.nbTransferpass = nbTransferpass;
	}

	public String getNbSecurityQues() {
		return nbSecurityQues;
	}

	public void setNbSecurityQues(String nbSecurityQues) {
		this.nbSecurityQues = nbSecurityQues;
	}

	public String getNbSecurityAns() {
		return nbSecurityAns;
	}

	public void setNbSecurityAns(String nbSecurityAns) {
		this.nbSecurityAns = nbSecurityAns;
	}

	public Account getNetBankingAccount() {
		return NetBankingAccount;
	}

	public void setNetBankingAccount(Account netBankingAccount) {
		NetBankingAccount = netBankingAccount;
	}
     
	
	
	
}
