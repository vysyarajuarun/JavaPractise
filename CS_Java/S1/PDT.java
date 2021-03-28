public class PDT
//Primitive Data Type int ---> Integers
//Whenever we want to store some whole numbers we can make use of int data type

// But there are multiple flavours of int data type
{
	public static void main(String[] args) 
	{
		int max =  2147483647;  // if we give 2147483648 it will give an error that the literal is out of range
		int min = -2147483648; // it is maximunm value that an variable can store is int min and max;

		short shortMax = 32767;
		short shortMin = -32768;

		long longMax = 9223372036854775807L;
		long longMin = -9223372036854775808L;

		byte byteMax = 127;
		byte byteMin = -128;
		
	}
}
