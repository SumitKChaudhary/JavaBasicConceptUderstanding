
package com.sumit.DatatypesConcepts;

public class Sumit_AllDataType 
{
	
	public static void main(String[] args)
	{
		byte byt = 25;   // byte is 1 byte store whole number between -128 to 127
		
		short shrt= 50; // short is 2 byte store whole number from -32,768 to 32767
		
		int integer= 100; // integer 4 byte store integer value
		
		long lng = 150; //  8 byte stores whole number 
		
		float flt= 200.5F; //4 byte  Stores fractional numbers. It's sufficient for storing 6 to 7 decimal digits 
		
		double dbl= 250.50; // 8 bytes stores fractional numbers 
		
		boolean bln;   // 1 byte stores true and false values 
		
		char chr= 'A'; // 2 bytes stores only single character 
		
		String str = "Sumit Kumar"; // stores more than one character value or sentence. 
		
		bln = true; bln= false;
		int a=10; int b=20;
		
		System.out.println("Byte value\n"+byt);
		System.out.println("Short value"+shrt);
		System.out.println("Integer value"+integer);
		System.out.println("long vlaue"+lng);
		System.out.println("float value"+flt);
		System.out.println("Double value"+dbl);
		if (a==b)
		{
			System.out.println("Boolean result "+bln);
		}
		else 
		{
			System.out.println("Boolean result"+bln);
		}
		
		System.out.println("Character vlaue"+chr);
		System.out.println("String value"+str);
		
	}
	

}
