/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 05-Aug-2019
 *  FILE NAME  		: 	 ArmstrongNumber.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args) 
	{
		int number, orignalNum, reminder, result=0 ;
		
		
		Scanner sc = new Scanner(System.in);
		
		number=sc.nextInt();
		
		orignalNum=number;
		
		while(orignalNum!=0)
		{
			reminder = orignalNum%10;
			result+= reminder*reminder*reminder;
			orignalNum /=10;
		}
		
		if (result == number)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not armstrong");
		}
	}

}
