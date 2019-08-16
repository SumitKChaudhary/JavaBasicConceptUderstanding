/**sumitkumar
 Sumit_SingleCondition.java
 * 01-Apr-2019
 */
package com.sumit.Conditions;

import java.util.Scanner;

/**
 * @author sumitkumar
 * only if
 */
public class Sumit_SingleCondition
{
	public static void main(String[] args) {
		
		int a; 
		System.out.println("Please enter the value for check odd or even");
		
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Entered value is even");
		}
	}

}
