public class TYPE_CASTING
{
	public static void main (String[] args)
	{	
		//TYPE CASTING --> Connversion of one data type to other.

		//NOTE : This is Implicit Type Casting
		Short x = 5;
		int y =	x;
		System.out.println(y);

		/*
		int b =10;
		Short a = b;
		System.out.println(a);  //Unable to print b because type mismatch unable to convert int to short
		*/

		/*
		IN JAVA TYPE CASTING IS CLASSIFIED INTO TWO TYPES :--> 
		IMPLICIT CASTING(WIDENING)

		Integer type						Floating Type
		Byte-->Short --> Int --> Long    --> Float --> Double

		EXPLICIT TYPECASTING (NARROWING)

		Double--> Float --> Long --> Int --> Short --> Byte   ...-> 
		*/
		
		/*
		int a = 10;
		Short b = (Short)a;
		System.out.println(b);
		*/
		

		

	}
}