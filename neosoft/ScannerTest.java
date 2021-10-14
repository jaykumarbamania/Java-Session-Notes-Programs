package com.neosoft;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your Name");
		String name = input.nextLine();
		
		
//		double salary = input.nextDouble();
		
		System.out.println("Enter Your age");
		int age = input.nextInt();
		
		
		//Convert into specific type
		
		System.out.println("Enter your Age");
		String txtAge = input.nextLine();
		int intAge = Integer.parseInt(txtAge);
		System.out.println("You born");

	}

}
