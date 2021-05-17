public class Vehicle
{
	public String engine;
	public int wheels;
	public int seats;
	public int fuelTank;
	public String lights;	
	
	public void print()
	{
		System.out.println("Engine tye "+engine);
		System.out.println("No of "+wheels);
		System.out.println("Total seats  "+seats);
		System.out.println("Fuel type "+fuelTank);
		System.out.println("No of Lights "+lights);
	}
}