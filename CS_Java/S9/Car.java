public class Car
{
		/*
			Properties and functionalities or state and behaviours
			Private properties : Public methods inside this class would access it.
		*/
		
		private String doors;       //State or Properties
		private String engine;
		private String driver;
		private int speed;
		//public int speed;
		
		public void setSpeed(int speed)
		{
			this.speed = speed;
		}
		public int getSpeed()
		{
			return speed;
		}
}
