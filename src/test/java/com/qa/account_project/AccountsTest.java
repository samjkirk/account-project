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
	
	@Before
	public void setUp() {
		testAccount1 = new Accounts("Sam", "Kirk", "0001");
		testAccount2 = new Accounts("Joe", "Bloggs", "0002");
		testAccount3 = new Accounts("Thelast", "Guy", "0003");
		testService.addAccount(0, testAccount1);
	}

	@Test
	public void testAddAccount() {
		assertEquals(Constants.ACCOUNT_ADDED_MESSAGE, testService.addAccount(1, testAccount2));
		assertEquals(Constants.INVALID_ID_MESSAGE, testService.addAccount(1, testAccount3));
		assertEquals(Constants.ACCOUNT_ADDED_MESSAGE, testService.addAccount(2, testAccount3));
	}
	
	@Test
	public void testGetAccount() {
		assertEquals(testAccount1.toString(), testService.getAccount(0));
		assertEquals(Constants.INVALID_ID_MESSAGE, testService.getAccount(4));
	}
	
	@Test
	public void testDeleteAccount() {
		assertEquals(Constants.ACCOUNT_DELETED_MESSAGE, testService.deleteAccount(0));
		assertEquals(Constants.INVALID_ID_MESSAGE, testService.deleteAccount(5));
	}
	
	@Test
	public void testEditAccount() {
		assertEquals(Constants.ACCOUNT_EDITED_MESSAGE, testService.editAccount(0, "thisis", "atest", "0004"));
		assertEquals(Constants.INVALID_ID_MESSAGE, testService.editAccount(1, "thisis", "atest", "0004"));
	}

}
