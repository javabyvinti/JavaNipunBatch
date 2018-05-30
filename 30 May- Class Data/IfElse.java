class IfElse{

	public static void main(String args[]){

		int num = 10;
		
		boolean ans = true;

		if(num == 10){
			System.out.println("Greater than 1");
		}else{
			System.out.println("Smaller than 1");
		}
		

		String name = "Ram";	//--> char[10] = {'R', 'a', 'm'};

		int age = 34;

		if(name == "Ram" && age==34){
			System.out.println("Valid");
		} else{
			System.out.println("InValid");

		}		


	}
}