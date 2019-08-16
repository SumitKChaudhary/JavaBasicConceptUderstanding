/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 26-Jul-2019
 *  FILE NAME  		: 	 Calculation.java
 *  PROJECT NAME 	:	 ExtraCodingPractice
 * 
 */
package com.sumit.interviewPractice;
public class Calculation 
{
	public static int addition (int a, int b)
	{
		int c=a+b;
		return c;
	}
	public static int substraction (int a, int b)
	{
		int c=a-b;
		
		return c;
	}public static int divisiion (int a, int b)
	{
		int c=a/b;
		
		return c;
	}public static int multiplication (int a, int b)
	{
		int c=a*b;
		
		return c;
	}
	
	public static void main(String[] args) {
	
		int add = addition(2, 3);	
		
		System.out.println("Addision: "+add);
		
		int sub = substraction(3, 3);
		
		System.out.println("sub"+sub);
		
		int div = divisiion(6, 2);
		System.out.println("Division"+div);
		
		int multi = multiplication(3, 2);
		
		System.out.println(multi);
		
		
		
		
		
	}

}
