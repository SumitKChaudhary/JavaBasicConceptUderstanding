/**sumitkumar
 Sumit_Nested_IF_else.java
 * 02-Apr-2019
 */
package com.sumit.Conditions;

import java.util.Scanner;

/**
 * @author sumitkumar
 *
 */
public class Sumit_Nested_IF_else
{
	public static void main(String[] args) {
		
		System.out.println("Please enter the mark");
		
		int a ;
		
		Scanner sc =new Scanner(System.in);
		
		a=sc.nextInt();
		
		if (a>=0)  // First Condition: if this condition -- true then check even on odd 
		{
			if (a%2==0)// Condition check after  first -- true -- even
			{
				System.out.println("even number");
			}
			else
			{
				System.out.println("odd number");
			}
		}
		else
		{
			System.out.println("Please enter positive number");
		}
	}

}
