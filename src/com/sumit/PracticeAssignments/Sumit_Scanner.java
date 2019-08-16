package com.sumit.PracticeAssignments;

import java.util.*;

public class Sumit_Scanner
{
	public static void main(String[] args) {
		
		int a,b,c;
		
		
		
		System.out.println("Please enter the value of first value\n");
		
		Scanner sc=new Scanner(System.in);
		
		//System.in is mendatory in case of scanner class
		// System.in help to store a entered value
		
		a=sc.nextInt();
		
		System.out.println("Please enter the value of second value\n");
		
		b=sc.nextInt();
		//Entered by user value strored in a and b integer type variables
		
		c=a+b;
		System.out.println("Sum of both given value\n"+c);
		
		
	}

}
