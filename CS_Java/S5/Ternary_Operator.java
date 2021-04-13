class Ternary_Operator   // 34 Ternary Operator
{
	public static void main(String[] args)
	{
		int x  = 5;  // Binary operator
			     //  
		boolean y = !false; //Unary operator
		boolean z = !(6>7);
	
		System.out.println(y);
		System.out.println(x);	
		System.out.println(z);

		boolean p;	//Syntax of Ternary Operator x(Assignment part) = (Condition / Operation ) ? true (Value): false ; 
		p = (3>4)?true:false;   // Ternary operator has ? is for true and : is for false
		System.out.println(p);  // java has only one ternary operator.
	
	}
}