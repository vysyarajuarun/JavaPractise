class Pattern
{
	public static void main(String[] args)
	{
		//int i = 1, j = 1;
		
		for(int i = 1; i <= 5 ; i++)
		{
			for(int j = 1;j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		System.out.println(" ------------------------------------------------- ");
		for(int a = 1; a<= 5; a++)
		{
			for(int b=5 ; b>=a ; b--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		System.out.println(" ------------------------------------------------- ");
		
		for(int k = 1; k<=5; k = k+1)
		{
			for(int l = 1 ; l<= 5; l = l+2)
			{
				System.out.print(" @ ");
			}
			System.out.println(" ");
		}
		
	}
}