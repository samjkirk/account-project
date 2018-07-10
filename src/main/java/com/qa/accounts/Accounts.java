package com.qa.accounts;

public class Accounts {
	
	private String firstName;
	private String lastName;
	private int accountNumber;
	
	public Accounts(String firstName, String lastName, int accountNumber) {
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
	}

	public Accounts() {
		setFirstName(firstName);
		setLastName(lastName);
		setAccountNumber(accountNumber);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setAccountNumber(int accountNumber2) {
		this.accountNumber = accountNumber2;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	@Override
	public String toString() {
		return "Account Number: " + accountNumber 
		+ "\n" + "First Name: " + firstName 
		+ "\n" + "Last Name: " + lastName;
	}
}
