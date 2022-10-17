package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class ExperionEmployeeDetails {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String empName;
		int employeeAge ;
		char employeeGender ;
		double employeeCgpa ;
		System.out.println("Enter employee name");
		empName= scanner.nextLine();
		System.out.println("Enter employee age");
		employeeAge= scanner.nextInt();
		System.out.println("Enter employee gender");
		employeeGender=scanner.next().charAt(0);
		System.out.println("Enter employee cgpa");
		employeeCgpa=scanner.nextDouble();
		System.out.println("*******Welcome to ILP **********");
		System.out.println("Name        Age        Gender      CGPA");
		System.out.println(empName+"      "+employeeAge+"        "+employeeGender+"            "+employeeCgpa);
	}

}
