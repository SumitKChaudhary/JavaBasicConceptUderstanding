/**sumitkumar
 Sumit_CheckNumerOddEvent.java
 * 28-Mar-2019
 */
package com.sumit.PracticeAssignments;

import java.util.Scanner;

public class Sumit_CheckNumerOddEven
{

	public static void main(String[] args) {
		
		int a ; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number for check odd or event");
		
		a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Enter number is even "+a);
		}
		else
		{
			System.out.println("Enter numer is odd"+a);
		}
	}
}
