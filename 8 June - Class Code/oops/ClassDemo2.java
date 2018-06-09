package com.vinti.oops;

import java.util.Scanner;

public class ClassDemo2 {

	String studName;
	int studRollno;

	void input() {
		
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter your name");
		studName = scanner.next();
	
		System.out.println("Enter your Rollno");
		studRollno = scanner.nextInt();
	
	
	}
	
	void print() {
		System.out.println("Name is = " + studName);
		System.out.println("Rollno is = " + studRollno);
	}
	
	public static void main(String[] args) {

		ClassDemo2 obj = new ClassDemo2();
		obj.input();
		obj.print();

	}

}
