package com.sumit.interviewPractice;
/*@ Author : sumit Kumar Chaudahry
 * Date 	:	20-4-19
 * Program	:	Add two matrix from input numbers
 * */

import java.util.Scanner;

public class Sumit_InputNumberAddMatrix 
{
	public static void main(String[] args) 
	{
		
		int i, j,c,r;
		
		System.out.println("Enter the number for Column and Row for Create a matrix");
		
		Scanner  sc = new Scanner(System.in); 
		
		
		c=sc.nextInt(); 
		r=sc.nextInt();
		
		int firstMatrix [][]= new int [c][r];
		int secondMatrix [][]= new int [c][r];
		int sum [][] = new int [c][r];
		
		System.out.println("Enter the numbers for first Matrix/n");
		
		for (i=0 ;i<c; i++)
		{
			for (j=0; j<r; j++)
			{
				firstMatrix [i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the numbers for Second Matrix/n");
		
		for (i=0 ;i<c; i++)
		{
			for (j=0; j<r; j++)
			{
				secondMatrix [i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Your entered matrix numbers addition is/n ");
		
		for (i=0 ;i<c; i++)
		{
			for (j=0; j<r; j++)
			{
				sum [i][j]=firstMatrix[i][j]+ secondMatrix[i][j];
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		
	}

}
