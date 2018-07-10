package com.qa.account_project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import com.qa.constants.*;
import com.qa.accounts.Accounts;
import com.qa.service.Service;

public class AccountsTest {
	Service testService = new Service();
	Accounts testAccount1;
	Accounts testAccount2;
	Accounts testAccount3;
	Accounts failAccount = new Accounts();
	
	@Before
	public void setUp() {
		testAccount1 = new Accounts("Sam", "Kirk", 1001);
		testAccount2 = new Accounts("Joe", "Bloggs", 1002);
		testAccount3 = new Accounts("Thelast", "Guy", 1003);
		testService.addAccount(testAccount1.getAccountNumber(), testAccount1);
	}

	@Test
	public void testAddAccount() {
		assertEquals(Constants.ACCOUNT_ADDED_MESSAGE, testService.addAccount(testAccount2.getAccountNumber(), testAccount2));
		assertEquals(Constants.INVALID_ID_MESSAGE, testService.addAccount(testAccount2.getAccountNumber(), testAccount3));
		assertEquals(Constants.ACCOUNT_ADDED_MESSAGE, testService.addAccount(testAccount3.getAccountNumber(), testAccount3));
	}
	
	@Test
	public void testGetAccount() {
		assertEquals(testAccount1, testService.getAccount(0));
		assertEquals(failAccount, testService.getAccount(4));
	}
	
	@Test
	public void testDeleteAccount() {
		assertEquals(Constants.ACCOUNT_DELETED_MESSAGE, testService.deleteAccount(testAccount1.getAccountNumber()));
		assertEquals(Constants.INVALID_ID_MESSAGE, testService.deleteAccount(5));
	}
	
	@Test
	public void testEditAccount() {
		assertEquals(Constants.ACCOUNT_EDITED_MESSAGE, testService.editAccount(testAccount1.getAccountNumber(), "thisis", "atest", 1004));
		assertEquals(Constants.INVALID_ID_MESSAGE, testService.editAccount(1, "thisis", "atest", 1004));
	}

}
