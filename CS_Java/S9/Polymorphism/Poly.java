public class Poly
{
	public static void main(String[] args)
	{
		/*
		Phone phone = new Phone("NOKIA 3310");
		System.out.println(phone.getModel());
		phone.features();
		
		SamsungNote8 Note8 = new SamsungNote8("Note8");
		System.out.println(Note8.getModel());
		Note8.features();
		*/
		
		Phone Note8 = new SamsungNote8("Note8");
		System.out.println(Note8.getModel());
		Note8.features();
		
		Phone nokia3310 = new Nokia3310("Nokia3310");
		System.out.println(nokia3310.getModel());
		nokia3310.features();
	}
}