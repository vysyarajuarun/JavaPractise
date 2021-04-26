public abstract class Carz        // AbstractAction class we cannot create object
{
	private int year;
	private String name;
	abstract public void print();
	public int getYear()
	{
		return year;
	}
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name =  name;
	}
	
	public Carz
}
class Ferrari extends Carz
{
	public void print()
	{
		System.out.println("Ferrari - "+ super.getName() + " Year is :"+ super.getYear());
	}
}

class Breeza extends Carz
{
	public void print()
	{
		System.out.println("Breeza "+ super.getName() +" Year is :"+ super.getYear());
	}
}

class Test
{
	public static void printDescription(Carz c)
	{
		//c.print();
		System.out.println(c.getYear());
	}
	public static void main(String[] args)
	{
		Ferrari f1 = new Ferrari();
		Ferrari f2 = new Ferrari();
		Breeza b1 = new Breeza();
		
		f1.setName("R1");
		f1.setYear(1992);
		
		f2.setName("812");
		f2.setYear(2010);
		
		b1.setName("Beez");
		b1.setYear(2016);
	
		Test.printDescription(f1);
		Test.printDescription(f2);
		Test.printDescription(b1);
		
	}
}


