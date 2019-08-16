package com.sumit.interviewPractice;

public class Sumit_Fibonacciseries {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		int a=0, b=1, c=0;
		
		
		for(int i=0; i<=10; i++)
		{
			System.out.print(a+ " + ");
			c=a+b;
			a=b;
			b=c;
			
		}
			
		

	}

}
