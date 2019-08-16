/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Aug-2019
 *  FILE NAME  		: 	 FabbonaccieSeriese.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class FabbonaccieSeriese 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1; 
		int c=0;
		System.out.println("Enter the range of number");
		int numRange; 
		
		Scanner sc = new Scanner(System.in);
		
		numRange=sc.nextInt();
		
		for (int i=0; i<=numRange; i++)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		
	}

}
