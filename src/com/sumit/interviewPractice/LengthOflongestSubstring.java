/**sumitkumar
 LengthOflongestSubstring.java
 * 23-Jun-2019
 */
package com.sumit.interviewPractice;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author sumitkumar
 *	DATE       		:	 23-Jun-2019
 *  FILE NAME  		: 	 LengthOflongestSubstring.java
 *  PROJECT NAME 	:	 InterviewProgramPractice
 *  TIME			:	 8:10:5
 *  Assignment		:	AgriChain Assignment 1 
 */
public class LengthOflongestSubstring 
{
	 static int findLongestSubstring(String str)
	{
		char[] charArray = str.toCharArray();
		
		String logestSubstring = null;
		int longestSubstringLength = 0;
		
		
		
		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		
		for (int i=0; i<charArray.length; i++)
		{
			char ch = charArray[i];
			if (!charPosMap.containsKey(ch))
			{
				charPosMap.put(ch, i);
			}
			else
			{
				i = charPosMap.get(ch);
				charPosMap.clear();
			}
			
			if (charPosMap.size()>longestSubstringLength)
			{
				longestSubstringLength= charPosMap.size();
				logestSubstring = charPosMap.keySet().toString();
			}
		}
		System.out.println("Input String \t:\t "+str);
		System.out.println("The longest Substring\t:\t"+ logestSubstring);
		System.out.println("The longest String lenght\t:\t"+longestSubstringLength);
		return longestSubstringLength;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String enterString = sc.nextLine();
		findLongestSubstring(enterString);
	}

}
