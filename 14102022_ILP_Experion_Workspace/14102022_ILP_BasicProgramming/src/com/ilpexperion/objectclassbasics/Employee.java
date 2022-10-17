package com.ilpexperion.objectclassbasics;

public class Employee {

	String empName="Saranya";
	int employeeAge = 22;
	char employeeGender ='F';
	double employeeCgpa =8.1;
	
	public void displayEmployeeDetails()
	{
		System.out.println("********* Welcome to ILP Program Day 1 ***********");
		System.out.println("Name        Age        Gender      CGPA");
		System.out.println(empName+"      "+employeeAge+"        "+employeeGender+"            "+employeeCgpa);
	}
}
