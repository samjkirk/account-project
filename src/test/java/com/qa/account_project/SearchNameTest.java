package com.qa.account_project;

import org.junit.Assert;
import org.junit.Test;
import com.qa.accounts.Accounts;
import com.qa.service.Service;


public class SearchNameTest {
	Accounts account1;
	Accounts account2;
	Accounts account3;
	Accounts account4;
	Service service = new Service();

	@Test
	public void test() {
		account1 = new Accounts("Sam", "Kirk", 1001);
		account2 = new Accounts("Joe", "Bloggs", 1002);
		account3 = new Accounts("Sam", "Notkirk", 1003);
		account4 = new Accounts("Mike", "Lastname", 1004);
		service.addAccount(account1.getAccountNumber(), account1);
		service.addAccount(account2.getAccountNumber(), account2);
		service.addAccount(account3.getAccountNumber(), account3);
		service.addAccount(account4.getAccountNumber(), account4);
		int actualResult = service.searchForAccountByName("Sam");
		Assert.assertEquals(2, actualResult);
	}
}
