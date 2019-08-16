/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 09-Aug-2019
 *  FILE NAME  		: 	 AccuranceCharacter.java
 *  PROJECT NAME 	:	 BasicCoceptUnderstading
 * 
 */
package com.sumit.interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class AccuranceCharacter 
{
	public static void main(String[] args) {
		
		char[] chr= {'a','b','a','b','a','c','a'};
		
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
