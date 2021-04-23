package com.junit.test.user;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class EmailValidateTest {
	@Parameters 
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true}, 		{"abc", false},
			{"abc-100@yahoo.com", true}, 	{".abc@.com.my", false}, 
			{"abc.100@yahoo.com", true}, 	{"abc123@gmail.a", false},
			{"abc111@abc.com", true},		{"abc()@gmail.com", false},
			{"abc-100@abc.net", true},		{"abc@%*.com", false},
			{"abc.100@abc.com.au", true}, 	{"abc..2002@gmail.com", false},
			{"abc@1.com", true},			{"abc.@gmail.com", false},
			{"abc@gmail.com.com", true},	{"abc@abc@gmail.com", false},
			{"abc+100@gamil.com", true},	{"abc@gmail.com.1a", false},
											{"abc@gmail.com.aa.au", false},
		});
	}
	private final String email;
	private final boolean expected;
	
	public EmailValidateTest(String email, boolean expected) {
		this.email = email;
		this.expected = expected;
	}
	@Test
	public void testEmail_shouldReturnExpected() {
		boolean isValidEmail = ValidateUser.isValidEmail(email);
		assertEquals(expected , isValidEmail);	
		}
}
