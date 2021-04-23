package com.junit.test.user;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidationUnitTest {
	@Test
	public void testFirstName_shouldReturnTrue() {
		String firstName = "Meban";
		boolean isValidFirstName = ValidateUser.isValidFirstName(firstName);
		assertTrue(isValidFirstName);
	}
	@Test
	public void testFirstName_shouldReturnFalse() {
		String firstName = "Meban@";
		boolean isValidFirstName = ValidateUser.isValidFirstName(firstName);
		assertFalse(isValidFirstName);
	}
	
	@Test
	public void testLastName_shouldReturnTrue() {
		String lastName = "Nong";
		boolean isValidLastName = ValidateUser.isValidFirstName(lastName);
		assertTrue(isValidLastName);
	}
	@Test
	public void testLastName_shouldReturnFalse() {
		String lastName = "N@";
		boolean isValidLastName = ValidateUser.isValidFirstName(lastName);
		assertFalse(isValidLastName);
	}
}
