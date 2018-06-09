package com.vinti.inheritance;


class Add{
	
	int first = 50;
	int second = 50;
	
	void add() {
		System.out.println(first + second);
	}
	
	/*int add() {
		return first + second;
	}*/
	
	void add(int first , int second) {
		System.out.println(first + second);
	}
	
	void add(float first, float second) {
		System.out.println(first + second);
	}
	
	long add(long first, long second, long third) {
		return first+second+third;
	}
}


public class Overloading {

	public static void main(String[] args) {
		
		Add obj = new Add();
		obj.add();
		obj.add(10, 90);
		obj.add(12.5f,  12);
		long value = obj.add(1,2,3);
		System.out.println(value); 
		
		System.out.println(obj.add(10, 10, 10));

	}

}
