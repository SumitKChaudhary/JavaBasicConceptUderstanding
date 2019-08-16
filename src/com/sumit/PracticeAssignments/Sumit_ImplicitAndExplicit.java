package com.sumit.PracticeAssignments;
// Implicit and explicit conversion 

public class Sumit_ImplicitAndExplicit
{
	public void implicitConversion()
	{
		int a=10; // local variable because is declare with in class
		//	a is integer data type variable 
		float f; // f is a float type variable 
		f=a; // this is implicit conversion 
		// Implicit conversion is done by java complier 
		// And here complier convert the integer value in to float 
		// we can give the a's value to f because float is greater then integer in byte. 
		
		System.out.println("Implicit conversion value\n"+f);
	}
	public void explicitConversion()
	{
		float x=12.5F;
		
		int y;
		y=(int) x;// here we type cast the float value as integer. 
		System.out.println("Explit conversion value\n"+y);
		
	}
	
	public static void main(String[] args)
	{
		Sumit_ImplicitAndExplicit sImp= new Sumit_ImplicitAndExplicit();
		
		sImp.implicitConversion();
		sImp.explicitConversion();
	}
}
