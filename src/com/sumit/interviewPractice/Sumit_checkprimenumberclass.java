
package com.sumit.interviewPractice;

import java.util.Scanner;

public class Sumit_checkprimenumberclass 
{

	public static void main(String[] args)
	{
		int num;
		boolean isPrime = true;// check the true and false
		
		System.out.println("Please enter the number for check its prime or not\n ");
		
		Scanner sc=new Scanner(System.in);
		
		//Capture the user input 
		num=sc.nextInt();
		
		// Divide by 
		for (int i=2; i<=num/2; i++)
		{
			//check if number reminder is 0 or not
			if (num%i == 0)
			{
				isPrime=false;
				break;
			}
		
		}
		
		if(isPrime)
		{
			System.out.println("Your entered number is prime");
		}
		else
		{
			System.out.println("Your entered number is not prime");
		}
	
	}

}
