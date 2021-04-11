import java.math.BigDecimal;      // NOTE : To use bid decimal notation we need to import java.math class

public class bigDecimal
{
	public static void main(String[] args)
	{
		double d1 = 2.55;
		double d2 = 3.55;

		System.out.println(d1+d2);

		double d3 = 1.07;
		double d4 = 2.03;
		System.out.println(d3+d4);

		double d5 = 7;
		double d6 = 9.7;
		System.out.println(d5+d6);


		double d7 = 1;
		System.out.println(d7/3);  //ULTRA PRECISION -- ROUND OF THINGS // BIG DECIMAL


		double d8 = 1.05;
		double d9 = 2.55;                  //To overcome this problem we have big decinal notation provided by oracle    --->
		System.out.println(d8+d9);         // @@ ----- https://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html  ---------@@ //


		double d10 = 1.05;
		double d11 = 2.55;
		BigDecimal bd = new BigDecimal(1.05);
		BigDecimal bd1 = new BigDecimal (2.55);
		//System.out.println(bd + bd1);   //this code crashes and we need to add method add 
		System.out.println(bd.add(bd1));  //NOTE : For big decimal notation we need to use string version of variables.

		double d12 = 1.05;
		double d13 = 2.55;
		BigDecimal bd2 = new BigDecimal("1.05");
		BigDecimal bd3 = new BigDecimal ("2.55");
		System.out.println(bd2.add(bd3));
		

	}
}