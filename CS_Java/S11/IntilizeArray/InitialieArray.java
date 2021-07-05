public class InitialieArray
{
	public static void main(String[] args)
	{
		//int intVariable = 5; // This int variable is not capable of storing multiple int variables
		//System.out.println(intVariable);
		
		// Inorder To store multiple of int varible we need array
		/*
		int[] Variable = {1,2,3};
		// Here int[] means we are creating an array.
		System.out.println(Variable);
		// This gives and some weird text [I@7a81197d  it is nothing but memory location of this variable
		*/
		
		//To create an refernce variable
		/*
		int[] variableArray;
		variableArray = new int[10];
		variableArray[5] = 10;
		//variableArray[10] = 99;
		/*		
				C:\source\CS_Java\S11\IntilizeArray>java InitialieArray
				Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
						at InitialieArray.main(InitialieArray.java:21)
						
		   Exception: Line 21 explanbation
		   1. We have issue in line no 21 because we tryint to access 10th element.
		   2. In programming language java the array index starts from 0 , so if the size of an array is 10 then the last index would be sizeof an array minus -1 
		*/
			//variableArray[9] = 99;
			//System.out.println(variableArray[9]);   // This is the way we intialize an array.
		
			//System.out.println(variableArray[8]);
		/*
		For Example if I tried to access the variable at the location at index 8 which we havent initialized.
		Then the output will be 0 because by default all the elements intialized to zero.
		*/
		
		  int[] variableArray = {1,2,3,4,5,6,7,8,9,10};
		  // We need not count the elements because java will by default count the number of elements we are trying to store and will accordingly allocate to memory;
		  System.out.println(variableArray[5]);
		  
		  // This is because index value starts from zero.
		  
		  float[] floatvariableArray = {1.0f,2.0f,3.0f,4.0f};
		  System.out.println(floatvariableArray[2]);
		  // Remember if we does not provide index in the output it will give default memory location;
		  //We also need to understand that index value could be int entity it will not be an flaot entity.
	}
}