/*AuthoR	:	sumitkumar
* Date		:	20-Jun-2019
* Time		:	12:02:23 am
* Program for :		Count the occurance using word*/
package com.sumit.interviewPractice;

public class Sumit_StringOccurencesWord
{
	static int countOccurences (String str, String word)
	{
		String a[] = str.split(" ");
		
		int count =0;
		
		for (int i=0; i<a.length; i++)
		{
			if (word.equals(a[i]))
			{
				count ++; 
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) 
	{
		
		String str = "Sumit is a good boy and Sachin also is a good boy";
		
		String word = "good";
		
		System.out.println(countOccurences(str, word));
		
	}

}
