package com.tka;

public class EmployeeMain {
	public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setEmployeeId(101);
        emp.setEmployeeName("Ram");
        emp.setAge(22);
        emp.setGender("Male");
        emp.setDepartment("IT");
        emp.setDesignation("Java Developer");
        emp.setSalary(45000);
        emp.setEmail("Ram@example.com");
        emp.setPhoneNumber("98734567895");
        emp.setCity("Pune");
        emp.setState("Maharashtra");
        emp.setCountry("India");
        emp.setJoiningDate("28-10-2026");
        emp.setEmploymentType("Full-Time");
        emp.setActive(true);

        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Gender: " + emp.getGender());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Email: " + emp.getEmail());
        System.out.println("Phone: " + emp.getPhoneNumber());
        System.out.println("City: " + emp.getCity());
        System.out.println("State: " + emp.getState());
        System.out.println("Country: " + emp.getCountry());
        System.out.println("Joining Date: " + emp.getJoiningDate());
        System.out.println("Employment Type: " + emp.getEmploymentType());
        System.out.println("Active: " + emp.getActive());
    }

}
