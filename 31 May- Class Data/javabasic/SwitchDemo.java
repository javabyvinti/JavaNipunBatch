package com.vinti.javabasic;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		// vowel and consonant
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your character value");
		
		// charAt(0)   --> char
		
		char userValue = scanner.next().toLowerCase().charAt(0);

		// int or char
		// java --> String --> "Mon"
		
		String day = "Mon";
		
		//boolean present = false;
		
		switch(userValue) { // switch(a)
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println("Vowel");
				break;
			default:
				System.out.println("Consonant");
				break;
		}
	}

}
