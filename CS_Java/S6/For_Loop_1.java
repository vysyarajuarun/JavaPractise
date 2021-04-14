class For_Loop_1   // w3Schools
{
	/*
		SYNTAX : 
		for (statement 1(Initialization); statement 2(Condition ); statement 3 (Increment or Decrement)) 
		{
		  // code block to be executed
		}
		Statement 1 is executed (one time) before the execution of the code block.
		Statement 2 defines the condition for executing the code block.
		Statement 3 is executed (every time) after the code block has been executed.
	*/		
		public static void main(String[] args)
		{
			int i = 5 ;
			for(i=0;i<5;i++)   // i++ is equal to i = i +1; both are same
			{
				System.out.println(i);
			}
			System.out.println("---------");
			int j = 10;
			for (j = 0; j <= 10; j = j + 2)
			{
				System.out.println(j);
			}
			System.out.println("---------");
			int k = 20;
			for (k =1 ; k<=20 ; k = k+1)
			{
				System.out.println("The value of k is "+k);
			}
			
		}
}