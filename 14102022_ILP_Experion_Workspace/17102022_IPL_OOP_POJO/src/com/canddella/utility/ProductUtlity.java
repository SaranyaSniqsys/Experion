package com.canddella.utility;

import java.util.Scanner;

import com.experion.entity.Product;
import com.experion.service.Service;

public class ProductUtlity {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Service service = new Service();
		service.inputProductDetails();
		service.displayDetails();

	}

}
