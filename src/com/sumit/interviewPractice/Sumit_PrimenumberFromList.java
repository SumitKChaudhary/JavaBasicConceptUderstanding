/**sumitkumar
 Sumit_PrimenumberFromList.java
 * 24-Mar-2019
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

public class Sumit_PrimenumberFromList 
{
	public static void main(String[] args) {
		
		String prime ="";
		
		for (int i=5; i<=50; i++)
		{
			int counter =0;
			for(int num =i; num>=1 ; num--)
			{
				if(i%num==0)
				{
					 counter = counter + 1;
				}
			}
			if (counter == 2)
			{
				prime = prime + i + " ";
			}
		}
		
		System.out.println("Prime are from 5 to 50 \n "+prime);
		
				
				
	}

}
