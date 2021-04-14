public class Modulus_Operator     
// Modulus operator is used to store the remainder
{
	public static void main(String[] args)
	{
		int  i = 10/3;
		System.out.println(i);
		
		double d = 15.3 / 2;
		System.out.println(d);
		
		double d1 = 73.2%4;
		System.out.println(d1);
		
		int p = 15;
		//System.out.print("Enter a number :"+p);
		if(p%2 == 0)
		{
			System.out.println("It is even number");
		}
		else
		{
			System.out.println("It is odd number");
		}
	}
}