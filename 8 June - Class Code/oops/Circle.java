package com.vinti.oops;

import java.util.Scanner;

public class Circle {
	
	// default --> inside the package
	private int radius;	// instance variable

	// setter
	public void setRadius(int rd) {
		if(rd >0) {
			radius = rd;
		} else {
			System.out.println("Radius cannot be negative");
		}
	}
	
	// getter
	public int getRadius() {
		return radius;
	}
	
	
	void radiusInput(Scanner sc) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter your radius");
//		int rd = sc.nextInt();
		
//		if(rd >0) {
//			radius = rd;	
//			drawCircle();
//		}else {
//			System.out.println("Radius cannot be negative");
//		}
	}
	
	void drawCircle() {
		System.out.println("Draw Circle with Radius = " + radius);
	}
	
}
