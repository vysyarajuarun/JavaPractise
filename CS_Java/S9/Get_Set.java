class Get_Set
{
	public static void main(String[] args)
	{
		/*
			Create an object first.
			 // Datatype name = new Initializing cONSTRUCTOR
			// nOW we have create object for this car class. 
			// Using this car class now we can access behaviour and state based on the access specification.
			// IMP : /*
					We are able to access to value which is stored in the property , 
					but the proper way is to assign the functionality and access the functionality to the function on the property.
					
		*/
		
		Car car = new Car();    	
		//car.speed = 100;
		//System.out.println("car.speed");
		
		car.setSpeed (100);
		System.out.println(car.getSpeed());
									
	} 
}
