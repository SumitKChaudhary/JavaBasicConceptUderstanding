/**sumitkumar
 Sumit_IfelseCondition.java
 * 01-Apr-2019
 */
package com.sumit.Conditions;

import java.util.Scanner;

/**
 * @author sumitkumar
 * if else condition
 */
public class Sumit_IfelseCondition 
{
	public static void main(String[] args) 
	{
		System.out.println("Please inter two value and compare which is greater end small");
		
		int a, b;
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		
		if(a<b)
		{
			System.out.println("First is small value "+" "+a);
		}
		else
		{
			System.out.println("first is greatest value to second"+" "+a);
		}
		
	}

}
