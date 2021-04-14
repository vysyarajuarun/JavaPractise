class While_Loop
{
	public static void main(String[] args)
	{
		int i = 1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		// While loop can aslo be written aslo
		 
		 while(true)
		 {
			 System.out.println("AK");
			 break;                      // if you forget to give break the above condition fails and goes to infinite loop
		 }
		
	}
}