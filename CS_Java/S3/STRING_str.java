public class STRING_str   //String is nothing but sequence of characters
{
	public static void main (String[] args)
	{
		String str= "To define a string ";  //TYPE CASTING  is interconversion of data types.
		System.out.println(str);

		String var1 = "10";
		String var2 = "20";
		System.out.println(var1 + var2);

		/*
		String var3 = 10;
		String var4 = 20;
		System.out.println("var3 + var4");   //String values or variables cannot store integer type data.
		*/

		int var5 = 10;
		String var6 = "20";
		System.out.println(var5 + var6);

		int var7 = 10;
		String var8 = "20";
		System.out.println(var7+20);

		int var9 = 10;
		String var10 = "35";
		System.out.println(var9+10+"AK");


		//The proper way of declaring a string is 
		String str1 = new String ("ARUN KUMAR");
		System.out.println(str1);
	}
}