/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 14-Aug-2019
 *  FILE NAME  		: 	 NumPayramids1.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.pyramidsConcepts;
public class NumPayramids1 
{
	public static void main(String[] args) 
	{
		
		for (int i=1; i<=5; i++)
		{
			for (int j=1; j<i+1; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
