package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer1")

public class Customer
{
	@Id
	@GeneratedValue
  private int cId;
	
  private String name;
  private String email;
  private String profilePicName;
public int getcId() {
	return cId;
}
public void setcId(int cId) {
	this.cId = cId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getProfilePicName() {
	return profilePicName;
}
public void setProfilePicName(String profilePicName) {
	this.profilePicName = profilePicName;
}
 
}
