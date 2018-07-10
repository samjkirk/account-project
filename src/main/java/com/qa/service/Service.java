package com.qa.service;

import com.qa.accounts.Accounts;
import com.qa.constants.Constants;
import java.util.HashMap;
import java.util.Map;

public class Service {
	HashMap<Integer, Accounts> accountsList = new HashMap<Integer, Accounts>();
	
	public String addAccount(int id, Accounts account) {
		if(accountsList.containsKey(id)) {
			return Constants.INVALID_ID_MESSAGE;
		} else {
			accountsList.put(account.getAccountNumber(), account);
			return Constants.ACCOUNT_ADDED_MESSAGE;
		}
	}
	
	public String deleteAccount(int id) {
		if(accountsList.containsKey(id)) {
			accountsList.remove(id);
			return Constants.ACCOUNT_DELETED_MESSAGE;
		} else {
			return Constants.INVALID_ID_MESSAGE;
		}
	}
	
	public Accounts getAccount(int id) {
		if(accountsList.containsKey(id)) {
			return accountsList.get(id);
		} else {
			Accounts failAccount = new Accounts();
			return failAccount;
		}
	}
	
	public String editAccount(int id, String firstName, String lastName, int accountNumber) {
		if(accountsList.containsKey(id)) {
			accountsList.get(id).setFirstName(firstName);
			accountsList.get(id).setLastName(lastName);
			accountsList.get(id).setAccountNumber(accountNumber);
			return Constants.ACCOUNT_EDITED_MESSAGE;
		} else {
			return Constants.INVALID_ID_MESSAGE;
		}
	}

	public int searchForAccountByName(String string) {
		return (int)accountsList.values().stream().filter(s -> s.getFirstName().equals(string)).count();
	}
} 
