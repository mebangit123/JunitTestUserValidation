package com.junit.test.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ValidateUser {
	
	private ValidateUser() {
		
	}
	
	public static boolean isValidFirstName(String firtName) {
		String fnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern pat = Pattern.compile(fnameRegex);
		Matcher m = pat.matcher(firtName);
		return(m.matches());
	}
	
	public static boolean isValidLastName(String lastName) {
		String lnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern pat = Pattern.compile(lnameRegex);
		Matcher m = pat.matcher(lastName);
		return(m.matches());
		
	}
	
	public static boolean isValidEmail(String email) {
		
		String emailRegex = "^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@[A-Za-z0-9]+.[a-zA-Z]{2,3}([.][a-zA-Z]{2})*$";
		Pattern pat = Pattern.compile(emailRegex);
		Matcher m = pat.matcher(email);
		return(m.matches());
		
	}

}
