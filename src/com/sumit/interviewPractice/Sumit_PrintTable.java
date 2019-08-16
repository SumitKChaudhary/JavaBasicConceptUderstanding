/**sumitkumar
 Sumit_PrintTable.java
 * 24-Mar-2019
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class Sumit_PrintTable 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number for print mathmetical table");
		
		int a=sc.nextInt();
	//	int num=0;
		System.out.println(a+"Entered table is  ");
		
		for (int i=1; i <=10; i++)
		{
			System.out.println(a+" X "+ i + " = " + (a*i));
					
		}
		
	}

}
