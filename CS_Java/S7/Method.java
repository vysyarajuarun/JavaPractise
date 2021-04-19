public class Method
{
	public static void main(String[] args)
	{
		int i = 1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
		}
		System.out.println("*************************************************");
		int j=20;
		while(j<=40)
		{
			System.out.println(j);
			j++;
		}
	}	
}
class Method1
{
	public static void main(String[] args)
	{
		loop1();
		System.out.println("*************************************************");
		loop2();
		System.out.println("*************************************************");
		loop1();
	}
	public static void loop1()
	{
		int i =1;
		while (i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
	public static void loop2()
	{
		int j=20;
		while(j<=40)
		{
			System.out.println(j);
			j++;
		}
	}
}

/* From the above program we have two while conditions, we can acheive the functionality using single function.
	We can specify loop 1 and loop2 in single method loop
	1. We need declarfe variables dynamically.
	2. Inorder to recieve data from outside of class is using parameters.
	3. 
*/
class Method2 
{
	public static void main(String[] args)
	{
		loop(1,10);
		System.out.println("****************");
		loop(20,40);
		System.out.println("****************");
		loop(11,20);
	}
	
	public static void loop(int firstValue,int lastValue)
	{
		//int i= 1;
		//int firstValue = 1;
		//int lastValue = 10;
		//while (i<=10)
		while (firstValue<=lastValue)
		{
			//System.out.println(i);
			System.out.println(firstValue);
			//i++;
			firstValue++;	
		}
	}
}

		/*
		 1. First thing to remember is where to add method.
		 2. We cannot define in a method. We must define the method just after main method inside class.
		 3. No two methods should have same name and signature.
		 4. Adavantage of methods are calling method again and reusable of code. We can call methods n number of times based on requrirement.
		 5. Keywords cannot be used as variables. It gievs an compile time error.
		 5. Keywords cannot be used as variables. It gievs an compile time error.
		*/

