class Crocodile extends Reptile
{
	public Crocodile()
	{
		super(); //Override the value of egg
		egg = "Hard Shelled";
	}
	// Generate to string method 
	public String showInfo()
	{
		return "Crocodile [skin=" + skin + ", egg =" +egg+ ",backbone=" +backbone + ", heightInFeet=" +heightInFeet+ ", weightInKilos= "
				+ weightInKilos+ ",animalType= " + animalType+ ", bloodType=" +bloodType+ "]";
	}
}
