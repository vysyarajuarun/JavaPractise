public class Compo
{
	public static void main(String[] args)
	{
		//Laptop lappy = new Laptop();
		//System.out.println(lappy);
		Processor processor = new Processor("intel", "7200U", 7, 4, 4, "6 MB", "2.5Ghz", "2.5Ghz", "3.1Ghz");
		GraphicsCard graphicsCard = new GraphicsCard("Nvedia", 1050 ,"4GB");
		Laptop gamingLaptop = new Laptop(17f,processor,"DDR4","2 TB",graphicsCard,null,"backlit");
		System.out.println(gamingLaptop);
		gamingLaptop.gamingMode();
		System.out.println("Gaming Mode on");
		System.out.println("Current Frequency is " +gamingLaptop.getProcessor().getfrequency());
	}
}
/* 
OUTPUT
C:\source\CS_Java\S9\Composition\Laptop>javac Compo.java

C:\source\CS_Java\S9\Composition\Laptop>java Compo
Laptop[ screen =17.0, processor =Processor [ 1. brand =intel, 2. series =7200U, 3. generation= 7, 4.cores = 4,  5.threads =4,  6.cacheMemory = 6 MB, 7.frequency =2.5Ghz, 8. minFrequency =2.5Ghz, 9.maxFrequency = 3.1Ghz],ram =DDR4, hardDrive =2 TB, graphicsCard = GraphicsCard [ 1.brand = Nvedia, 2.series =1050, 3.memory = 4GB], opticalDrive =null, keyboard =backlit]
Gaming Mode on
Current Frequency is 3.1Ghz

*/
