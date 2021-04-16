/* NOTE : 
		1.This is two dimensional.
		2.Should not forget syntax and proper declaration of variables;
		3.Should declare variables dynamically.
		
	Important points in loop
		1. initialization and condition are most importantant things.
		2. In nested loop iteration flow is important.
		
*/
class All_Pattern
{    
	/*1.  Program to print pattern
		*
		* *
		* * *
		* * * *
		* * * * * 
	*/
	public static void main(String[] args)
	{	
		int n =5;
		for(int i = 1; i <= n ; i++)
		{
			for(int j = 1;j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}

class Pattern_2
{
	/* Program to print pattern
		* * * * *
		* * * *
		* * *
		* *
		*  
	*/
	public static void main(String[] args)
	{
		int n = 5;
		for(int a = 1; a<= n; a++)
		{
			for(int b=5 ; b>=a ; b--)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}		
	}
}

class Pattern_3
{
	public static void main(String[] args)
	{
		int n = 5;
		for(int i =1 ; i<=n; i++)
		{
				for(int j =1 ;j<= n-i; j++)
			{
				System.out.print(" - ");
			}
			//for(int k=i;k>=1;k--)
			for(int k = 1;k<= i;k++)		
			{
				//System.out.print(" "+i+ " ");		// 1
				System.out.print(" "+k+ " ");		//2
			}
			System.out.println(" ");
		}	
	}
}

class Pattern_4
{
	public static void main(String[] args)
	{
		int n =5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(" "+i+ " ");
				//System.out.print(" "+j+ " ");
			}
			System.out.println(" ");
		}
	}
}
