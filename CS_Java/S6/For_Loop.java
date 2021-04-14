// CS_JAVA  - Video 43
class For_Loop      // To repeat set of statements to repeat specific set of times.
{	
	public static void main(String[] args)
	{
		// Suppose we need to print 10 numbers 
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);		// Imagine if we need to print 1000 lines it would be difficult and to change information also
			System.out.println(7);      // To overcome this problem we need loops to 
		
		int i = 1;						// Types of declaration and initialization of  loops
		for(i = 1;i<=10;i++) 			// int i = 1 is initialization , condition part , increment or decrement
		{
			System.out.println(i); 
		}
		int j = 1;
		for(j=10;j>=1;j--)
		{
			System.out.println(j);
		}
	
		
		int k = 50;
		for(; k >= 1 ; k--)
		{
			System.out.print("Value of k is:   ");
			System.out.println(k);
		}
		
		int l = 10;
		for(;;l--)
		{
			System.out.print("Value of l is:   ");
			System.out.println(l);
			if(l<=1)
			{
				break;
			}
		}
		
		
		int  p = 5 ;
		for (;;)
		{
			System.out.print("Value of p is:  ");
			System.out.println(p);
			if(p<=1)
			{
				break;
			}
			p --;
		}
	}
}