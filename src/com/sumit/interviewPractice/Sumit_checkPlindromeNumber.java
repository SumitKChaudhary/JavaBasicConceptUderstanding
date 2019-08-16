/*Author		:		 Sumit kumar
 * Class for 	:		 Check the user enter number palindrome or not
 * Created date	:			23.3.2019
 * */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class Sumit_checkPlindromeNumber 
{
	
	public static void main(String[] args) 
	{
		String orginalNumber; // 
		String afterReverse = "";
		
		
		System.out.println("Enter the number for checking is plindrome or Not\n");
		
		Scanner sc= new Scanner(System.in);
		
		orginalNumber=sc.nextLine();// getting the user input
		
		int length = orginalNumber.length();// checking the entered number length 
		
		for (int i=length - 1; i>=0; i-- )  // divide in character and reverse the entered value
		{
			afterReverse = afterReverse+orginalNumber.charAt(i);// store in the i variable after reverse
		}
		
		if (orginalNumber.equals(afterReverse))// compare the entered value and reverse value 
		{
			System.out.println("Entered number is palindrome ");
		}
		else
		{
			System.out.println("Entered number is not palindrome becouse entered number is \n"+afterReverse+"\n"+"not match after reverse");
		}
		
		
		
	}

}
