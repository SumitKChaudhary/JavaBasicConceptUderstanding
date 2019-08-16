/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 24-Jul-2019
 *  FILE NAME  		: 	 BasicSintax.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class sum1
{
	int c; 
	
	public void sum(int a, int b)
	{
	
		this.c= a+b;
	}
	public static void main (String[] args) 
	{
		sum1 s = new sum1();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		s.sum(a, b);
		
		System.out.println(s.c);
		
		
		
	}

}
