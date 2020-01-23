/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 18-Oct-2019
 *  FILE NAME  		: 	 ReverseString.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;
public class ReverseString 
{
	public static void main(String[] args) 
	{
		String str="Sumit kumar";




		char[] chars = str.toCharArray();

		for(int i=chars.length-1; i>=0; i--)
		{
			System.out.print(chars[i]);
		}

	}

	

}
