public class Loops_Revisited
{
	public static void main(String[] args)
	{
		/*
		int i,j;
		for(i = 1 ,j = 1; i<=10 && j<= 10 ;i++,j++)
		{
			System.out.println("i is: "+i+  "  and j is : "+j);
		}
		System.out.println("*****************************************");
		
		
		/*
		
		int a =1, b =1;
		while (a<=10 && b<=10)
		{
			a++;
			b++;
			System.out.println("a is: "+a+  "  and b is : "+b);
		}
		System.out.println("*****************************************");
		*/
		
		
		int p =1, q =1;
		do
		{
			p++;
			q++;
			System.out.println("p is: "+p+  "  and q is : "+q);		
		}
		while(p<10 && q<10);
		
	}
}