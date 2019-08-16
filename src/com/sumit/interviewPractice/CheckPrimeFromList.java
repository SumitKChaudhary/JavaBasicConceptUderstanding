/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Aug-2019
 *  FILE NAME  		: 	 CheckPrimeFromList.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class CheckPrimeFromList
{
	public static void main(String[] args) 
	{
		int isPrime = 0; 
		
		int n=0,i=0,count=0;
		
		
		System.out.println("Enter the number of varialbles");
		Scanner sc= new Scanner(System.in);
		
		n=sc.nextInt();
		System.out.println("Enter the numbers for checked is variable or not ");
		
		int[] arr = new int[n];
		
		for ( i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
			int counter =0;
			
			for(int num =arr[i]; num>=1 ; num--)
			{
				if(i%num==0)
				{
					 counter = counter + 1;
				}
			}
			if (counter == 2)
			{
				isPrime = isPrime + i;
			}
			
		}

	
		
		System.out.println("Prime numbers from the list"+isPrime);
		
		
		
		
	
	}

}
