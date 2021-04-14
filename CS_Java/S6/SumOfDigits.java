public class Sum_Of_Digits
{
	public static void mian(String[] args)
	{
		int value = 1234;
		int sumOfDigits = 0;
		float remainder;
		
		while(true)
		{
			sumOfDigits = sumOfDigits + value%10;
			value = value/10;
			if(value<10)
			{
				break;
			}
			System.out.println("Sum of Digit is :"+ sumOfDigits);
		}
		
	}
}