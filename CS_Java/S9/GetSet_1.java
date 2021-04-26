//CS_JAVA 64
public class GetSet_1
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
	public void setDoors(String doors)
	{
		this.doors = doors;
	}
	public String getDoors()
	{
		return doors;
	}
	
	// ENGINE
	public void setEngine(String engine)
	{
		this.engine = engine;
	}
	
	public String getEngine()
	{
		return engine;
	}
	
	// DRIVER
	public void setDriver(String driver)
	{
		this.driver = driver;
	}
	public String getDriver()
	{
		return driver;
	}	
}