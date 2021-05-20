public class Laptop
{
	private float screen;
	private Processor processor;
	private String ram;
	private String hardDrive;
	private GraphicsCard graphicsCard;
	private String opticalDrive;
	private String keyboard;
	
	public Laptop()
	{
		this.screen = 15.6f;
		this.processor = new Processor();
		this.ram =  "DDR4";
		this.hardDrive = "2 TB";
		this.graphicsCard = new GraphicsCard(); // Here we are making use of default constructor in order to create anonymous object which would be initialized
		this.opticalDrive = "multi layer";		// the property which is there in our laptop class.
		this.keyboard = "backlit";
	}
	
	public Laptop(float screen,Processor processor,String ram,String hardDrive,GraphicsCard graphicsCard,String opticalDrive,String keyboard)
	{
		this.screen =screen;
		this.processor = processor;
		this.ram = ram;
		this.hardDrive = hardDrive;
		this.graphicsCard = graphicsCard;
		this.opticalDrive = opticalDrive;
		this.keyboard = keyboard;
	}
	
	public String toString()
	{
		return "Laptop[ screen =" +screen+ ", processor =" +processor+ ",ram =" +ram+ ", hardDrive ="+hardDrive+ ", graphicsCard = "+graphicsCard+ ", opticalDrive ="+opticalDrive+ ", keyboard ="+keyboard+ "]";
	}
	
	public Processor getProcessor()
	{
		return processor;
	}
	
	public GraphicsCard getGraphicsCard()
	{
		return graphicsCard;
	}
	
	public float getscreen()
	{
		return screen;
	}
	
	public String getRam()
	{
		return ram;
	}
	
	public String gethardDrive()
	{
		return hardDrive;
	}
	
	public String OpticalDrive()
	{
		return opticalDrive;
	}
	
	public String getkeyboard()
	{
		return keyboard;
	}
	
	public String gamingMode()
	{
		processor.setfrequency(processor.getmaxFrequency());
		return "success";
	}
}