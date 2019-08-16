/**sumitkumar
 Sumit_Calculate_Average_Of_Numbers_using_Array.java
 * 28-Mar-2019
 */
package com.sumit.interviewPractice;

/* Example ******
 * Input : arr[] = {1, 2, 3, 4, 5} 
 * Sum of the elements is 1+2+3+4+5 =15 
 * Total number of elements is 5. 
 * So average is 15/5 = 
 * Output : 3
 */
public class Sumit_Calculate_Average_Of_Numbers_using_Array
{
	public  static double average(int a[], int n)
	{
		int sum=0;
		
		for (int i=0; i<n;i++)
		{
			sum = sum+a[i];	
		}
		return sum/n;
	}
	
	public static void main(String[] args) 
	{
		
		int arr[]= {1,2,3,4,5};
		
		int x=arr.length;
		
		System.out.println("out put is : "+average(arr, x));
		
	}

}
