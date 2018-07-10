package com.qa.account_project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

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
		assertEquals("Account added", testService.addAccount(1, testAccount2));
		assertEquals("Invalid ID", testService.addAccount(1, testAccount3));
		assertEquals("Account added", testService.addAccount(2, testAccount3));
	}
	
	@Test
	public void testGetAccount() {
		assertEquals(testAccount1.toString(), testService.getAccount(0));
		assertEquals("Invalid ID", testService.getAccount(4));
	}
	
	@Test
	public void deleteAccount() {
		assertEquals("Account deleted", testService.deleteAccount(0));
		assertEquals("Invalid ID", testService.deleteAccount(5));
	}

}
