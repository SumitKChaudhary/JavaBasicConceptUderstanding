/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Oct-2019
 *  FILE NAME  		: 	 OccaranceCharacter.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;
public class OccaranceCharacter 
{
	public static void main(String[] args) {
		
		String s= "Sumiiiit";
		
		char c = 0;
		int i=0,j=0;
		for( i=0;i<s.length(); i++)
		{
			c=s.charAt(i);
			if(s.charAt(i)==c)
			{
				j++;
			}
		}
		
		
		System.out.println(c);
		
	}
	

}
