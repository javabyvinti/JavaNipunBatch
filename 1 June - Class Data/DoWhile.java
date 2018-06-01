package com.vinti.javabasic;

public class DoWhile {

	public static void main(String[] args) {

		// exit controlled
		
		int num = 11;
		
		do {
			System.out.println("start = " +num);
			num++;
		}while(num<=10); // 12<=10

		System.out.println("end = " + num);
	}
}