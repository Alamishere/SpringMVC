package com.in28minutes.jee;

public class UserValidationService {
	public boolean validateUser(String user, String password) {
		return user.equalsIgnoreCase("in28Minutes") && password.equals("dummy");
	}

}