package com.lti.model;

import javax.persistence.*;


@Entity
public class Beneficiary 
{
	@Id
	@GeneratedValue
	private int bfId;
	
	private double bfMaxTransferAmt;
	private String bfName;
	
	@ManyToOne
	@JoinColumn(name="ACC_ID",nullable=true)
	private Account account;
	
	

}
