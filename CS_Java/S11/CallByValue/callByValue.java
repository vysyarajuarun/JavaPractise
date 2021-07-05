public class callByValue
{
	public static void main(String[] args)
	{
		int value = 10;
		callByValue app  = new callByValue();
		app.displayValue(value);
	}
	
	void displayValue(int value)
	{
		System.out.println("value is "+value);
	}
	
}