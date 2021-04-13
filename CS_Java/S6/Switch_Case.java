class Switch_Case
{
	public static void main(String[] args)
	{
		int x = 4;
		switch (x)
		{
				case 1 : System.out.println ("The value is 1");
						break;
				case 2 : System.out.println ("The value is 2");
						break;
				case 3 : System.out.println ("The value is 3");
						break;
				case 4 : System.out.println ("The value is 4");
						break;
				case 5 : System.out.println ("The value is 5");
						break;
		}
	}
}
/*
					// REULES : 
						1. Always apply break statement for 
				// Note : We cannot write switch case for floating point value.
				
						/*
						class Switch_Case_1
						{
							public static void main(String[] args)
							{
								float f = 10.5f;
								
								Switch(f)
								{
									case 1: System.out.println("Value of f is 1");
									break;
									
									case 2: System.out.println("Value is 10.5f");
									break;
									
									default: System.out.println("Default value");
									break;
									
									// NOTE: We cannot eecute this program as we cannot write switch case for floating point number
								}
							}
						}
*/