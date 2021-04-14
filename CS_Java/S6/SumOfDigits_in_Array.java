public class SumOfDigits_in_Array
{
	public static void main(String[] args)
	{
		int a[]  = {1,2,3,4,5,6,7,8,9,10};
		int sum = 0;
		System.out.println("Sum of digits in array");
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}	
		System.out.println(sum);
	}
}

class Sum
{
	public static void main(String[] args)
	{
		int n = 10;
		int sum = 0;
		for(int i =1 ; i<= n ;i++)
		{
			sum = sum + i;
		}
		System.out.println(sum);
	}
}