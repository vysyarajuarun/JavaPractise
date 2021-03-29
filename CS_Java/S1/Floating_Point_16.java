public class Floating_Point_16
{
	public static void main (String[] args)
	{
		
		int value = 9;
		float value1 = 9;
		double value2 = 9;

		System.out.println("value of int is = " + value);
		System.out.println("value1 of int is = " + value1);
		System.out.println("value2 of int is = " + value2);
	

		
		int value3 = 9;
		float value4 = 9f;
		double value5= 9d;

		System.out.println("value3 of int is = " + value3);
		System.out.println("value4 of int is = " + value4);
		System.out.println("value5 of int is = " + value5);
		

		
		int value6 = 9/2;  // Decimal point is truncated in case of integer
		float value7 = 9f/2f;
		double value8 = 9d/2f;

		System.out.println("value6 of int is = " + value6);
		System.out.println("value7 of int is = " + value7);
		System.out.println("value8 of int is = " + value8);
		

		int value9 = 9;
		float value10 = 10f/6f;   //Precision of the double value is much higher compared to float i.e is 16 digits for double and 8 digits for float
		double value11 = 10d/6d;

		System.out.println("value9 of int is = " + value9);
		System.out.println("value10 of int is = " + value10);
		System.out.println("value11 of int is = " + value11);

		Floating_Point_16.sprint();
		Floating_Point_16 fp = new Floating_Point_16();
		fp.iprint();
		//fp.sprint();
	}

	public static void sprint()
	{
		System.out.println("Program complete - sprint");
	}

	public void iprint()
	{
		System.out.println("Program complete - iprint");
	}
}