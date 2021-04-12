class Logical_Operator4   // Scenarios of Logical not ! operator
{
	public static void main(String[] args)
	{
		
		int x = 5;
		int y = 10;
		
		//if (((x < y) || (x==y)))
		//if (!((x < y) && (x==y)))
		//if (!((x < y) || (x==y)))		
		//if(!true)
		//if(!false)
		if (!(x < y) || (x==y))		
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}
		

		int ageOfBoy = 12;
		int ageOfGirl = 19;
		
		if ((ageOfBoy >= 21) && (ageOfGirl >= 18))
		{
			System.out.println("Ready to marry");
		}
		else
		{
			System.out.println("Wait for it KIDDO");
		}
		
	}
}