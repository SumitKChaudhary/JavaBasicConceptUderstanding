/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 05-Aug-2019
 *  FILE NAME  		: 	 FindFactorial.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class FindFactorial
{
	public static void main(String[] args) 
	{
		int factNum ;
		int limNum;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number ");
		
		factNum=sc.nextInt();
		
		
		if(factNum>2)
		{
			System.out.println("Enter the limit of number");
			limNum=sc.nextInt();
			for(int i=1; i<limNum; i++)
			{
				factNum=factNum*i;
			}
			System.out.println(factNum);
		}
		else
		{
			System.out.println("Please enter number greater then 1");
		}
	}	
}
