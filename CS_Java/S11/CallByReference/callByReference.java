public class callByReference
{
	public static void main(String[] args)
	{
		String[] names = {"Arun","Jagadish","MahaLakshmi","Gupta"};
		callByReference app = new callByReference();
		//app.displayNames(names);
		System.out.println(names[0]);
	}
	
	void displayNames(String[] names)
	{
		for(String name : names)
		{
			System.out.println(names);
		}
	}
}