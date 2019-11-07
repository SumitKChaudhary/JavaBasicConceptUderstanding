/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Oct-2019
 *  FILE NAME  		: 	 NumberShorting.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;

import java.util.Arrays;

public class NumberShorting 
{
	
	public static void main(String[] args) 
	{
		int a[]= {1,0,1,0,1,0,1,0,1,0,1,0};
		
		Arrays.sort(a);
		
		
		String s = Arrays.toString(a);
		
		
		String ss[]=s.split(",");
		for(int i=0; i<ss.length; i++)
		{
			System.out.print(ss[i]);
		}
		
		 
		
		
		
		
		
		//System.out.println(Arrays.toString(a));
		
		
	}
		
		
}


