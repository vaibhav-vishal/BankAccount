package com.training.domain;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount test = null;

	@Test
	public void testNotNull() {
		try {
			test = new BankAccount(10001, "vaibhav", 200000L);
		} catch (RuntimeException e) {
			fail("Name cant be null");
		}

	}

	@Test
	public void testValueCheck() {
		test = new BankAccount(10001, "vaibhav", 200000L);
		assertEquals(10001, test.getAccountNumber());
		assertEquals("vaibhav", test.getAccountHolderName());
		assertEquals(200000L, test.getBalance());
	}
}
