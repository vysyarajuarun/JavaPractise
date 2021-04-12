class Logical_Operator3   // Scenarios of Logical && and || operator
{
	public static void main(String[] args)
	{
		int x = 5;
		int y = 10;
		
		if ((x < y) && (x==y))
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}

		int x1 = 5;
		int y1 = 10;
		
		if ((x1 < y1) || (x1 == y1))
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}
	}
}