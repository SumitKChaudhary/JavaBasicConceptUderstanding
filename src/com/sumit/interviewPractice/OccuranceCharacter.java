/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 09-Aug-2019
 *  FILE NAME  		: 	 OccuranceCharacter.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class OccuranceCharacter 
{
	public static void main(String[] args) {
		String str = "Programming";
		
		char[] chr= str.toCharArray();
		
		Map<Character, Integer> map = new HashMap();
		for (char c: chr)
		{
			if(map.containsKey(c))
			{
				int counter =map.get(c);
				
				map.put(c, ++counter);
				
			}
			else
			{
				map.put(c, 1);
			}
		}
		
		
		System.out.println("Duplicate Character");
		
		for(char c: map.keySet())
		{
			if(map.get(c)>1)
			{
				System.out.println(c);
			}
			
		}
	}

}
