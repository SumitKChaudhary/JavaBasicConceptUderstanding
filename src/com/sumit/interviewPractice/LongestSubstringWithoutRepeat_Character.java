
package com.sumit.interviewPractice;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author sumitkumar
 *	DATE       		:	 23-Jun-2019
 *  FILE NAME  		: 	 LongestSubstringWithoutRepeat_Character.java
 *  PROJECT NAME 	:	 InterviewProgramPractice
 *  TIME			:	 7:47:52 pm
 */
public class LongestSubstringWithoutRepeat_Character
{
	public static int lenghtOflongestSubstring(String s)
	{
		int max = 0;
		int j = 0 ;
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for (int i=0; i<s.length(); i++)
		{
			if (map.containsKey(s.charAt(i)))
			{
				j=Math.max(j, map.get(s.charAt(i))+1);
			}
			map.put(s.charAt(i), i);
			max=Math.max(max, i-j+1);
			//System.out.println(s);
		}
		
		return max; 
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		String enterStr = sc.nextLine();
		
		int len= LongestSubstringWithoutRepeat_Character.lenghtOflongestSubstring(enterStr);
		
		System.out.println(len);
		
		
	}

}
