/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 07-Sep-2019
 *  FILE NAME  		: 	 StringPlaceConcept.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.StringCocept;

import java.util.regex.Pattern;

public class StringRePlaceConcept 
{
	
	public static String relaceString(String actualString, String searchValue, String replaceWith) {
		
		String dataReplaced= actualString.replaceAll(Pattern.quote("{{"+searchValue+"}}"), replaceWith);

		return dataReplaced; 
	}
	
	
	public static void main(String[] args) 
	{
	
			String actualData = "Hi, I'm {{name}}, I'm {{designation}}";
			
			String[] relacedData = actualData.split(" ");
			
			for(int i=0; i<relacedData.length; i++)
			{
				System.out.println(i+" "+relacedData[i]);
			}
			
			
	
	}

}