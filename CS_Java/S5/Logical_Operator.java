class Logical_Operator     // And Operator &&
{
	public static void main(String[] args)
	{
		//1.
		boolean x = true;	
		boolean y = false;
		
		if(x && y)  // If all the operands are true then only the operarion would be true
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}

		//2.
		boolean x1 = true;	
		boolean y1 = true;
		if(x1 && y1)  // If all the operands are true then only the operarion would be true
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}
		
		//3.	
		boolean x2 = true;	
		boolean y2 = false;
		
		if(true && false)  // If all the operands are true then only the operarion would be true
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}
		
		//4.
		boolean x3 = true;	
		boolean y3 = false;
		
		if(false && false)  // If all the operands are true then only the operarion would be true
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}

		//5.
		boolean x4 = true;	
		boolean y4 = false;
		
		if(true && true)  // If all the operands are true then only the operarion would be true
		{
			System.out.println("Condition is True");
		}
		else
		{
			System.out.println("Condition is False");
		}

		//6.
		//NOTE: The comdition is true if all the operands would be true.
		
	}
}