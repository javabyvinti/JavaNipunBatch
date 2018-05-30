import java.util.Scanner;

class VowelCons{

	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter your character");
		char uservalue = sc.next().charAt(0);

			// char [] = {'r',  'a', 'm'}

			//String -->  charAt(index) --> char


		if(uservalue == 'a' || uservalue == 'e' || uservalue == 'i'
			|| uservalue == 'o' || uservalue =='u')

		{
			System.out.println("Vowel");

		} else{

			System.out.println("Consonant");

		}


	}
}