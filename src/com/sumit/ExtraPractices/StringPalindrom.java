/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Oct-2019
 *  FILE NAME  		: 	 StringPalindrom.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;

import java.util.Scanner;

public class StringPalindrom 
{
	public static void main(String[] args) 
	{
		Scanner takeInput = new Scanner(System.in);
		
		System.out.println("Enter the string to check whether it is palindrome or not");
		
		String enterString = takeInput.nextLine();
		
		String reverseString ="";
		
		for(int i=0; i<enterString.length(); i++)
		{
			reverseString=reverseString+enterString.charAt(i);
		}
		
		if(enterString.equals(reverseString))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("is not palindrom");
		}
	}

}
