public class Prime
{
	public static void main(String[] args)
	{
		int num = 37;
		int temp;
		boolean isPrime = true;
		
		for(int i=2;i<=num/2;i++)
		{
			temp = num % i;
			if(temp == 0)
			isPrime = false;
		}
		
		if (isPrime)
		{
			System.out.println(num + " is a Prime Number");	
		}
		else
		{
			System.out.println(num + " is not a Prime Number");
		}
	}
}