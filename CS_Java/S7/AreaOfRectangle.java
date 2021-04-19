//Methods Paremeters _ Return Type 
/*
	Important Points to remember
	1. Void has no return type.
	2. We return any value like int float ,double , array entity , custom entity but unlike parameters 
		we can recieve only singke entity as return type.
	3. We can have n number of paremeters inside a method and we no parameters also
	4.
*/
public class AreaOfRectangle
{
	public static void main(String[] args)
	{
		System.out.println("Area of Rectangle with length= 10.5 and breadth is = 20.5 is :  ");
		areaRectangle(10.5,20.8); 
	}
	public static void areaRectangle(double length, double breadth)
	{
		System.out.print(length*breadth);	
	}
}

// Using return type 
class AreaOfRectangle2
{
	public static void main(String[] args)
	{
		System.out.println("Area of Rectangle with length= 10.5 and breadth is = 20.5 is :  "+ areaRectangle(10.5,20.5));
		double area = areaRectangle(10.5,20.5); 
		//System.out.println(area);
	}
	public static double areaRectangle(double length, double breadth)
	{
		return(length*breadth);	
		//return length*breadth;
	}
}