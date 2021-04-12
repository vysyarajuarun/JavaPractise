class Logical_Operator2  // Logical or operator ||
{
	public static void main(String[] args)
	{
		boolean x = true;
		boolean y = false;
		
		if( x || y)   // NOTE: || operator rule is If any of the operand is true then the condition is true
		{
			System.out.println("Condition is TRUE");
		}
		else
		{
			System.out.println("Condition is FALSE");
		}

		// All possibilities
		
		boolean x1 = true;
		boolean y1 = false;
		// if( true  || false ) 
		  if( false|| false )  // If both the conditions are false the condition is false.
		{
			System.out.println("Condition is TRUE");
		}
		else
		{
			System.out.println("Condition is FALSE");
		}

		
	}
}