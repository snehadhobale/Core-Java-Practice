package com.jbk;

public class GradeCalculator {
	
	public String getGrade(int marks) {
		if(marks < 0 || marks > 100) {
			return "Invalid marks";
		}else if(marks >= 90) {
			return "A";
		}else if(marks >= 75) {
			return "B";
		}else if(marks >= 60) {
			return "C";
		}else if(marks >= 35) {
			return "D";
		}else {
			return "F";
			
		}
	}

}
