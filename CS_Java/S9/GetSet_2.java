//CS_JAVA 65 - Adding Functionality into class
public class GetSet_2
{
	private String doors;
	private String driver;
	private String engine;
	private int speed;
 
	// SPEED
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	public int getSpeed()
	{
		return speed;
	}
	
	// DOORS
	public String getDoors()
	{
		return doors;
	}
	public void setDoors(String doors)
	{
		this.doors = doors;
	}
	
	// ENGINE
	public String getEngine()
	{
		return engine;
	}
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
		
	// DRIVER
	public String getDriver()
	{
		return driver;
	}	
	public void setDriver(String driver)
	{
		this.driver = driver;
	}
	
	public String run()
	{
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