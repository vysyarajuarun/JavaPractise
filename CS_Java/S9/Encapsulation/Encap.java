public class Encap
{
	public static void main(String[] args)
	{
		Person Tom = new Person();
		System.out.println(Tom);
		
		Person Hardy = new Person("Hardy", 29, "Malex");
		System.out.println(Hardy);
		Hardy.setAge(-30);
		System.out.println(Hardy);
	}
}


