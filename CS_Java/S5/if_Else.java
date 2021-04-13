class if_Else
{
		public static void main(String[] args)
		{	
			/*  W3 Schools
			Java Conditions and If Statements
			Java supports the usual logical conditions from mathematics:
			Less than: a < b
			Less than or equal to: a <= b
			Greater than: a > b
			Greater than or equal to: a >= b
			Equal to a == b
			Not Equal to: a != b
			/*
		
			/*Java has the following conditional statements:
			Use if to specify a block of code to be executed, if a specified condition is true
			Use else to specify a block of code to be executed, if the same condition is false
			Use else if to specify a new condition to test, if the first condition is false
			Use switch to specify many alternative blocks of code to be executed
			
			//
			Syntax of if
			if (condition) 
			{
				// block of code to be executed if the condition is true
			}
			*/
			//NOTE: Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.
				int x = 10;
				int y = 5;
				if(x > y)
				{
					System.out.println("X is greater than Y");
				}
			
			/*
			//Sysntax of else
			if (condition) {
				// block of code to be executed if the condition is true
				} else {
				// block of code to be executed if the condition is false
				}
			*/
				int time = 20;
				if(time < 18)
				{
					System.out.println("Good Day");
				}
				else
				{
					System.out.println("Good Evening");
				}
				
			/*
			// SYNTAX of ELSE IF
			if (condition1) {
			// block of code to be executed if condition1 is true
				} else if (condition2) {
			// block of code to be executed if the condition1 is false and condition2 is true
				} else {
			// block of code to be executed if the condition1 is false and condition2 is false
			}
			*/
				// MARKS
				int marks = 100;
				if( marks <= 10)
				{
					System.out.println("Distiniction marks A+");
				}
				else if ((marks < 100 && marks > 80))
				{
					System.out.println("Good Marks");
				}
				else if(marks < 60)
				{
					System.out.println("Average marks");
				}
				else 
				{
					System.out.println("Fail");
				}
				// TIME
				int time1 = 22;
					if (time1 < 10) 
					{
					  System.out.println("Good morning.");
					} 
					else if (time1 < 20)						
					{
					  System.out.println("Good day.");
					} 
					else 
					{
					  System.out.println("Good evening.");
					}
			// Short Hand If...Else (Ternary Operator)
			// variable = (condition) ? expressionTrue :  expressionFalse;
			
				int time2 = 20;
				String result = (time2  < 18) ? "Good day." : "Good evening.";
				System.out.println(result);	
		}
}