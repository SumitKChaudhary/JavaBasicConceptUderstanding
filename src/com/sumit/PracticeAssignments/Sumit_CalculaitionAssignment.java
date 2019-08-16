package com.sumit.PracticeAssignments;
/* @author 				:   Sumit Kumar
 * Class Create Date	;	3-3-2018
 * Class Name			:	Sumit_CalculaitionAssignment
 * Assignment			:	((((10+2)-2)*2)/2)
 * 
 * */


public class Sumit_CalculaitionAssignment 
{
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	public int subtraction(int a, int b)
	{
		
		return a-b;
	}

	public int multiplication(int a, int b)
	{
		return a*b;
	}
	public void div(int a, int b)
	{
		
		int c ;
		c= a/b;
		System.out.println("Result of ((((10+2)-2)*2)/2)\n"+c);
	}
	public static void main(String[] args)
	{
		Sumit_CalculaitionAssignment result=new Sumit_CalculaitionAssignment();
		
		int result_Sum=result.sum(10, 2);
		int result_Subtraction=result.subtraction(result_Sum, 2);
		int result_Multiplication=result.multiplication(result_Subtraction, 2);
		
		result.div(result_Multiplication, 2);
		
				
		
	}

}
