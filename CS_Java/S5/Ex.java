class Ex
{
		public static void main(String[] args)
		{
			int x = 10;   // Ternary Operator 
			
			x = (10 == x )? 1:0;     // x = (10 = 10) ? 1:0 ;  Gives an error because it is an assignment operator
			System.out.println(x);
		}
}