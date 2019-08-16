package com.sumit.PracticeAssignments;
/* @author 				:   Sumit Kumar
 * Class Create Date	;	3-3-2018
 * Class Name			:	Sumit_CalculaitionAssignment2
 * Assignment			:	(((((10-2)+2)+2)/2)*2)
 * 
 * */

public class Sumit_CalculationAssignment2 
{
	
		
		public int substraction(int a, int b)
		{
			return a-b;
		}
		public int sum(int a, int b)
		{
			
			return a+b;
		//	System.out.println("");
		}

		public int divition(int a, int b)
		{
			return a/b;
		}
		public void multiplication(int a, int b)
		{
			
			int c ;
			c= a*b;
			System.out.println("Result of (((((10-2)+2)+2)/2)*2)\n"+c);
		}
		public static void main(String[] args)
		{
			Sumit_CalculationAssignment2 resultSecondAssingment=new Sumit_CalculationAssignment2();

			
			int sub_Result=resultSecondAssingment.substraction(10, 2);
			System.out.println(sub_Result);
			int sum_Result=resultSecondAssingment.sum(sub_Result, 2);
			int sum_Result2=resultSecondAssingment.sum(sum_Result, 2);// call the sum method second time 
			int div_Result=resultSecondAssingment.divition(sum_Result2, 2);
			
			resultSecondAssingment.multiplication(div_Result, 2);
			/* notes 
			we can't write any statement after return, for example try to write syso after return in a method it will give a error, 
			because after returning control will go to the method which has called it. For example there is a method sum which is returning 
			a result, from main method we have called the sum method and in sum method we are returning the result so after return statement
			control will go to the main method as we are calling from the main method so no statement will work after return in a method.*/
					
					
			
		}

}
