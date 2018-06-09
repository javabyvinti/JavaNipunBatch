package com.vinti.oops;

import java.util.Scanner;

public class ResultSheet {

	public static void main(String[] args) {
		
		MCAStudent ram = new MCAStudent();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		ram.setName(scanner.nextLine());
		
		System.out.println("Name is = " + ram.getName());
		
		System.out.println("Enter your phone number");
		
		ram.setPhn(scanner.nextLong());
		
		System.out.println("Phone no. is = " + ram.getPhn());
		
		System.out.println("Result is = 65.87%");
		
	}

}
