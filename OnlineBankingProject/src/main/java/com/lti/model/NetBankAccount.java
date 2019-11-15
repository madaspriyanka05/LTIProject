/**
 * 
 */
package com.lti.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author Priyanka
 * @Date 14-11-19
 *
 */
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

	/**
	 * @return the nbUsername
	 */
	public String getNbUsername() {
		return nbUsername;
	}

	/**
	 * @param nbUsername the nbUsername to set
	 */
	public void setNbUsername(String nbUsername) {
		this.nbUsername = nbUsername;
	}

	/**
	 * @return the nbpassword
	 */
	public String getNbpassword() {
		return nbpassword;
	}

	/**
	 * @param nbpassword the nbpassword to set
	 */
	public void setNbpassword(String nbpassword) {
		this.nbpassword = nbpassword;
	}

	/**
	 * @return the nbTransferpass
	 */
	public String getNbTransferpass() {
		return nbTransferpass;
	}

	/**
	 * @param nbTransferpass the nbTransferpass to set
	 */
	public void setNbTransferpass(String nbTransferpass) {
		this.nbTransferpass = nbTransferpass;
	}

	/**
	 * @return the nbSecurityQues
	 */
	public String getNbSecurityQues() {
		return nbSecurityQues;
	}

	/**
	 * @param nbSecurityQues the nbSecurityQues to set
	 */
	public void setNbSecurityQues(String nbSecurityQues) {
		this.nbSecurityQues = nbSecurityQues;
	}

	/**
	 * @return the nbSecurityAns
	 */
	public String getNbSecurityAns() {
		return nbSecurityAns;
	}

	/**
	 * @param nbSecurityAns the nbSecurityAns to set
	 */
	public void setNbSecurityAns(String nbSecurityAns) {
		this.nbSecurityAns = nbSecurityAns;
	}

	/**
	 * @return the netBankingAccount
	 */
	public Account getNetBankingAccount() {
		return NetBankingAccount;
	}

	/**
	 * @param netBankingAccount the netBankingAccount to set
	 */
	public void setNetBankingAccount(Account netBankingAccount) {
		NetBankingAccount = netBankingAccount;
	}
	

}
