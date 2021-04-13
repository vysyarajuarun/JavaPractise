class Switch_Case_3                // Strings are stream of characters 
									// Strings are case sensitive
									// to overcome case sensitive problem -> we can  write switch(name.toLowerCase())
{
	public static void main(String[] args)
	{
		String name = "details";
		
		//switch(name.toLowerCase())
		switch(name.toUpperCase())
		
		{
			case "Details":
							System.out.println("My name is Arun Kumar");
							break;
			case "Company": 
							System.out.println("HCL Tech");
							break;
			case "SAP ID" :
							System.out.println("30542715");
							break;
			default :
							System.out.println("No other details");
							break;
							
		}
	}
}