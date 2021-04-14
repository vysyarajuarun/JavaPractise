class Nested_Loops
{
	public static void main(String[] args)
	{
		//int i = 1;
		// NOTE: Nesting of loops A complete cycle iteration of inner loop is a single iteration for the outer loop
		for(int i = 1; i<=5; i++)
		{
			for(int j= 1 ; j<=5; j++)
			{
				System.out.println("Value of i and j are : "+i+  "  and value of j is : "+j);
			}
			System.out.println("*****************");
		}		
	}
}