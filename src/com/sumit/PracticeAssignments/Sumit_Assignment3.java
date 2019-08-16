package com.sumit.PracticeAssignments;
/* @author 				:   Sumit Kumar
 * Class Create Date	;	3-3-2018
 * Class Name			:	Sumit_CalculaitionAssignment3
 * Assignment			:	(((((10+2)-2)+2)*2)/2)
 * 
 * */


public class Sumit_Assignment3
{
	public int sum(int a, int b)
	{
		
		return a+b;
	}
	public int substraction(int a, int b)
	{
		return a-b;
	}
	public int multiplication(int a, int b)
	{
		return a*b;
	}
	public void divition(int a, int b)
	{
		
		int c ;
		c= a/b;
		System.out.println("Result of (((((10+2)-2)+2)*2)/2)\n"+c);
	}
	public static void main(String[] args)
	{
		Sumit_Assignment3 resultThiredAssingment=new Sumit_Assignment3();

		
		int sum_Result=resultThiredAssingment.sum(10, 2);
		int sub_Result=resultThiredAssingment.substraction(sum_Result, 2);
		int sum_Result2=resultThiredAssingment.sum(sub_Result, 2);// call the sum method second time 
		int div_Result=resultThiredAssingment.multiplication(sum_Result2, 2);
		
		
		resultThiredAssingment.divition(div_Result, 2);
		
		
				
		
	}

}
