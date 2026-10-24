package com.jbk;

public class LibrarySystem {
	
	    void issueBook(String bookName, boolean isAvailable) {
	        if (isAvailable) {
	            System.out.println(bookName + " issued successfully");
	        } else {
	            System.out.println(bookName + " is not available");
	        }
	    }
}
