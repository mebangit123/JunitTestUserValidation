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
	
	@Test
	public void testEmail_shouldReturnTrue() {
		String email = "meban23@abc.okj";
		boolean isValidEmail = ValidateUser.isValidEmail(email);
		assertTrue(isValidEmail);
	}
	@Test
	public void testEmail_shouldReturnFalse() {
		String email = "Nong";
		boolean isValidEmail = ValidateUser.isValidEmail(email);
		assertFalse(isValidEmail);
	}
	@Test
	public void testPhoneNo_shouldReturnTrue() {
		String phoneNo = "23 7895436524";
		boolean isValidPhoneNo = ValidateUser.isValidPhoneNo(phoneNo);
		assertTrue(isValidPhoneNo);
	}
	@Test
	public void testPhoneNo_shouldReturnFalse() {
		String phoneNo = "Nong";
		boolean isValidPhoneNo = ValidateUser.isValidPhoneNo(phoneNo);
		assertFalse(isValidPhoneNo);
	}
	@Test
	public void testpassWord_shouldReturnTrue() {
		String password = "Nong";
		boolean isValidPwd = ValidateUser.isValidPassword(password);
		assertTrue(isValidPwd);
	}
	@Test
	public void testpassWord_shouldReturnFalse() {
		String password = "Nong";
		boolean isValidPwd = ValidateUser.isValidPassword(password);
		assertFalse(isValidPwd);
	}
}
	