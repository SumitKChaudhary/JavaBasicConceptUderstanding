/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 14-Aug-2019
 *  FILE NAME  		: 	 Payramids5.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.pyramidsConcepts;
public class StarPayramids3 
{
	public static void main(String[] args) 
	{
		int i, j , k=8; 
		for ( i= 0; i<5; i++)
		{
			for ( j=0; j<k; j++)
			{
				System.out.print(" ");
			}
			k= k-2;
			for (j=0; j<=i; j++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

}
