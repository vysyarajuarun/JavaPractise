public class Sum_Of_Digits
{
	public static void main(String[] args)
	{
		int value = 1234;
		int sumOfDigit = 0;
		
		while(true)
		{
			sumOfDigit = sumOfDigit + value%10;
			value = value/10;
			if(value<10)
			{
				break;
			}			
		}
		sumOfDigit = sumOfDigit + value;
		System.out.println("Sum of Digit is :"+ sumOfDigit);
	}
}