class Task_ForLoop
{
	public static void main(String[] args)
	{
		// To print integer array 
		int i; 
		int a[]= {1,2,3,4,5,6,7,8,9,10};  
		// Print elements 
		System.out.println("Print elements in forward order");
		for(i =0;i<a.length;i++)
		{
			System.out.print(a[i] + " ");	
		}
		System.out.println("\nPrint elements in backward order");
		for(int j=a.length-1; j>=0; j--)
		{
			System.out.print(a[j]+ " ");
		}
		
		// Print Even Elements ;
		System.out.println("\nPrint Even elements in array");
		for(int k=0 ;k<a.length; k++)
		{
			if(k%2 == 0)
			{
				System.out.print(a[k] +" ");
			}	
		}
		
		System.out.println("\nPrint Odd elements in array");
		for(int l = 0; l<a.length; l++)
		{
			if(l%2 == 1)
			{
				System.out.print(a[l]  +" ");
			}
		}
	}
}
