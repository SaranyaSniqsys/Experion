package com.experion.entity;

import java.util.Scanner;

public class Product {

	String productCode;
	String productName;
	String productDescription;
	double productPrice;
	String quality;
	String validityDate;
	String expiryDate;
	boolean active;
	
	
	public void inputProductDetails()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter product code");
		String productCode = scanner.nextLine();
		System.out.println("Enter product name");
		String productName = scanner.nextLine();
		System.out.println("Enter product description");
		String productDescription = scanner.nextLine();
		System.out.println("Enter product productPrice");
		double productPrice = scanner.nextDouble();
		System.out.println("Enter product quality");
		String quality = scanner.nextLine();
		System.out.println("Enter product validity date");
		String productValidityDate = scanner.nextLine();
		System.out.println("Enter product expiry date");
		String productExpiryDate = scanner.nextLine();
		System.out.println("Enter Active or not");
		boolean isActive = scanner.nextBoolean();
	}
	public void displayDetails()
	{
		
	System.out.println("Product Code         Product Name     Description      Price   Quality      Validity Date      Expiry Date     Active");
	System.out.println(productCode+"     "+productName+"      "+productDescription+"      "+productPrice+"     ");
	}

}
