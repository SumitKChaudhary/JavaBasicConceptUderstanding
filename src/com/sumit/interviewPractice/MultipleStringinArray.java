/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Sep-2019
 *  FILE NAME  		: 	 MultipleStringinArray.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class MultipleStringinArray 
{
	
	public static void main(String[] args) 
	{
		ArrayList<String> name = new ArrayList<>();
		
		System.out.println("Enter your name");
		
		Scanner sc = new Scanner(System.in);
		
		int a=0; 
		for(int i=0; i<5; i++)
		{
			name.add(sc.nextLine());
			a++;
		}
		
		for (String nam : name)
		{
			System.out.println(a+" "+nam);
		}

		
	}

}
