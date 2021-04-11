class Arithmetic_Operators
{
	public static void main(String[] args)
	{
		System.out.println("Assignment Operators");
		int x = 5;
		x = x + 3;
		System.out.println("1. Value of x is "+x);

		x += 4; // x= x+ 4
		System.out.println("2. Value of x is "+x);

		x -= 3; // x= x-3
		System.out.println("3. Vlaue of x is "+x);
	
		x *=3; //  x= x*3;
		System.out.println("4. Value of x is "+x);

		x /=3;  // x= x/3;
		System.out.println("5. Value of x is "+x);

		x %=3; // x = x%3;
		System.out.println("6. Value of x is "+x);

		x &=3;  // x= x&3;
		System.out.println("7. Value of x is "+x);
	
		x |=3;  // x = x|3;
		System.out.println("8. Value of x is "+x);
		
		x ^=3;  // x = x^3;
		System.out.println("9. Value of x is "+x);

		x >>= 3; // x = x>>=3;
		System.out.println("10. Value of x is "+x);

		x <<=3;  // x = x<<=3;
		System.out.println("11. Value of x is "+x);
		
		
	}
}