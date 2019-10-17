/**
 * @author 			:	 sumitkumar
 *	DATE       		:	 13-Oct-2019
 *  FILE NAME  		: 	 OccaranceCharacter.java
 *  PROJECT NAME 	:	 JavaBasicConceptUderstanding
 * 
 */
package com.sumit.ExtraPractices;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class OccaranceCharacter 
{
	public static void main(String[] args) 
	{
		 String str = "Aeeeees";
		 
		 Map<Character, Integer> map = new HashMap<>();
		char[] characterOfString=str.toCharArray();
		
		for(char ch: characterOfString)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch, 1);
			}
			else
			{
				int cht = map.get(ch);
				map.put(ch, cht+1);
			}
		}
		
		System.out.println(map);
	}
	

}
