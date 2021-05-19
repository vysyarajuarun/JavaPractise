public class Processor
{
	private String brand;
	private String series;
	private int generation;
	private int cores;
	private int threads;
	private String cacheMemory;
	private String frequency;
	private String minFrequency;
	private String maxFrequency;
	
	public Processor()
	{
		this.brand = "intel";
		this.series = "i7 7200u";
		this.generation = 7;
		this.cores = 2;
		this.threads = 4;
		this.cacheMemory = "3 MB";
		this.frequency = "2.5Ghz";
		this.minFrequency= "2.5Ghz";
		this.maxFrequency= "3.1GHz";
	}
	
	public Processor(String brand,String series,int generation,int cores,int threads,String cacheMemory,String frequency,String minFrequency,String maxFrequency)
	{
		this.brand = brand;
		this.series = series;
		this.generation = generation;
		this.cores = cores;
		this.threads = threads;
		this.cacheMemory = cacheMemory;
		this.frequency = frequency;
		this.minFrequency= minFrequency;
		this.maxFrequency= maxFrequency;
	}
	
	public String toString()
	{
		return "Processor [ 1. brand ="+brand+ ", 2. series ="+series+ ", 3. generation= "+generation+ ", 4.cores = "+cores+ ",  5.threads ="+threads+ ",  6.cacheMemory = "+cacheMemory+ ", 7.frequency ="+frequency+ ", 8. minFrequency ="+minFrequency+", 9.maxFrequency = "+maxFrequency+ "]";
	}
	
	public String getBrand()
	{
		return brand;
	}
	
	public String getseries()
	{
		return series;
	}
	
	public int getgeneration()
	{
		return generation;
	}
	
	public int getcores()
	{
		return cores;
	}
	
	public int getthreads()
	{
		return threads;
	}
	
	public String getcacheMemory()
	{
		return cacheMemory;
	}
	
	public String getfrequency()
	{
		return frequency;
	}
	
	public String getminFrequency()
	{
		return minFrequency;
	}
	
	public String getmaxFrequency()
	{
		return maxFrequency;
	}
}