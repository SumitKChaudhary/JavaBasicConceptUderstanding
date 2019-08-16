package com.sumit.interviewPractice;

import java.util.Arrays;

public class FindSecondLargest 
{
	public static void main(String[] args) 
	{
		int arr[]= {1,4,6,3,2,5};
		
		 Arrays.sort(arr);
		 
		 
		 System.out.println("First largest no from the array list \t:\t\t"+arr[arr.length-1]);
		 System.out.println("Second largest no from the array list \t:\t\t"+arr[arr.length-2]);
		 System.out.println("Third largest no from the array list \t:\t\t"+arr[arr.length-3]);
		
	}

}
