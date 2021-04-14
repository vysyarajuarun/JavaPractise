class While_Loop_1  
// W3Schools
/*
	Loops
	1.Loops can execute a block of code as long as a specified condition is reached.
	2.Loops are handy because they save time, reduce errors, and they make code more readable.
	Java While Loop
		The while loop loops through a block of code as long as a specified condition is true:
		SYNTAX:
				while (condition)
						{
						  // code block to be executed
						}
		Note: Do not forget to increase the variable used in the condition, otherwise the loop will never end!
*/

{
	public static void main(String[] args)
	{
		//initialization 
		int i = 1;
		
		//Condition
		while(i<=10)
		{
			System.out.println(i);
			i++;  // i = i + 1;   //Increment or decrement part
		}
	}
}