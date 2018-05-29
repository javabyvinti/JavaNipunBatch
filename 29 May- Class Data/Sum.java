class Sum{

	// java 1.5 

	static public void main(String... value)
	{
		//one datatype into another datatype Wrapper classes

		int firstNo = Integer.parseInt(value[0]); // 56
		int secondNo = Integer.parseInt(value[1]); // "90"
		int result = firstNo + secondNo;

		System.out.println("Result = " + result);  

	}
}