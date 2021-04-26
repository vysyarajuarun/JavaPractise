class Hello
{
	public static void main(String[] args)
	{
		Car c1 = new Car("closed","seated","on",100);
		System.out.println(c1.run());
	}
}

public class Car
{
	private String doors;
	private String driver;
	private String engine;
	private int speed;
	
	public Car()
	{
		doors = "opened";
		driver ="absent";
		engine ="off";
		speed = 0;
	}
	
	public Car(String doors,String driver, String engine, int speed)
	{
		this.doors = doors;
		this.driver = driver;
		this.engine = engine;
		this.speed = speed;
	}
	public void setDoors(String doors)
	{
		this.doors = doors;
	}
	public String getDoors()
	{
		return doors;
	}
	
	public void setDriver(String driver)
	{
		this.driver = driver;
	}
	public String getDriver()
	{
		return driver;
	}
	
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
	public String getEngine()
	{
		return engine;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	public String run()
	{
		System.out.println("doors: "+doors);
		System.out.println("driver: "+driver);
		System.out.println("engine: "+engine);
		System.out.println("speed: "+speed);
		
		if(doors.equals("closed") && driver.equals("seated") && engine.equals("on") && speed > 0)
		{
			return "car is running";
		}
		else
		{
			return "not running";
		}
	}
}
