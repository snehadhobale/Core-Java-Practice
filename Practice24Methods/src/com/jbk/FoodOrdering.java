package com.jbk;

public class FoodOrdering {

	    public void placeOrder(String item, int quantity) {
	        double price = 200;
	        double total = price * quantity;

	        System.out.println("Item: " + item);
	        System.out.println("Quantity: " + quantity);
	        System.out.println("Total bill: Rs. " + total);
	    }

	   
	}


