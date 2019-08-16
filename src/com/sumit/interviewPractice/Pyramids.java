
/**
 * sumitkumar
 * 15-Jun-2019
 * 9:36:23 pm
 */
package com.sumit.interviewPractice;

/**
 * @author sumitkumar
 *
 */
public class Pyramids
{
	public static void main(String[] args) 
	{
		for (int i=0; i<=5; i++)
		{
			for (int j=1; j<=5-i;j++)
			{
				System.out.print(" ");
			}
			for (int k=1; k<=2*i-1; k++)
			{
				System.out.print(k);
			}
			System.out.println();
			
		}
		
	}

}
