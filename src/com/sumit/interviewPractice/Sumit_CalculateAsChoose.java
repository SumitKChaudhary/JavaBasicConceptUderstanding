package com.sumit.interviewPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Sumit_CalculateAsChoose 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two Values to perform action");	
		int a=0, b=0, c=0;
		Scanner sc = new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		
		System.out.println("Choose the action which you want perform");
		String [] action = {"1. Add", "2. Substration","3. Multiplication", "4. Substration" };
		
		Arrays.stream(action).forEach(System.out::println);
		System.out.println();
		int calculateValue = sc.nextInt();
		 
		
		switch (calculateValue) {
		case 1:
			System.out.println(calculateValue+". You chose Addition");
			c=a+b;
			System.out.println("Addition Value is : "+c);
			break;
		case 2:
			c=a-b;
			System.out.println("Substraction Value is : "+c);
			break;
		case 3:
			c=a*b;
			System.out.println("Multiplication Value is : "+c);
			break;
		case 4:
			c=a/b;
			System.out.println("Devision Value is : "+c);
			break;

		default:
			System.out.println("You choose wrong option please select from given");
			break;
			
			
		}
		
	}
	

}
