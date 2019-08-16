package com.sumit.Constructor;

public class Sumit_ParentsConstructor 
{
	public   Sumit_ParentsConstructor()
	{
		this(3,3);
		System.out.println("Parent default constructor\n\n");
	}
	public   Sumit_ParentsConstructor(int a)
	{	
		this();
		int one=a;
		System.out.println("Parent 1 perameterized constructor\n\n"+" "+one);
	}
	public   Sumit_ParentsConstructor(int a, int b)
	{
		int two=a+b;
		System.out.println("Parent 2 perameterized constructor\n\n"+""+two);
		
	}
	public  Sumit_ParentsConstructor(int a , int b, int c)
	
	{
		this(100);
		int three= a+b+c;
		System.out.println("Parent 3 perameterized constructor\n"+""+three);
	}

}
