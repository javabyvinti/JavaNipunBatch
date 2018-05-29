import java.lang.*;
import java.util.Scanner;


class ScannerDemo1{

	// java 1.5 

	static public void main(String... value)
	{

		// Step-1: create an instance of Scanner class

		Scanner sc = new Scanner(System.in);	

		System.out.println("Enter your first value");
		int firstNo = sc.nextInt(); 


		System.out.println("Enter your second value");
		int secondNo = sc.nextInt();
		int result = firstNo + secondNo;

		System.out.println("Result = " + result);  

	}
}