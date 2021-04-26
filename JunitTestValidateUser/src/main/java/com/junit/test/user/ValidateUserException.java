package com.junit.test.user.exception;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.junit.test.user.exception.CustomException.ExceptionType;

public final class ValidateUserException {
	// HandlingCustom Exception for user's FirstName.
	public static void isValidFirstName(String firstName) throws CustomException{
			String fnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
			Pattern pat = Pattern.compile(fnameRegex);
			try {
				if(firstName.length() == 0) {
					throw new CustomException(ExceptionType.ENTEREDEMPTY, "Empty argument");
				}
				Matcher m = pat.matcher(firstName);
				if(m.matches())
					System.out.println("Pattern Match");
				else
					throw new CustomException(ExceptionType.ENTEREDINVALID, "Enter a valid firstname");
			}catch(NullPointerException e) {
				throw new CustomException(ExceptionType.ENTEREDNULL, "Null value was encountered");
		}
	}
	// Handling Custom Exception for user's LastName.
	public static void isValidLastName(String lastName) throws CustomException{
			String lnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
			Pattern pat = Pattern.compile(lnameRegex);
			try {
				if(lastName.length() == 0) {
					throw new CustomException(ExceptionType.ENTEREDEMPTY, "Empty argument");
				}
				Matcher m = pat.matcher(lastName);
				if(m.matches())
					System.out.println("Pattern Match");
				else
					throw new CustomException(ExceptionType.ENTEREDINVALID, "Enter a valid lastname");
			}catch(NullPointerException e) {
				throw new CustomException(ExceptionType.ENTEREDNULL, "Null value was encountered");
		}
	}
	//Handling custom exception for user's email.
	public static void isValidEmail(String email) throws CustomException{
			String emailRegex = "^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@{1}[A-Za-z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3}){0,1}$";
			Pattern pat = Pattern.compile(emailRegex);
			try {
				if(email.length() == 0) {
					throw new CustomException(ExceptionType.ENTEREDEMPTY, "Empty argument");
				}
				Matcher m = pat.matcher(email);
				if(m.matches())
					System.out.println("Pattern Match");
				else
					throw new CustomException(ExceptionType.ENTEREDINVALID, "Enter a valid email");
			}catch(NullPointerException e) {
				throw new CustomException(ExceptionType.ENTEREDNULL, "Null value was encountered");
		}
	}
	//Handling custom exception for user's phoneNo.
	public static void isValidPhoneNo(String phoneNo) throws CustomException{
		String phoneRegex = "^[0-9]{2}[\\s][1-9][0-9]{9}$";
			Pattern pat = Pattern.compile(phoneRegex);
			try {
				if(phoneNo.length() == 0) {
					throw new CustomException(ExceptionType.ENTEREDEMPTY, "Empty argument");
				}
				Matcher m = pat.matcher(phoneNo);
				if(m.matches())
					System.out.println("Pattern Match");
				else
					throw new CustomException(ExceptionType.ENTEREDINVALID, "Enter a valid phoneNo");
			}catch(NullPointerException e) {
				throw new CustomException(ExceptionType.ENTEREDNULL, "Null value was encountered");
		}
	}
	//Handling custom exception for user's password.
	public static void isValidPassword(String password) throws CustomException{
		String passRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
			Pattern pat = Pattern.compile(passRegex);
			try {
				if(password.length() == 0) {
					throw new CustomException(ExceptionType.ENTEREDEMPTY, "Empty argument");
				}
				Matcher m = pat.matcher(password);
				if(m.matches())
					System.out.println("Pattern Match");
				else
					throw new CustomException(ExceptionType.ENTEREDINVALID, "Enter a valid password");
			}catch(NullPointerException e) {
				throw new CustomException(ExceptionType.ENTEREDNULL, "Null value was encountered");
		}
	}
}

class CustomException extends Exception{
	enum ExceptionType {
		ENTEREDNULL, ENTEREDEMPTY, ENTEREDINVALID
	}
	ExceptionType type;
	public CustomException(ExceptionType type, String message) {
		super(message);
		this.type = type;
	}
}