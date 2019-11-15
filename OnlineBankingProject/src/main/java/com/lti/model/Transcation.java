/**
 * 
 */
package com.lti.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Priyanka 
 * @Date 14-11-19
 *
 */
@Entity
public class Transcation
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
	@JoinColumn(name="ACC_ID", nullable=true)
	private Account account;

}
