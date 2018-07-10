package com.qa.accounts;

public class Accounts {
	
	private String firstName;
	private String lastName;
	private String accountNumber;
	
	public Accounts(String firstName, String lastName, String accountNumber) {
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
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	@Override
	public String toString() {
		return "Account Number: " + accountNumber 
		+ "\n" + "First Name: " + firstName 
		+ "\n" + "Last Name: " + lastName;
	}
}
