package com.jbk;

public class RideBooking {

	    double calculateFare(double distance) {
	        if (distance < 0) {
	            return -1;
	        }

	        return distance * 15;
	    }

}
