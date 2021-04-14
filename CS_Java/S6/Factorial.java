class Factorial
{
	public static void main(String[] args)
	{
		int n = 5;
		int fact =1;
		System.out.println("Factorial of a given number is : ");
		for(int i=1;i<=n;i++)
		{
			fact = fact * i;
		}	 
		System.out.print(fact);
	}
}