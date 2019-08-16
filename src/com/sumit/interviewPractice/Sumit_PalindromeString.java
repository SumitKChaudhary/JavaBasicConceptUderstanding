/*sumitkumar
20-Jun-2019
12:19:26 am
 * @author sumitkumar
 *
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class Sumit_PalindromeString 
{
	
	public static String findPalindromString(String orignalString)
	{
		
		
		String afterRevers1 = " 	";
		
		for (int i =orignalString.length()-1 ; i >=0; i--)
		{
			afterRevers1= afterRevers1+ orignalString.charAt(i);
		}
		
		if (orignalString.equals(afterRevers1))
		{
			System.out.println("Entered No is Palindrome\t:\t"+orignalString);
		}
		else
		{
			System.out.println("not palindrome bcoz after rever values is\t:\t "+afterRevers1);
		}
		
		return afterRevers1 ; 
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter you string which you want to check \t:\t");
		
		Scanner sc = new Scanner(System.in);
		
		String my = sc.nextLine();
					
		Sumit_PalindromeString.findPalindromString(my);
	}

}
