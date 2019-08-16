/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 05-Aug-2019
 *  FILE NAME  		: 	 PrintTable.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class PrintTable 
{
	public static void main(String[] args) {
		
		int a,b = 0; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number to print a table");
		
		a=sc.nextInt();
		
		for(int i=1; i<=10;i++)
		{
			 b=a*i;
			 System.out.println(a+" * "+i+" = "+b);
			
		}
		
	}

}
