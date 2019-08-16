/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 04-Aug-2019
 *  FILE NAME  		: 	 SwapNumbers.java
 *  PROJECT NAME 	:	 ReviseJava
 * 
 */
package com.sumit.interviewPractice;
import java.util.Scanner;
public class SwapNumbers 
{
	//Initialize the two variable here
	int a=0, b=0, temp=0;
	//take scanner class for take input from console
	Scanner sc = new Scanner(System.in);
	
	//create method for store the enter values 
	public void storeValues()
	{
		System.out.println("Please Enter A values");
		a=sc.nextInt();
		b=sc.nextInt();
		//Print the entered value for confirmation 
		System.out.println("Without Swap values\n"+"A = :"+a+"\t"+"B= :"+b);
	}
	//Create method for swap values without using temp variable 
	public void withoutThiredVariable() {
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap values without thired variable\n"+"A = :"+a+"\t"+"B= :"+b);
	}
	//Create method for swap values with using temp variable 
	public void withThiredVariable() {
		
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swap values without thired variable\n"+"A = :"+a+"\t"+"B= :"+b);
	}
	public static void main(String[] args) 
	{
		//create class for call the all method 
		SwapNumbers refObj = new SwapNumbers();
		//call the store method
		refObj.storeValues();
		//call the with temp variable method 
		refObj.withThiredVariable();
		//call the without temp variable
		refObj.withoutThiredVariable();	
		
	}
}
