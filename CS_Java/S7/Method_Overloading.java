//Method Overloading 
class Method_Overloading
{
	public static void main(String[] args)
	{
		System.out.println("Sum of X + y is : "+sum(1,2));
		System.out.println("Sum of X + y + z is : "+sum(1,2,7));
		System.out.println("Product of a * b is : "+sum(2,7.5F));
		System.out.println("sum of a + b is : "+sum(2.9,7.5));
		
	}
	public static int sum( int x ,int y)
	{
		return x+y;
	}
	public static int sum(int x,int y, int z)
	{
		return x+y+z;
	}
	public static float sum(int a ,float b)
	{
		return a*b;
	}
	public static double sum(double x, double y)
	{
		return x+y;
	}
	
}