class Assignment_Operator_35
{
	public static void main(String[] args)
	{
		int x = 5;
		x += 5;    // x = x + 5;
		System.out.println(x);
		x -= 5;    // x = x - 5;
		System.out.println(x);
		x *= 5;		// x = x * 5;
		System.out.println(x);
		x /= 5;      // x = x / 5; //Anything after the decimal point is truncated in case of int .
		System.out.println(x);
		x % 5;  // x  = x % 5;
	}
}