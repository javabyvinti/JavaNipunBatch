package com.vinti.oops;

public class Employee {

	String name; // instance variables
	int id;
	String companyName;
	int salary;
	
	// common value shareable among all objects
	Employee(){
		this(1000);
		companyName = "ABC PVT LTD";
	}
	
	Employee(String name, int id){
		// local scope 
		// local variable
		// this--> when the name of your local variable
		// and instance variable is same then use this keyword
		this();	// constructor calling 
		// this --> constructor calling must be first statement
		// constructor chaining
		this.name = name;
		this.id = id;
	}
	
	Employee(int salary){
		this.salary = salary;
	}
	
	
	
	void print() {
		System.out.println("Company Name is = " + companyName);
		System.out.println("Name is = " + name);
		System.out.println("Id is = " + id);

		System.out.println("Salary is = " + salary);
		attendance();
	}
	
	void attendance() {
		System.out.println("attendance is 50 %");
	}
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Mohan", 10002);
		emp1.print();
			
		Employee emp2 = new Employee("Ram", 1001);
		emp2.print();
		
	}
}
