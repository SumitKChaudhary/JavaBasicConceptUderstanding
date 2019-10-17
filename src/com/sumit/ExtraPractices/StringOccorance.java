/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 15-Oct-2019
 *  FILE NAME  		: 	 StringOccorance.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringOccorance 
{
	public static Map<Character, Integer> freqCount(String giveString)
	{
		
		giveString = giveString.replace(" ", " ");
		
		Map freqCount = new LinkedHashMap<>();
		
		for(char eachCharacter : giveString.toCharArray())
		{
			if(freqCount.containsKey(eachCharacter))
			{
				freqCount.put(eachCharacter, (Integer)
				freqCount.get(eachCharacter)+1);
			}
			else
			{
				freqCount.put(eachCharacter, 1);
			}
		}
		
		return freqCount;
		
	}
	public static void main(String[] args) {
		
		Map chr=freqCount("Programming");
		
		System.out.println(chr);
		
	}

}
