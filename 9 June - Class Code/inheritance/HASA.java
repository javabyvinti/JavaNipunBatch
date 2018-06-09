package com.vinti.inheritance;

class Bank1{
	
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

class HDFC1{
	
	void callParent() {
		Bank1 obj = new Bank1();
		obj.withdraw();
		obj.balCheck();
	}
}

public class HASA {

	public static void main(String[] args) {
		
		HDFC1 obj = new HDFC1();
		obj.callParent();
	}

}
