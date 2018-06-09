package com.vinti.oops;

import java.util.Scanner;

public class Shape {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		Rectangle rectangle = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your choice");
		System.out.println("Press 1 to draw Circle");
		System.out.println("Press 2 to draw Rectangle");
		
		int choice = scanner.nextInt();

		if(choice == 1) {
			
			System.out.println("Enter your radius");
			
			circle.setRadius(scanner.nextInt());
			System.out.println("Radius is = " + circle.getRadius());
			//int radius = scanner.nextInt();
					
			
			circle.radiusInput(scanner);
			//circle.drawCircle();
		}else {
			rectangle.drawRectangle();
		}
		
	}

}
