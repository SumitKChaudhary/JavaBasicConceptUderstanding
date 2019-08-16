package com.sumit.Constructor;

public class Sumit_ContructorAndMethods 
{
	
	public void method()
	{
		this.method3("Sumit", 90, 80f);
		System.out.println("default method\n");
	}
	public void method1(int a)
	{
		int x=a;
		this.method();
		System.out.println("One perametarised method value\n\n"+x);
		
	}
	public void method2(int a, float b)
	{
		int x=a;
		float y=b;
		this.method1(100);
		System.out.println("Tow perametarised method value\n\n"+x+" "+"Float"+" "+y);
		
	}
	public void method3(String str, int b, float f)
	
	{
		String mTree=str;
		int integer=b;
		float ft=f;
		System.out.println("This three different perametrised\n\n " +"String"+
		" "+mTree+" "+"integer Value"+integer+" "+"float Value"+ft+"\n");
		
	}
	public static void main(String[] args)
	{
		Sumit_ContructorAndMethods refVariable=new Sumit_ContructorAndMethods();
		 
		refVariable.method2( 100, 100.9F);
		
		
	}

}
