/**sumitkumar
 Sumit_CheckArmstrongNumber.java
 * 24-Mar-2019
 */
package com.sumit.interviewPractice;

import java.util.Scanner;
public class Sumit_CheckArmstrongNumber 
{
	public static void main(String[] args) {
		
		System.out.println("Enter the number for check its Armstrong or not");
		
		Scanner sc=new Scanner(System.in);
		
		int num =sc.nextInt();
		int tem = num;
		int sum =0;
		while(num > 0)
		{
			int rem=num % 10;
			
			sum = sum +(rem * rem * rem );
			
			num = num /10;
					
		}
		if (tem == sum)
		{
			System.out.println("Entered numbe "+tem+" is armstrong");
		}
		else
		{
			System.out.println("Entered numbe "+tem+" is not armstrong");  
		}
		
		
	}

}
