package com.vinti.javabasic;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		// 123  --> 1 + 2 + 3 --> 6
		// reverse of number
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first value");
		int userChoice = sc.nextInt();
		int sum = 0, rem = 0;
		
		while(userChoice>0) {
			rem = userChoice % 10;
			sum = sum + rem;	// 0 + 3 = 3
			userChoice = userChoice / 10;
		}
		
		System.out.println("Sum of digit is = " + sum);
		
	}

}








