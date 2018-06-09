package com.vinti.inheritance;

class Bank{
	
	void deposit() {
		System.out.println("Deposit Amount");
	}
	void withdraw() {
		System.out.println("withdraw Amount");
	}	
	void balCheck() {
		System.out.println("Check Amount");
	}
}

class HDFC extends Bank{
	
	void callParent() {
		withdraw();
		balCheck();	
	}	
}

public class Inheritance1 {

	public static void main(String[] args) {
		HDFC hdfc = new HDFC();
		hdfc.callParent();

	}

}
