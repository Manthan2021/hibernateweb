package com.coforge.training.hibernateDemo3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//HIBERNATE USING ANNOTATION CONFIGURATION-JPA

//Does not require Mapping file because of annotations usage-JPA
//@Entity annotation marks this class as an entity.
//@Table annotation specifies the table name where data of this entity is to be persisted. If you don't use @Table annotation, hibernate will use the class name as the table name by default.
//@Id annotation marks the identifier for this entity. -primary key field



@Entity

@Table(name="Customers")
public class Customer {

 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
private int customerId;

 
 // @Column annotation specifies the details of the column for this property or field. If @Column annotation is not specified, property name will be used as the column name by default.
 
 
 @Column(name="First_Name")
 private String firstName;
private String lastName;	
private double balance;


@Column(name="marital_Status")
private boolean married;

//getters and setters
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public boolean isMarried() {
	return married;
}
public void setMarried(boolean married) {
	this.married = married;
}


	
	
	
}
