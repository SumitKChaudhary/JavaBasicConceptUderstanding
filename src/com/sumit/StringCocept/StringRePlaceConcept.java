/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 07-Sep-2019
 *  FILE NAME  		: 	 StringPlaceConcept.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.StringCocept;

import java.util.Scanner;
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



		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key");
		String actualKey=null;

		System.out.println("Enter the value");
		String replaceValue=null;
		String s=null;
			for(int i=0; i<actualData.length(); i++) {

				actualKey=sc.nextLine();
				replaceValue=sc.nextLine();
			s =relaceString(actualData, actualKey, replaceValue);

			}

			System.out.println(s);
			
	
	}

}