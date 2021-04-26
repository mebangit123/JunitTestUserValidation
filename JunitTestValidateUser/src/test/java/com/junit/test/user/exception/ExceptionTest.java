package com.junit.test.user.exception;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExceptionTest {
	//Test cases for firstname.
	@Test
	public void given_Invalid_FirstName_ShouldThrowException() {
		try {
			ValidateUserException.isValidFirstName("234");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDINVALID, e.type);
		}
	}
	@Test
	public void given_Null_ShouldThrowException() {
		try {
			ValidateUserException.isValidFirstName(null);
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDNULL, e.type);
		}
	}
	@Test
	public void given_Empty_ShouldThrowException() {
		try {
			ValidateUserException.isValidFirstName("");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDEMPTY, e.type);
		}
	}
	//Test cases for lastname.
	@Test
	public void given_Invalid_LastName_ShouldThrowException() {
		try {
			ValidateUserException.isValidLastName("234");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDINVALID, e.type);
		}
	}
	@Test
	public void Null_ShouldThrowException() {
		try {
			ValidateUserException.isValidLastName(null);
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDNULL, e.type);
		}
	}
	@Test
	public void given_Empty_LastName_ShouldThrowException() {
		try {
			ValidateUserException.isValidLastName("");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDEMPTY, e.type);
		}
	}
	//Test cases for user's email.
	@Test
	public void given_Invalid_email_ShouldThrowException() {
		try {
			ValidateUserException.isValidEmail("234");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDINVALID, e.type);
		}
	}
	@Test
	public void given_Null_email_ShouldThrowException() {
		try {
			ValidateUserException.isValidEmail(null);
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDNULL, e.type);
		}
	}
	@Test
	public void given_Empty_email_ShouldThrowException() {
		try {
			ValidateUserException.isValidEmail("");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDEMPTY, e.type);
		}
	}
	//Test cases for user's phoneNo.
	@Test
	public void given_Invalid_PhoneNo_ShouldThrowException() {
		try {
			ValidateUserException.isValidPhoneNo("234");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDINVALID, e.type);
		}
	}
	@Test
	public void given_Null_PhoneNo_ShouldThrowException() {
		try {
			ValidateUserException.isValidPhoneNo(null);
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDNULL, e.type);
		}
	}
	@Test
	public void given_Empty_PhoneNo_ShouldThrowException() {
		try {
			ValidateUserException.isValidPhoneNo("");
		} catch (CustomException e) {
			assertEquals(CustomException.ExceptionType.ENTEREDEMPTY, e.type);
		}
	}
	//Test cases for user's password.
		@Test
		public void given_Invalid_Password_ShouldThrowException() {
			try {
				ValidateUserException.isValidPassword("234");
			} catch (CustomException e) {
				assertEquals(CustomException.ExceptionType.ENTEREDINVALID, e.type);
			}
		}
		@Test
		public void given_Null_Password_ShouldThrowException() {
			try {
				ValidateUserException.isValidPassword(null);
			} catch (CustomException e) {
				assertEquals(CustomException.ExceptionType.ENTEREDNULL, e.type);
			}
		}
		@Test
		public void given_Empty_Password_ShouldThrowException() {
			try {
				ValidateUserException.isValidPassword("");
			} catch (CustomException e) {
				assertEquals(CustomException.ExceptionType.ENTEREDEMPTY, e.type);
			}
		}
}
