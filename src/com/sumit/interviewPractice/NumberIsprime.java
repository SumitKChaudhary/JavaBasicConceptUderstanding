/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Aug-2019
 *  FILE NAME  		: 	 NumberIsprime.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class NumberIsprime {

	public static void main(String[] args) 
	{
		int  num;
		
		boolean isPrime = true;
		System.out.println("Enter the value to check is prime or not");
		Scanner scanner = new Scanner(System.in);
		
		num=scanner.nextInt();
		for(int i=2; i<num; i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		
		if (isPrime)
		{
			System.out.println("Enter number is prime number \t:\t"+num);
		}
		else
		{
			System.out.println("Enter number is not a prime number\t:\t"+num);
		}
		

	}

}
