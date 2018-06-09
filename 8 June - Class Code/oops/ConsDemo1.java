package com.vinti.oops;

public class ConsDemo1 {

	// Instance variable --> initialized with default value
	// created outside any method or constructor are instance variables
	int rollno;
	String name;
	
//	ConsDemo1(){
//		System.out.println("Default cons is called = " + name);
//	}
	
	// constructor overloading
	ConsDemo1(int value){
		System.out.println("Parameterized cons " + value);
	}
	
	public static void main(String[] args) {
		
		// by default, default constructor is available
				
		ConsDemo1 obj = new ConsDemo1(65);
		ConsDemo1 obj2 = new ConsDemo1(76);
		
	}
}