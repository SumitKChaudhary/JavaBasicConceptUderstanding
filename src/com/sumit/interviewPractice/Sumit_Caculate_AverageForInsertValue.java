/**sumitkumar
 Sumit_Caculate_AverageForInsertValue.java
 * 29-Mar-2019
 */
package com.sumit.interviewPractice;

import java.util.Scanner;

/**
 * @author sumitkumar
 *
 */
public class Sumit_Caculate_AverageForInsertValue 
{
	public static void main(String[] args) {
		
		System.out.println("How many number you want to enter");
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt(); 
		
		double[] arr= new double[n];
		
		double total=0;
		
		for (int i=0; i<arr.length; i++)
		{
			System.out.print("Enter the element of "+(i+1)+":");
			arr[i]=sc.nextDouble();
		}
		sc.close();
		
		for(int i=0; i<arr.length;i++)
		{
			total = total+arr[i];
		}
		
		double average = total/arr.length;
		
		System.out.format("The average of : %.3f",average);
		
	}

}
