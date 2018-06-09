package com.vinti.oops;

public class Student {

	// Single Repository
	
	public static void main(String[] args) {
		
		ClassDemo1 ram = new ClassDemo1();
	
//		System.out.println(obj.name);
//		System.out.println(obj.rollno);
		ram.name = "Ram";
		ram.rollno = 1;
		ram.print();

		ClassDemo1 mohan = new ClassDemo1();
		
		mohan.name = "Mohan";
		mohan.rollno = 2;
		mohan.print();
		ram.print();
	
		ClassDemo2 obj = new ClassDemo2();
		obj.input();
		obj.print();
		
	
	}

}
