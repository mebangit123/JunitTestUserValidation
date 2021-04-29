package com.validate.user.lambda;
import java.util.function.Predicate;

public class LambdaValidateUser {

	public static void main(String[] args) {
	 isValidFirstName();
	 isValidLastName();
	 isValidEmail();
	 isValidPhoneNo();
	 isValidPassWord();
	}
	
	public static boolean checkValidOrInvalid(String data, Predicate<String> predicate) {
		return predicate.test(data) ;
	}
	public static void isValidFirstName() {
		boolean isValid = checkValidOrInvalid("Meban", (String check) -> {
			String fnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
			return check.matches(fnameRegex);
		});
		System.out.println("FirstName is: "+ isValid);	
	}
	public static void isValidLastName() {
		boolean isValid = checkValidOrInvalid("Meban", (String check) -> {
			String lnameRegex = "^[A-Z]{1}[a-zA-Z]{2,}$";
			return check.matches(lnameRegex);
		});
		System.out.println("LastName is: "+ isValid);	
	}
	private static void isValidEmail() {
		boolean isValid = checkValidOrInvalid("meban@gmail.com", (String check) -> {
			String emailRegex = "^[0-9A-Za-z]+([._+-][0-9a-zA-Z]+)*@{1}[A-Za-z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3}){0,1}$";
			return check.matches(emailRegex);
		});
		System.out.println("Email is: "+ isValid);
	}
	private static void isValidPassWord() {
		boolean isValid = checkValidOrInvalid("jkh767", (String check) -> {
			String passRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$";
			return check.matches(passRegex);
		});
		System.out.println("Password is: "+ isValid);
	}
	private static void isValidPhoneNo() {
		boolean isValid = checkValidOrInvalid("h787g76", (String check) -> {
			String phoneRegex = "^[0-9]{2}[\\s][1-9][0-9]{9}$";
			return check.matches(phoneRegex);
		});
		System.out.println("PhoneNo is: "+ isValid);
	}
}