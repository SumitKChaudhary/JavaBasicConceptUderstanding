/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Aug-2019
 *  FILE NAME  		: 	 PlindromeNumber.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class PlindromeNumber 
{
	public static void main(String[] args) 
	{
		String realNumber;
		
		String reversNumber = "";
		
		System.out.println("Enter you number to check plindrom Or not");
		Scanner sc = new Scanner(System.in);
		
		
		realNumber=sc.nextLine();
		
		int length = realNumber.length();
		
		for (int i=length - 1; i>=0; i--)
		{
			reversNumber= reversNumber+realNumber.charAt(i);
		}
		
		if(realNumber.equals(reversNumber))
		{
			System.out.println("Plaindrome");
		}
		else
		{
			System.out.println("Not plaindrom");
		}
		
	}

}
