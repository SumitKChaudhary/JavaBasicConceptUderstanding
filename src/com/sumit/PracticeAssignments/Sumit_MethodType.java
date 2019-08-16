package com.sumit.PracticeAssignments;
/* @author 				:   Sumit Kumar
 * Class Create Date	;	3-3-2018
 * Class Name			:	Sumit_MethodType
 * 
 * */

public class Sumit_MethodType
{
	public int sum(int a, int b)
	//a and b is a  parameterized its return the integer value with the help of  sum method. 
	{
	
		int c=a+b;
		System.out.println("Result of sum "+c);
		return c;
		
		//return a+b .....we can write this type to 
	}
	public int sub(int a, int b)// default method 
	{
		int c=a-b;
		System.out.println("Result of subtraction "+c);
		return c;
		
		//return a-b .....we can write this type to 
	}
	public void mult(int a, int b)
	{
		int c ;
		c=a*b;
		System.out.println("Final result is "+c);
		//return a*b .....we can write this type to 
	}
	public static void main(String[] args)
	{
		
		Sumit_MethodType obj=new Sumit_MethodType();// here create an object
		//ClassName referenceVariable=new ClassName()
		// New is create a variable for class
		
		int sum_result = obj.sum(10, 2);//called the sum method
		//sum_result store a sum value so be can use in further
		
		
		int sub_result = obj.sub(12, 2);// called the sub method
		//sub_result store a sub value so be can use in further 
		
		obj.mult(sum_result, sub_result);//called the mult method
		
		
	}

}
