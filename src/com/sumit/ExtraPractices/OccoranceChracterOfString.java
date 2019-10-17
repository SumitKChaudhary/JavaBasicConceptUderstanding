/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Oct-2019
 *  FILE NAME  		: 	 OccoranceChracterOfString.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OccoranceChracterOfString 
{
	public static void main(String[] args) 
	{
		
		Scanner takeStringFromConsole = new Scanner(System.in);
		System.out.println("Please Enter your String to chect Occurance Characters");
		
		String enteredString = takeStringFromConsole.nextLine();
		
		char[] charactersOfString = enteredString.toCharArray();
		
		Map<Character, Integer> map = new HashMap();
		
		for(char eachStringCharacter : charactersOfString)
		{
			if(map.containsKey(eachStringCharacter))
			{
				int counter = map.get(eachStringCharacter);
				
				map.put(eachStringCharacter, ++counter);
			}
			else 
			{
				map.put(eachStringCharacter, 1);
			}
		}
		
		System.out.println("Duplicate Character from the string");
		
		for(char duplicateCharacter : map.keySet())
		{
			if(map.get(duplicateCharacter)>1)
			{
				System.out.println(duplicateCharacter);
			}
		}
		
	}
	

}
