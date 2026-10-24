package com.jbk;

public class PasswordChecker {
	
	    String checkPassword(String password) {
	        boolean upper = false;
	        boolean lower = false;
	        boolean digit = false;
	        boolean special = false;

	        for (int i = 0; i < password.length(); i++) {
	            char ch = password.charAt(i);

	            if (Character.isUpperCase(ch)) {
	                upper = true;
	            } else if (Character.isLowerCase(ch)) {
	                lower = true;
	            } else if (Character.isDigit(ch)) {
	                digit = true;
	            } else {
	                special = true;
	            }
	        }

	        if (password.length() >= 8
	                && upper && lower && digit && special) {
	            return "Strong";
	        }

	        return "Weak";
	    }

}
