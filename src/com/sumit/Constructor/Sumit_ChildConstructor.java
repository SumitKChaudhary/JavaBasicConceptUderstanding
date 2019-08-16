package com.sumit.Constructor;

public class Sumit_ChildConstructor extends Sumit_ParentsConstructor
{
	public Sumit_ChildConstructor()
	{
		this(50,50,50);
		System.out.println("This child defult constructor\n\n");
	}
	public Sumit_ChildConstructor(int a)
	{
		super(100,100,100);
		int chOne=a;
		System.out.println("This child 1 perameterized constructor\n\n"+""+chOne);
	}
	public Sumit_ChildConstructor(int a, int b)
	
	{
		this();
		int chTow=a+b;
		System.out.println("This child 2 perameterized constructor\n\n"+""+chTow);
		
	}
	public Sumit_ChildConstructor(int a, int b, int c)
	{
		this(100);
		int chThree=a+b+c;
		System.out.println("This child 3 perameterized constructor\n\n"+""+chThree);
	}
	public static void main(String[] args) {
		
		Sumit_ChildConstructor chilCunst = new Sumit_ChildConstructor(50,50);
	}
	

}
