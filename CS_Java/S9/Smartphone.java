// Default Constructor
// When we create a object of a class Constructor will be called automaticcally.
class Hello
{
	public static void main(String[] args)
	{
		Smartphone phone = new Smartphone("Samsung",1992);
		System.out.println(phone.getModel());
		System.out.println(phone.getYear());
		
	}
}

public class Smartphone
{
	private String model;
	private int year;
	/*
	public Smartphone()
	{
		// This is default constructor
	}
	*/
	public void setModel(String model)
	{
		this.model = model;
	}
	public String getModel()
	{
		return model;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	public int getYear()
	{
		return year;
	}
	public Smartphone(String model, int year)
	{
		this.model = model;
		this.year = year;
	}
}

