/*
//W3Schools
	The Do/While Loop
	The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, 
	then it will repeat the loop as long as the condition is true.

	Syntax: 
	do {
	  // code block to be executed
	}
	while (condition);
	
	Do not forget to increase the variable used in the condition, otherwise the loop will never end!
	
	NOTE:
			The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, 
			because the code block is executed before the condition is tested:
*/
public class Do_While_Loop_1
{
	public static void main(String[] args)
	{
		int i = 1;
		
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<=10);
		
	}
}