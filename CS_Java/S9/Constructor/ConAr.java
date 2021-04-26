// Usage of Constructors
class Ahello
{
	public static void main(String[] args)
	{
		ConAr C = new ConAr("closed","seated","on",70);
		System.out.println(C.run());	
	}
}
class ConAr
{
	private String doors;
	private String driver;
	private String engine;
	private int speed;
	
	public ConAr()
	{
		doors = "closed";
		driver ="absent";
		engine ="off";
		speed = 0;
	}
	public ConAr(String doors,String driver, String engine, int speed)
	{
		this.doors = doors;
		this.driver = driver;
		this.engine = engine;
		this.speed = speed;
	}
	public String getDoors()
	{
		return doors;
	}
	
	public String getDriver()
	{
		return driver;
	}
	
	public String getEngine()
	{
		return engine;
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