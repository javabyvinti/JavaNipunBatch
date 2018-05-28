class Primitive{

	public static void main(String value[])
	{
		int a = 10;
		int b = 20;
		int c = a;

		// reference datatype
		Integer a1 = new Integer(10);
		Integer b1 = new Integer(10);
		Integer c1 = new Integer(10);
		Integer d1 = b1;

		// == --> comparision operator 
		// always check the value in the primitive datatype
		// return true or false

		// always check the address in the reference datatype
		System.out.println(a1 == c1); // 888 == 777
		System.out.println(b1.equals(d1)); // 888 == 777
	}
}