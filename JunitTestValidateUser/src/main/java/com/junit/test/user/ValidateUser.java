package com.junit.test.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ValidateUser {
	
	private ValidateUser() {
		
	}
	
	public static boolean isValidFirstName(String firtName) {
		boolean valid = false;
		String fnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern pat = Pattern.compile(fnameRegex);
		Matcher m = pat.matcher(firtName);
		if(m.matches())
		valid = true;
		
		return valid;
	}
	
	public static boolean isValidLastName(String lastName) {
		boolean valid = false;
		String lnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
		Pattern pat = Pattern.compile(lnameRegex);
		Matcher m = pat.matcher(lastName);
		if(m.matches())
		valid = true;
		
		return valid;
	}

}
