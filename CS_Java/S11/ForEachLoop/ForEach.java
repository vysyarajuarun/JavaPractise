public class ForEach
{
	public static void main(String[] args)
	{
		/*
		We will deal with arrays with refernce to loops.
		*/
		String[] stringArray = {"Arun","Jagadish","Sudhee","Jagan","Raju"};
		//System.out.println(stringArray[0]);
		
		/*
		But if we want to traverse all of these elements the displaying all of them one by one is difficult.
		if we want to display some n number of elements it would be tough.
		Displaying thosusands of elements using system.out.println  is not good idea.so then we use arrays to display all these elements.
		*/
		
		//for (int i=0;i<=4;i++)
		//for(int i = 0; i<stringArray.length;i++) // the adavantage of length property is we can add n number of elements in the array. 	
		//{
			//System.out.println(stringArray[i]); 
			// remember if we forget declare i then we will get compile time error.
			// We must know the size of an array the we can display like this.
			
			/*
				-> But if we dont know the size of an array then we have an property named length .
				syntax is name of the array . length
			*/	
		//}
		//System.out.println(stringArray.length); // This line will give how many elements there in the array.
		
		 for(String name: stringArray)  // we need to take datatypr and temporary variale which is compatible
		 {
			 System.out.println(name); // For each loop was introduces post java version 8
		 }
	}
}