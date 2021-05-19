public class Compo
{
	public static void main(String[] args)
	{
		Laptop lappy = new Laptop();
		System.out.println(lappy.getProcessor().getgeneration());
	}
}

/* 
OUTPUT

C:\source\CS_Java\S9\Composition\Laptop>java Compo
Laptop[ screen =15.6, processor =Processor [ 1. brand =intel, 2. series =i7 7200u, 3. generation= 7, 4.cores = 2,  5.threads =4,  6.cacheMemory = 3 MB, 
7.frequency =2.5Ghz, 8. minFrequency =2.5Ghz, 9.maxFrequency = 3.1GHz],
ram =DDR4, hardDrive =2 TB, graphicsCard = GraphicsCard [ 1.brand = Nvedia, 2.series =940, 3.memory = 4 GB], opticalDrive =multi layer, keyboard =backlit]

*/
