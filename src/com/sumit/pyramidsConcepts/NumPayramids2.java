/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 14-Aug-2019
 *  FILE NAME  		: 	 Payramids4.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.pyramidsConcepts;
public class NumPayramids2
{
	public static void main(String[] args) 
	{
		int num=1; 
		for (int i=0; i<=4; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(num+" ");
			   num=num+1;
				
			}
			System.out.println();
		}
		
		
		
	}

}
