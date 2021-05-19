public class GraphicsCard
{
	private String brand;
	private int series;
	private String memory;
	
	public GraphicsCard()
	{
		this.brand = "Nvedia";
		this.series = 940;
		this.memory = "4 GB";
	}
	
	public GraphicsCard(String brand,int series,String memory)
	{
			this.brand = brand;
			this.series = series;
			this.memory = memory;
	}
	
	public String toString()
	{
		return "GraphicsCard [ 1.brand = "+brand+ ", 2.series =" +series+ ", 3.memory = "+memory+ "]";
	}
	
	
}