package com.vinti.inheritance;

abstract class Account{
	
	void balCheck()
	{
		System.out.println("Check your balance");
	}
	
	void amtWithdraw() {
		System.out.println("Withdraw amount");
	}
	
	void amtDeposit() {
		System.out.println("Deposit amount");
	}
				// body less method or generic method
	abstract void rateOfInterest(); // abstraction
	
}


class SavingAccount extends Account{
	
	int accNo = 120043;
	
	void rateOfInterest() {
		System.out.println(accNo + accNo);
	}
	
}


class CurrentAccount extends Account{
	void rateOfInterest() {
		System.out.println("6%");
	}
}

public class Inheritance3 {

	public static void main(String[] args) {
		CurrentAccount obj = new CurrentAccount();
		obj.rateOfInterest();
		
	}

}
