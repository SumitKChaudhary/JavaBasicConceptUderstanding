/**sumitkumar
 Sumit_MutipleConditions.java
 * 01-Apr-2019
 */
package com.sumit.Conditions;

import java.util.Scanner;

/**
 * @author sumitkumar
 * Division finding from the mark
 * else if ladder condition
 *
 */
public class Sumit_MutipleConditions 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter your mark");
		
		int mark ;
		
		Scanner sc =new Scanner(System.in);
		
		mark=sc.nextInt();
		
		if ((mark>=0)&&(mark<=39))
		{
			System.out.println("Fail : You are not passed please try again leter");
		}
		else if((mark>=40)&&(mark<=60))
		{
			System.out.println("THIRED : Congratulation you passed  " +mark);
		}
		else if((mark>=60)&&(mark<=80))
		{
			System.out.println("SECOND : Greate approch keep it up  "+mark);
		}
		else if((mark>=80)&&(mark<=100))
		{
			System.out.println("FIRST : Excellent best of luck for future "+ mark);
		}
		else
		{
			System.out.println("Please enter the mark not out of 100");
		}
			
		
		
		
		
		
	}

}
