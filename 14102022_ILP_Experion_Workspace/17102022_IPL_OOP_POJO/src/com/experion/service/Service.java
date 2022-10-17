package com.experion.service;

import java.util.Scanner;

import com.experion.entity.Product;

public class Service {
	
	public void inputProductDetails() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter product code");
	String productCode = scanner.nextLine();
	product.setProductCode(productCode);
	System.out.println("Enter product name");
	String productName = scanner.nextLine();
	product.setProductName(productName);
	System.out.println("Enter product description");
	String productDescription = scanner.nextLine();
	product.setProductDescription(productDescription);
	System.out.println("Enter product productPrice");
	double productPrice = scanner.nextDouble();
	product.setProductPrice(productPrice);
	System.out.println("Enter product open date");
	String openDate = scanner.nextLine();
	product.setOpenDate(openDate);
	System.out.println("Enter product validity date");
	String productValidityDate = scanner.nextLine();
	product.setValidityDate(productValidityDate);
	System.out.println("Enter product expiry date");
	String productExpiryDate = scanner.nextLine();
	product.setExpiryDate(productExpiryDate);
	System.out.println("Enter Active or not");
	boolean isActive = scanner.nextBoolean();
	product.setActive(isActive);
	Product product = new Product(productCode,productName,productDescription,productPrice,openDate,
			productValidityDate,productExpiryDate,isActive);
}

public void displayDetails() {

	System.out.println(
			"Product Code         Product Name     Description      Price   Open date      Validity Date      Expiry Date     Active");
	System.out.println(product.getProductCode() + "     " + product.getProductName() + "      " + product.getProductDescription() + "      " + product.getProductPrice()
			+ "     "+product.getOpenDate()+"     "+product.getValidityDate()+"     "+product.getExpiryDate()+"     "+product.isActive());
}
}
