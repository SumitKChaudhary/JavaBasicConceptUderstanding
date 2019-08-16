/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Jul-2019
 *  FILE NAME  		: 	 Main.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;

class Base 
{
	int x ;
	
	Base(int _x)
	{
		x=_x;
	}

}

class Derived extends Base
{
	int y; 
	Derived(int _x, int _y)
	{
		super(_x);
		y= _y;
	}
	void Display()
	{
		System.out.println("X="+x+",y="+y);
	}
}

public class Main
{
	public static void main(String[] args) {
		Derived d = new Derived(10,20);
		
		d.Display();
		
	}
}


