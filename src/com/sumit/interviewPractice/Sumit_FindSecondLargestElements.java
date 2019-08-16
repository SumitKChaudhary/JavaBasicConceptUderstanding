package com.sumit.interviewPractice;

import java.util.Scanner;

public class Sumit_FindSecondLargestElements
{
	static int total1;
	public static Scanner sc = new Scanner(System.in);
	public static int n=0; 
	
	public static int secondLargestNo(int [] arr, int total)
	{
			//this.total=total;
		total1=total;
		 
		int temp; 
		
		for(int i= 0 ; i<total ; i++)
		{
			for (int j= i ; j< total; j ++)
			{
				if (arr[i]> arr[j])
				{
					temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;					
					
				}
			}
			
		}
		return arr[total-1]; 
	}
	public static void main(String[] args) 

	{
	
		System.out.println("How much number you want to enter for shorting \t:\t\t");
		
		n= sc.nextInt();

		int a[]= new int [n];
		System.out.println("Enter all elements to find out the second largest no \t:\t\t");
		for (int i = 0 ; i<n ; i++)
		{
			a[i]= sc.nextInt();
			
		}
		
		
		total1 = a.length;
		System.out.println("Your total numbers is \t:\t"+total1);
		
		System.out.println("Second largest no \t:\t"+secondLargestNo(a, total1));
	}

}
