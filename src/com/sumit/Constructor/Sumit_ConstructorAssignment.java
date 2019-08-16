package com.sumit.Constructor;
/* 3 Parameterized constructor
 * default constructor
 * 1 parameterized constructor
 * 2 perameterized constructor
 * */
public class Sumit_ConstructorAssignment

{
	public Sumit_ConstructorAssignment()
	{
		this(1,2,3F);
		System.out.println("Defult constructor");
	}
	public Sumit_ConstructorAssignment(int a)
	{
		this();
		System.out.println("1 perameterised constructor");
	}
	public Sumit_ConstructorAssignment(int a, int b)
	{
		this(2);
		
		System.out.println("2 perameterised constructor");
	
	}
	public Sumit_ConstructorAssignment(int a, int b, float c)
	{
			//this(2,4);
		System.out.println("3 perameterised constructor");
	}
	
	public static void main(String[] args) 
	{
		Sumit_ConstructorAssignment refVariable=new Sumit_ConstructorAssignment(1,2);	
		
	}
	
	
	

}
