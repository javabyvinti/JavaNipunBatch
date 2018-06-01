package com.vinti.javabasic;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		
		// 5 --> 5 X 1 = 5 ... 5 X 10 = 50

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your number");
		
		int num = scanner.nextInt();
		int i = 1;
		//int result = 0;
				
		while(i<=10) {
			//result = num * i;
			System.out.println(num + " X " + i + " = " + num * i);
			i++;
		}
		
	}

}
