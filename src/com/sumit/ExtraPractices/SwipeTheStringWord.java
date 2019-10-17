/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Oct-2019
 *  FILE NAME  		: 	 SwipeTheStringWord.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;
public class SwipeTheStringWord 
{
	public static void main(String[] args) 
	{
		String str = "My name is sumit";
		
		String str2 ="";
		for(int i=str.length()-1; i>=0;i--)
		{
			str2=str2+str.charAt(i);
			
			
		}
		System.out.println(str2);
		
		
	}

}
