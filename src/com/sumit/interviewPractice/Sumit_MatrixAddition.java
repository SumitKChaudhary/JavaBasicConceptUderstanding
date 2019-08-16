package com.sumit.interviewPractice;

public class Sumit_MatrixAddition
{
	public static void main(String[] args) 
	{
		int a[] []= {
					 	{1,4,7},
					 	{2,5,8},
					 	{3,6,9}
					 };
		
		int b[] []= {
				 		{1,4,7},
				 		{2,5,8},
				 		{3,6,9}
				    };
		
		int c [] [] = new int [3][3];
		
		for (int i=0; i<3; i++)
		{
			for (int j=0; j<3; j++)
			{
				c[i][j]= a[i][j]+b[i][j];
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
