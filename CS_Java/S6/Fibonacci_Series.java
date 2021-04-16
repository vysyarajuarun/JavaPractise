class Fibonacci_Series
{
	public static void main(String[] args)
	{
		int f1 = 0;
		int f2 = 1;
		int a[] = new int[20];
		a[0]= f1;
		a[1] = f2;
		
		for(int i = 2; i<a.length ; i++)
		{
			a[i] = a[i - 1] + a[i-2];		
		}
		for(int k = 0; k<a.length -1; k++ )
		{
			System.out.print(a[k]+" ");
		}
	}
}
