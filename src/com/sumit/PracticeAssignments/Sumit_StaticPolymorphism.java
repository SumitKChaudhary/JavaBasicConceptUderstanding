package com.sumit.PracticeAssignments;

public class Sumit_StaticPolymorphism 
//one thing many forms 
{
	public void arithmetic(int a, int b)
	{
		int c;
		c= a+b;
		System.out.println("two "+c);
		//return c;

		
	}
	public void arithmetic(int a, int b, int c)
	{
		int d;
		d= a+b+c;
		System.out.println(d);
	//	return d;
		
	}
	public static void main(String[] args)
	{
		Sumit_StaticPolymorphism sSP= new Sumit_StaticPolymorphism();
		sSP.arithmetic(10, 10);
		sSP.arithmetic(20, 20, 20);
	}


}
